package org.example.ClassDP;

import org.example.Interface.FilterStrategy;

public class ImplNonStandardFilter implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        return appliquerFiltre("nonStandard", data);
    }

    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Applying non-standard filter: " + filterName);
        return data;
    }
}
