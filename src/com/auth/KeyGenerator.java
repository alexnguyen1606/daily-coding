package com.auth;

import java.security.*;
import java.util.Base64;

/**
 * @author: Nguyen Anh Tuan
 * @created: 4/18/2023
 */

public class KeyGenerator {

    public static void main(String[] args) {
        try {
//            // Generate a RSA key pair with a key size of 2048 bits
//            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
//            keyGen.initialize(1024);
//            KeyPair keyPair = keyGen.generateKeyPair();
//
//            // Get the public and private keys as byte arrays
//            byte[] publicKey = keyPair.getPublic().getEncoded();
//            byte[] privateKey = keyPair.getPrivate().getEncoded();
//
//            // Print the keys as Base64-encoded strings
//            System.out.println("Public key: " + Base64.getEncoder().encodeToString(publicKey));
//            System.out.println("Private key: " + Base64.getEncoder().encodeToString(privateKey));
            verify();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error generating key pair: " + e.getMessage());
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    public static void verify() throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair keyPair = keyGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Create message
        String message = "Hello, world!";

        // Sign the message
        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initSign(privateKey);
        signer.update(message.getBytes());
        byte[] signature = signer.sign();

        // Verify the signature
        Signature verifier = Signature.getInstance("SHA256withRSA");
        verifier.initVerify(publicKey);
        verifier.update(message.getBytes());
        boolean isValid = verifier.verify(signature);
        System.out.println("Signature is valid: " + isValid);
    }


}
