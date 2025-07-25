package org.algoritmiDiConfronto.Test.Fasta.Fasta_ValoreStandardCSV;

import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;
import org.algoritmiDiConfronto.algoritmi.EditDistance;
import org.algoritmiDiConfronto.algoritmi.GlobalComparison;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;

public class FastaNucleotidi_CSV {
    public static void main(String[] args) {
        AlgoritmoBaseGenerics edit = new EditDistance();
        AlgoritmoBaseGenerics local = new LocalComparison();
        AlgoritmoBaseGenerics global = new GlobalComparison();

        String[] nomi = {
                "FASTA1YMO", "FASTA2K95", "FASTA2M8K", "FASTA4PLX", "FASTAhTER",
                "FASTAMALAT1", "FASTAPAN1", "FASTAPAN2"
        };

        String[] sequenze = {
                "GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA",
                "GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA",
                "GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA",
                "GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA",
                "GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC",
                "GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA",
                "GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA",
                "GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA"
        };

        try (FileWriter writer = new FileWriter("fasta_confronti_standars_nucleotidi.csv")) {
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

                    double e = edit.valorePercentuale(Medit.getLast().getLast(),X,Y);
                    double g = global.valorePercentuale(Mglobal.getLast().getLast(),X,Y);
                    int ylocal= local.valoredipartenzay(Y,Mlocal);
                    int xlocal= local.valoreDipartenzax(X,Mlocal);
                    double l = local.valorePercentuale(Mlocal.get(xlocal).get(ylocal),X,Y);

                    writer.write(nome1 + "," + nome2 + "," + e + "," + g + "," + l + "\n");
                }
            }

            System.out.println("CSV generato: fasta_confronti.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
