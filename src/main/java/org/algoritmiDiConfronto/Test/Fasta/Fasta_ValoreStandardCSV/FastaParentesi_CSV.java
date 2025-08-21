package org.algoritmiDiConfronto.Test.Fasta.Fasta_ValoreStandardCSV;

import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;
import org.algoritmiDiConfronto.algoritmi.EditDistance;
import org.algoritmiDiConfronto.algoritmi.GlobalComparison;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;

public class FastaParentesi_CSV {
    public static void main(String[] args) {
        AlgoritmoBaseGenerics edit = new EditDistance();
        AlgoritmoBaseGenerics local = new LocalComparison();
        AlgoritmoBaseGenerics global = new GlobalComparison();

        String[] nomi = {
                "1YMO", "2K95", "2M8K", "4PLX", "hTER",
                "MALAT1", "PAN1", "PAN2"
        };

        String[] sequenze = {
                "((((((........[[[[[[[[[))))))........]]]]]]]]].",
                "((((((........[[[[[[[[[))))))........]]].]]]]]].",
                "(((((......[[[[[[[[[[.[))))).......].]]]]]]]]]].",
                ".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]",
                "(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))",
                "(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]",
                "((((((.....(((((....)))))[[[[[..))))))..............]]]]]",
                "(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]"
        };

        try (FileWriter writer = new FileWriter("fasta_confronti_standard_parentesi.csv")) {
            writer.write("S1,S2,EditDistance,GlobalComparison,LocalComparison\n");

            for (int i = 0; i < sequenze.length; i++) {
                for (int j = i + 1; j < sequenze.length; j++) {
                    String nome1 = nomi[i];
                    String nome2 = nomi[j];
                    List<Character> X = stringaToListaCaratteri(sequenze[i]);
                    List<Character> Y = stringaToListaCaratteri(sequenze[j]);
                    List<List<Integer>> Medit = edit.matrix(X,Y);
                    List<List<Integer>> Mglobal = global.matrix(X,Y);
                    List<List<Integer>> Mlocal = local.matrix(X,Y);

                    double e = edit.valoreP(Medit.getLast().getLast(),X,Y);
                    double g = global.valoreP(Mglobal.getLast().getLast(),X,Y);
                    int ylocal= local.valoredipartenzay(Y,Mlocal);
                    int xlocal= local.valoreDipartenzax(X,Mlocal);
                    double l = local.valoreP(Mlocal.get(xlocal).get(ylocal),X,Y);

                    writer.write(nome1 + "," + nome2 + "," + e + "," + g + "," + l + "\n");
                }
            }

            System.out.println("CSV generato: fasta_confronti_standard_parentesi.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
