package org.example.ClassDP;

import org.example.Interface.FilterStrategy;

public class ImageHandler {
    private FilterStrategy filterStrategy;
    private CompressorBase compressor;

    public ImageHandler(FilterStrategy filterStrategy, CompressorBase compressor) {
        this.filterStrategy = filterStrategy;
        this.compressor = compressor;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public int[] filter(int[] data) {
        return filterStrategy.filter(data);
    }

    public int[] compress(int[] data) {
        return compressor.compress(data);
    }
}
