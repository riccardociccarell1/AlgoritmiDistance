package org.algoritmiDiConfronto.Test.Fasta.Fasta_ValoreStandardCSV;

import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation;
import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;
import org.algoritmiDiConfronto.algoritmi.EditDistance;
import org.algoritmiDiConfronto.algoritmi.GlobalComparison;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FastaNucleotidi_Parentesi_CSV {
    public static void main(String[] args) {
        AlgoritmoBaseGenerics edit = new EditDistance();
        AlgoritmoBaseGenerics global = new GlobalComparison();
        AlgoritmoBaseGenerics local = new LocalComparison();

        String[] nomi = {
                "FASTA1YMO", "FASTA2K95", "FASTA2M8K", "FASTA4PLX", "FASTAhTER",
                "FASTAMALAT1", "FASTAPAN1", "FASTAPAN2"
        };

        String[] sequenzeNucleotide = {
                "GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA",
                "GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA",
                "GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA",
                "GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA",
                "GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC",
                "GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA",
                "GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA",
                "GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA"
        };

        String[] sequenzeParentesi = {
                "((((((........[[[[[[[[[))))))........]]]]]]]]].",
                "((((((........[[[[[[[[[))))))........]]].]]]]]].",
                "(((((......[[[[[[[[[[.[))))).......].]]]]]]]]]].",
                ".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]",
                "(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))",
                "(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]",
                "((((((.....(((((....)))))[[[[[..))))))..............]]]]]",
                "(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]"
        };

        try (FileWriter writer = new FileWriter("fasta_confronti_standard_parentesi_nucleotidi.csv")) {
            writer.write("S1,S2,EditDistance,GlobalComparison,LocalComparison\n");

            for (int i = 0; i < nomi.length; i++) {
                for (int j = i + 1; j < nomi.length; j++) {
                    String nome1 = nomi[i];
                    String nome2 = nomi[j];

                    List<Coppie> X = InputTrasformation.CreaListaCoppie(sequenzeNucleotide[i], sequenzeParentesi[i], org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie.COPPIE_CARATTERI);
                    List<Coppie> Y = InputTrasformation.CreaListaCoppie(sequenzeNucleotide[j], sequenzeParentesi[j], org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie.COPPIE_CARATTERI);

                    // Edit
                    List<List<Integer>> Medit = edit.matrix(X, Y);
                    int editRaw = Medit.getLast().getLast();
                    double editPerc = edit.valorePercentuale(editRaw, X, Y);

                    // Global
                    List<List<Integer>> Mglobal = global.matrix(X, Y);
                    int globalRaw = Mglobal.getLast().getLast();
                    double globalPerc = global.valorePercentuale(globalRaw, X, Y);

                    // Local
                    List<List<Integer>> Mlocal = local.matrix(X, Y);
                    int xloc = local.valoreDipartenzax(X, Mlocal);
                    int yloc = local.valoredipartenzay(Y, Mlocal);
                    int localRaw = Mlocal.get(xloc).get(yloc);
                    double localPerc = local.valorePercentuale(localRaw, X, Y);

                    writer.write(nome1 + "," + nome2 + "," + editPerc + "," + globalPerc + "," + localPerc + "\n");
                }
            }
            System.out.println("SV generato: fasta_confronti_standard_parentesi_nucleotidi.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
