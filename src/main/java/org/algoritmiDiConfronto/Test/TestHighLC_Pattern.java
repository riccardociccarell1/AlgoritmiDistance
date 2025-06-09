package org.algoritmiDiConfronto.Test;

import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaSingoliElementi;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
public class TestHighLC_Pattern {
    public static void main(String[] args) {

        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();

        String pattern = ("GGCUAGGUUUUCACGGGGACUAAUCA");

        String FASTA1YMO = ("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA");
        String FASTA2K95 = ("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA");
        String FASTA2M8K = ("GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA");
        String FASTA4PLX = ("GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA");
        String FASTAhTER = ("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC");
        String FASTAMALAT1 = ("GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA");
        String FASTAPAN1 = ("GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA");
        String FASTAPAN2 = ("GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA");

//        missmatch=100
//        valore=7
//        missmatch=1
//        valore=12
//        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//        missmatch=100
//        valore=7
//        missmatch=1
//        valore=12
//        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//        missmatch=100
//        valore=6
//        missmatch=1
//        valore=6
//        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//        missmatch=100
//        valore=8
//        missmatch=1
//        valore=8
//        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//        missmatch=100
//        valore=7
//        missmatch=1
//        valore=12
        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//        missmatch=100
//        valore=8
//        missmatch=1
//        valore=8
//        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//        missmatch=100
//        valore=7
//        missmatch=1
//        valore=8
//        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//        missmatch=100
//        valore=7
//        missmatch=1
//        valore=7
//        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN2, pattern, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);
//
//

    }
}