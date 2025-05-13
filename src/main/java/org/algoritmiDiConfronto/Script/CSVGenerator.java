package org.algoritmiDiConfronto.Script;

import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class CSVGenerator {

    public static void stampaMatriceCSV(List<?> X, List<?> Y, List<List<Integer>> M,
                                        List<List<String>> allineamento, AlgoritmoBaseGenerics algoritmo,
                                        String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append(";0;");
            for (Object y : Y) {
                writer.append(y.toString()).append(";");
            }
            writer.append("\n");

            for (int i = 0; i < M.size(); i++) {
                if (i == 0) {
                    writer.append("0;");
                } else {
                    writer.append(X.get(i - 1).toString()).append(";");
                }
                for (int j = 0; j < M.get(i).size(); j++) {
                    writer.append(String.valueOf(M.get(i).get(j))).append(";");
                }
                writer.append("\n");
            }
            writer.append("la "+algoritmo.stampaTesto()+" corrisponde a:"+M.getLast().getLast()+"\n");
            writer.append("\n");
            writer.append("\n");
            writer.append("L'allinamento ottimo corrisponde a:\n");
            int maxLengthX = allineamento.get(0).size();
            for (int i = 0; i < maxLengthX; i++) {
                writer.append(allineamento.get(0).get(i)).append(";");
            }
            writer.append("\n");
            int maxLengthY = allineamento.get(1).size();
            for (int i = 0; i < maxLengthY; i++) {
                writer.append(allineamento.get(1).get(i)).append(";");
            }



            System.out.println("CSV generato con successo.");
        }

    }


}
