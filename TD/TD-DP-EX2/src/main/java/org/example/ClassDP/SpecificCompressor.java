package org.example.ClassDP;

public class SpecificCompressor extends CompressorBase{
    @Override
    protected int[] compressDetails(int[] data) {
        System.out.println("Applying specific compression algorithm...");
        return data;
    }
}
