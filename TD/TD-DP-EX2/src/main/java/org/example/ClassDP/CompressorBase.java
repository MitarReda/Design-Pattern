package org.example.ClassDP;

public abstract class CompressorBase {
    public final int[] compress(int[] data) {
        // Étapes communes
        preProcess(data);
        return compressDetails(data);
    }

    protected void preProcess(int[] data) {
        System.out.println("Preprocessing data...");
    }

    protected abstract int[] compressDetails(int[] data);
}
