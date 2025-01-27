package org.example;

import org.example.ClassDP.*;
import org.example.Interface.FilterStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez une implémentation de filtrage (1: Standard, 2: NonStandard):");
        int filterChoice = scanner.nextInt();
        FilterStrategy filterStrategy = (filterChoice == 1) ? new StandardFilter() : new ImplNonStandardFilter();

        System.out.println("Choisissez une implémentation de compression (1: SpecificCompressor):");
        int compressorChoice = scanner.nextInt();
        CompressorBase compressor = (compressorChoice == 1) ? new SpecificCompressor() : null;

        if (compressor == null) {
            System.out.println("Compresseur non valide.");
            return;
        }

        ImageHandler imageHandler = new ImageHandler(filterStrategy, compressor);

        int[] imageData = {1, 2, 3, 4, 5};

        System.out.println("Application du filtrage...");
        int[] filteredData = imageHandler.filter(imageData);

        System.out.println("Application de la compression...");
        int[] compressedData = imageHandler.compress(filteredData);

        System.out.println("Filtrage terminé: " + java.util.Arrays.toString(filteredData));
        System.out.println("Compression terminée: " + java.util.Arrays.toString(compressedData));
    }
}