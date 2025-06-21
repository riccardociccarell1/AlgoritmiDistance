package org.algoritmiDiConfronto.Test.Telomerase;


import java.io.*;
import java.util.*;
import org.algoritmiDiConfronto.algoritmi.GreedyLineare;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;
public class TestTelomeraseCSVGreedylineare {

    public static void main(String[] args) throws IOException {

        String inputFile = "src/main/resources/Telomerase/TelomeraseDatasetMetadata.csv";
        String outputFile = "Telomerase_greedy.csv";

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

        GreedyLineare algoritmo = new GreedyLineare();

        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            pw.println("Col0_Molecola1,Col1_Molecola1,Col0_Molecola2,Col1_Molecola2,Sottosequenza_Mol2_in_Mol1");

            for (int i = 0; i < sequenze.size(); i++) {
                for (int j = 0; j < sequenze.size(); j++) {
                    if (i == j) continue; // salta confronto identico

                    List<Character> seq1 = stringaToListaCaratteri(sequenze.get(i));
                    List<Character> seq2 = stringaToListaCaratteri(sequenze.get(j));

                    boolean isSubseq = algoritmo.Sottosequenza(seq1, seq2);

                    pw.printf("%s,%s,%s,%s,%d%n",
                            nomiCol0.get(i), nomiCol1.get(i),
                            nomiCol0.get(j), nomiCol1.get(j),
                            isSubseq ? 1 : 0);
                }
            }
        }

        System.out.println("Confronto completato, file salvato in: " + outputFile);
    }
}
