package org.algoritmiDiConfronto.Test.Telomerase;

import java.io.*;
import java.util.*;

import org.algoritmiDiConfronto.Bond.Bond;
import org.algoritmiDiConfronto.Bond.BondLocalComparison;

import static org.algoritmiDiConfronto.Bond.ParserBond.parseBondParentesi;

public class TestBondTelomerase {

    public static void main(String[] args) throws IOException {

        String inputFile = "src/main/resources/Telomerase/TelomeraseDatasetMetadata.csv";
        String outputFile = "Telomerase_Bond.csv";

        List<String> nomiCol0 = new ArrayList<>();
        List<String> nomiCol1 = new ArrayList<>();
        List<String> sequenze = new ArrayList<>();

        // Lettura del file CSV (senza librerie esterne)
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean primaRiga = true;
            while ((line = br.readLine()) != null) {
                if (primaRiga) {
                    primaRiga = false;  // salto header
                    continue;
                }
                String[] cols = line.split(",");
                // Controllo colonne minime
                // Usa questa condizione per la lunghezza colonne
                if (cols.length > 10) {  // >= 11 colonne per accedere a cols[10]
                    nomiCol0.add(cols[0].trim());
                    nomiCol1.add(cols[1].trim());

                    // Togli virgolette e spazi da sequenza
                    String seq = cols[10].trim().replaceAll("\"", "");
                    sequenze.add(seq);
                }
            }
        }

        BondLocalComparison algoritmo = new BondLocalComparison();

        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            pw.println("Col0_Molecola1,Col1_Molecola1,Col0_Molecola2,Col1_Molecola2,ValoreAllineamento,Allineamento1,Allineamento2");

            for (int i = 0; i < sequenze.size() - 1; i++) {
                for (int j = i + 1; j < sequenze.size(); j++) {

                    List<Bond> seq1 = parseBondParentesi(sequenze.get(i));
                    List<Bond> seq2 = parseBondParentesi(sequenze.get(j));


                    List<List<Integer>> matrice = algoritmo.matrix(seq1, seq2);
                    List<List<String>> allineamenti = algoritmo.calcolaAllineamento(seq1, seq2, matrice);

                    int x = algoritmo.maggiorValoreindicex(matrice);
                    int y = algoritmo.maggiorValoreindicey(matrice);
                    int maxVal = matrice.get(x).get(y);

                    // converto lista in stringa concatenata senza [ ] e virgole
                    String aligned1 = "\"" + String.join(",", allineamenti.get(0)) + "\"";
                    String aligned2 = "\"" + String.join(",", allineamenti.get(1)) + "\"";

                    // escape di eventuali virgole (se ti serve)
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