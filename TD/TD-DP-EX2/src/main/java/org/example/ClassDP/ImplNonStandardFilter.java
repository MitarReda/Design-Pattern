package org.example.ClassDP;

import org.example.Interface.FilterStrategy;

public class ImplNonStandardFilter implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        // Exemple : appliquer un traitement basé sur une chaîne de filtre
        return appliquerFiltre("nonStandard", data);
    }

    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Applying non-standard filter: " + filterName);
        return data; // Exemples simples, à adapter selon le besoin
    }
}
