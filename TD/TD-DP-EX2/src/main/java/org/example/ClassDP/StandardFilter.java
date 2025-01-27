package org.example.ClassDP;

import org.example.Interface.FilterStrategy;

public class StandardFilter implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        return data;
    }
}
