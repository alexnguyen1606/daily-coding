package com.datastucture;


import java.util.Random;

public class Bitset {

    private final int size;
    private boolean[] bits;
    private boolean[] reverseBits;
    private int count;

    public Bitset(int size) {
        this.size = size;
        this.bits = new boolean[size];
        this.reverseBits = new boolean[size];
        for (int i = 0; i < size; i++) {
            reverseBits[i] = true;
        }
        this.count = 0;
    }

    public void fix(int idx) {
        if (bits[idx]) {
            return;
        }
        count++;
        bits[idx] = true;
        reverseBits[idx] = false;

    }

    public void unfix(int idx) {
        if (!bits[idx]) {
            return;
        }
        count--;
        bits[idx] = false;
        reverseBits[idx] = true;

    }

    // Flip 2 times -> do nothing
    //
    public void flip() {
        count = size - count;
        boolean[] temps = reverseBits;
        reverseBits = bits;
        bits = temps;
    }

    public boolean all() {
        return count == size;
    }

    public boolean one() {
        return count > 0;
    }

    public int count() {
        return count;
    }

    public String toString() {
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = bits[i] ? '1' : '0';
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            int numberCheck = new Random().nextInt();
            boolean isEven = (numberCheck & 1) == 0;
            System.out.println(numberCheck + " is isEven: " + isEven);

        }
    }



}