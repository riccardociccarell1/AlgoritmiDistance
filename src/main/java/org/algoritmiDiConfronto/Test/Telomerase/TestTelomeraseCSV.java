package org.algoritmiDiConfronto.Test.Telomerase;

import java.io.*;
        import java.util.*;

import org.algoritmiDiConfronto.algoritmi.GlobalComparison;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;

public class TestTelomeraseCSV {

    public static void main(String[] args) throws IOException {

        String inputFile = "src/main/resources/Telomerase/TelomeraseDatasetMetadata.csv";
        String outputFile = "Telomerase_GlobalComparison.csv";

        List<String> nomiCol0 = new ArrayList<>();
        List<String> nomiCol1 = new ArrayList<>();
        List<String> sequenze = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean primaRiga = true;
            while ((line = br.readLine()) != null) {
                if (primaRiga) {
                    primaRiga = false;
                    continue;
                }
                String[] cols = line.split(",");
                if (cols.length > 9) {
                    nomiCol0.add(cols[0].trim());
                    nomiCol1.add(cols[1].trim());
                    sequenze.add(cols[10].trim());
                }
            }
        }

        GlobalComparison algoritmo = new GlobalComparison();

        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            pw.println("Col0_Molecola1,Col1_Molecola1,Col0_Molecola2,Col1_Molecola2,ValoreAllineamento,Allineamento1,Allineamento2");

            for (int i = 0; i < sequenze.size() - 1; i++) {
                for (int j = i + 1; j < sequenze.size(); j++) {

                    List<Character> seq1 = stringaToListaCaratteri(sequenze.get(i));
                    List<Character> seq2 = stringaToListaCaratteri(sequenze.get(j));

                    List<List<Integer>> matrice = algoritmo.matrix(seq1, seq2);
                    List<List<String>> allineamenti = algoritmo.calcolaAllineamento(seq1, seq2, matrice);


                    // Trova valore massimo in matrice (local alignment)
                    int maxVal = matrice.getLast().getLast();

                    String aligned1 = String.join("", allineamenti.get(0));
                    String aligned2 = String.join("", allineamenti.get(1));

                    pw.printf("%s,%s,%s,%s,%d,%s,%s%n",
                            nomiCol0.get(i), nomiCol1.get(i),
                            nomiCol0.get(j), nomiCol1.get(j),
                            maxVal, aligned1, aligned2);
                }
            }
        }

        System.out.println("Confronto completato, file salvato in: " + outputFile);
    }
}