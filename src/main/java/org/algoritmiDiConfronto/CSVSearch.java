package org.algoritmiDiConfronto;

import org.algoritmiDiConfronto.algoritmi.GreedyLineare;

import java.io.*;
import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;

public class CSVSearch {
    public static void main(String[] args) {
        GreedyLineare gl = new GreedyLineare();
        String inputFile = "src/main/resources/MolecolePerRicerca/PhyloRNA_5S_CRW2.csv";
        String outputFile = "PhyloRNA_5S_CRW2_OUTPUT_CORE_SEMPLIFIED.csv";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                PrintWriter writer = new PrintWriter(new FileWriter(outputFile))
        ) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");

                if (isFirstLine) {
                    writer.println(line);
                    isFirstLine = false;
                    continue;
                }

                    String lengthStr = columns[9].trim();
                    List<Character> core = stringaToListaCaratteri("((())())");
                    List<Character> corefile = stringaToListaCaratteri(lengthStr);
                    if (gl.Sottosequenza(corefile,core)) {
                        writer.println(line);

                }
            }

            System.out.println("File salvato con successo in: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}