package org.algoritmiDiConfronto.Test.GenerazioneCSV;

import org.algoritmiDiConfronto.Bond.Bond;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import java.io.*;
import java.util.*;

import static org.algoritmiDiConfronto.Bond.ParserBond.parseBond;

/**
 * Classe che confronta ogni coppia di molecole contenute in una cartella
 * utilizzando l’algoritmo BondLocalComparison.
 */
public class Bond_TutteLeCoppie {

    public static void main(String[] args) {
        LocalComparison bondLocalComparison = new LocalComparison();
        String folderPath = "src/main/resources/Telomerase/TelomeraseBond";
        String csvPath = "confronti_molecolari_telomerase_bondlocal.csv";

        List<String> nomiFile = new ArrayList<>();
        List<List<Bond>> molecole = new ArrayList<>();

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null || files.length < 2) {
            System.out.println("Cartella non valida o contiene meno di due file.");
            return;
        }

        // Legge tutte le molecole e le salva in memoria
        for (File file : files) {
            if (file.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String sequenza = br.readLine();
                    String struttura = br.readLine();

                    if (sequenza != null && struttura != null) {
                        nomiFile.add(file.getName());
                        molecole.add(parseBond(sequenza, struttura));
                    }
                } catch (IOException e) {
                    System.out.println("Errore nella lettura di " + file.getName());
                    e.printStackTrace();
                }
            }
        }


        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(csvPath))) {
            csvWriter.write("Molecola1,Molecola2,ValoreLocalComparison,Allineamento1,Allineamento2\n");

            for (int i = 0; i < molecole.size() - 1; i++) {
                for (int j = i + 1; j < molecole.size(); j++) {

                    List<Bond> mol1 = molecole.get(i);
                    List<Bond> mol2 = molecole.get(j);

                    List<List<Integer>> matrice = bondLocalComparison.matrix(mol1, mol2);
                    List<List<String>> allineamenti = bondLocalComparison.calcolaAllineamento(mol1, mol2, matrice);

                    int x = bondLocalComparison.maggiorValoreindicex(matrice);
                    int y = bondLocalComparison.maggiorValoreindicey(matrice);
                    int maxVal = matrice.get(x).get(y);

                    //int maxVal= matrice.getLast().getLast();

                    String aligned1 = "\"" + String.join(",", allineamenti.get(0)) + "\"";
                    String aligned2 = "\"" + String.join(",", allineamenti.get(1)) + "\"";


                    csvWriter.write(nomiFile.get(i) + "," + nomiFile.get(j) + "," + bondLocalComparison.valorePercentuale(maxVal,mol1,mol2) + "," + aligned1 + "," + aligned2);
                    csvWriter.newLine();

                }
            }

            System.out.println(" Confronti completati. File salvato in: " + csvPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}