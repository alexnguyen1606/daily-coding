package com.secure;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * Nguyen Anh Tuan
 * Date: 21/12/2023
 */
public class RSAKeyPairGenerator {

    private final static KeyPairGenerator generator;
    private final static KeyFactory keyFactory;
    private static final String ALGORITHM = "RSA";

    private static final String publicKeyFilename = "public.key";
    private static final String privateKeyFilename = "private.key";

    static {
        try {
            generator = KeyPairGenerator.getInstance(ALGORITHM);
            generator.initialize(2048);
            keyFactory = KeyFactory.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException, InvalidKeySpecException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException {
        var value = "Xin chào";
        System.out.println(value);
        var encrypted = encryptMessage(value);
        System.out.println(encrypted);
        System.out.println(decryptMessage(encrypted));

    }


    public static String decryptMessage(String messageEncrypted) throws IOException, InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        var privateKeyBytes = Files.readAllBytes(Path.of(privateKeyFilename));
        var privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        var privateKey = keyFactory.generatePrivate(privateKeySpec);

        var cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        var messageEncryptedBase64 = Base64.getDecoder().decode(messageEncrypted.getBytes(StandardCharsets.UTF_8));
        return new String(cipher.doFinal(messageEncryptedBase64), StandardCharsets.UTF_8);
    }

    public static String encryptMessage(String rawMessage) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException, InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException {
        var publicKeyBytes = Files.readAllBytes(Path.of(publicKeyFilename));
        var publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
        var publicKey = keyFactory.generatePublic(publicKeySpec);

        var cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        var encryptedMessageBytes = cipher.doFinal(rawMessage.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedMessageBytes);
    }

    private static void generatePairKey() {
        var keyPair = generator.generateKeyPair();
        try (FileOutputStream fos = new FileOutputStream(publicKeyFilename)) {
            fos.write(keyPair.getPublic().getEncoded());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileOutputStream fos = new FileOutputStream(privateKeyFilename)) {
            fos.write(keyPair.getPrivate().getEncoded());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
