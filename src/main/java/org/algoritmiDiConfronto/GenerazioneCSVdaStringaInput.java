package org.algoritmiDiConfronto;

import java.io.*;
import java.util.*;

import org.algoritmiDiConfronto.Bond.Bond;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import static org.algoritmiDiConfronto.Bond.ParserBond.parseBondParentesi;

public class GenerazioneCSVdaStringaInput {

    public static void main(String[] args) throws IOException {

        // === File di input e output ===
        String inputFile = "src/main/resources/RicercaHOTAIRSemplificato2/PhyloRNA_tRNA_PDB.csv";
        String outputFile = "PhyloRNA_tRNA_PDB.csv";

        // === Sequenza fissa da confrontare con ogni riga ===
        String sequenzaFissa = "((())())";
        List<Bond> sequenzaFissaParsed = parseBondParentesi(sequenzaFissa);

        // === Lettura file di input ===
        List<String> nomiCol0 = new ArrayList<>();
        List<String> nomiCol1 = new ArrayList<>();
        List<String> sequenze = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean primaRiga = true;
            while ((line = br.readLine()) != null) {
                if (primaRiga) {
                    primaRiga = false;
                    continue; // salta header
                }
                String[] cols = line.split(",");
                if (cols.length > 10) {
                    nomiCol0.add(cols[0].trim());
                    nomiCol1.add(cols[1].trim());
                    String seq = cols[10].trim().replaceAll("\"", "");
                    sequenze.add(seq);
                }
            }
        }

        // === Algoritmo di confronto ===
        LocalComparison algoritmo = new LocalComparison();

        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            // intestazione CSV
            pw.println("Col0_Fisso,Col1_Fisso,Col0_Riga,Col1_Riga,ValoreAllineamento,Allineamento_Fisso,Allineamento_Riga");

            // ciclo su ogni riga per confrontarla con la sequenza fissa
            for (int i = 0; i < sequenze.size(); i++) {
                List<Bond> seqParsed = parseBondParentesi(sequenze.get(i));

                List<List<Integer>> matrice = algoritmo.matrix(sequenzaFissaParsed, seqParsed);
                List<List<String>> allineamenti = algoritmo.calcolaAllineamento(sequenzaFissaParsed, seqParsed, matrice);


                int x = algoritmo.maggiorValoreindicex(matrice);
                int y = algoritmo.maggiorValoreindicey(matrice);
                int maxVal = matrice.get(x).get(y);

                String alignedFisso = "\"" + String.join(",", allineamenti.get(0)) + "\"";
                String alignedRiga = "\"" + String.join(",", allineamenti.get(1)) + "\"";

                // scrittura riga nel file CSV
                pw.printf("SequenzaFissa,SequenzaFissa,%s,%s,%d,%s,%s%n",
                        nomiCol0.get(i), nomiCol1.get(i),
                        maxVal, alignedFisso, alignedRiga);
            }
        }

        System.out.println("Confronto completato con sequenza fissa. File salvato in: " + outputFile);
    }
}