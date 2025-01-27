package org.example;

import org.example.ClassDP.*;
import org.example.Interface.FilterStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie utilisateur pour choisir les classes d'implémentation
        System.out.println("Choisissez une implémentation de filtrage (1: Standard, 2: NonStandard):");
        int filterChoice = scanner.nextInt();
        FilterStrategy filterStrategy = (filterChoice == 1) ? new StandardFilter() : new ImplNonStandardFilter();

        System.out.println("Choisissez une implémentation de compression (1: SpecificCompressor):");
        int compressorChoice = scanner.nextInt();
        CompressorBase compressor = (compressorChoice == 1) ? new SpecificCompressor() : null;

        // Vérification
        if (compressor == null) {
            System.out.println("Compresseur non valide.");
            return;
        }

        // Création du gestionnaire avec les choix de l'utilisateur
        ImageHandler imageHandler = new ImageHandler(filterStrategy, compressor);

        // Exemple d'image sous forme de tableau
        int[] imageData = {1, 2, 3, 4, 5};

        // Application des traitements
        System.out.println("Application du filtrage...");
        int[] filteredData = imageHandler.filter(imageData);

        System.out.println("Application de la compression...");
        int[] compressedData = imageHandler.compress(filteredData);

        // Affichage des résultats
        System.out.println("Filtrage terminé: " + java.util.Arrays.toString(filteredData));
        System.out.println("Compression terminée: " + java.util.Arrays.toString(compressedData));
    }
}