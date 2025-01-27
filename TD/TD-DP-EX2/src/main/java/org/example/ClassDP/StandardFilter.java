package org.example.ClassDP;

import org.example.Interface.FilterStrategy;

public class StandardFilter implements FilterStrategy {
    @java.lang.Override
    public int[] filter(int[] data) {
        return data ;
    }
}
