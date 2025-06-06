package org.algoritmiDiConfronto.Test;

import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaSingoliElementi;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
public class TestFastaHighMLocalComparison {
    public static void main(String[] args) {

        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();


        String FASTA1YMO = ("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA");
        String FASTA2K95 = ("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA");
        String FASTA2M8K = ("GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA");
        String FASTA4PLX = ("GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA");
        String FASTAhTER = ("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC");
        String FASTAMALAT1 = ("GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA");
        String FASTAPAN1 = ("GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA");
        String FASTAPAN2 = ("GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA");


// 1. FASTA1YMO - FASTA2K95
//LOCALCOMPARISON=46
//LOCALCOMPARISON=46
//stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2K95, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 2. FASTA1YMO - FASTA2M8K
//LOCALCOMPARISON=11
//LOCALCOMPARISON=7
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 3. FASTA1YMO - FASTA4PLX
//LOCALCOMPARISON=11
//LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 4. FASTA1YMO - FASTAhTER
//LOCALCOMPARISON=30
//LOCALCOMPARISON=30
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 5. FASTA1YMO - FASTAMALAT1
//LOCALCOMPARISON=15
//LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 6. FASTA1YMO - FASTAPAN1
//LOCALCOMPARISON=11
//LOCALCOMPARISON=9
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 7. FASTA1YMO - FASTAPAN2
//LOCALCOMPARISON=16
//LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 8. FASTA2K95 - FASTA2M8K
//LOCALCOMPARISON=11
//LOCALCOMPARISON=7
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 9. FASTA2K95 - FASTA4PLX
//LOCALCOMPARISON=11
//LOCALCOMPARISON=9
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 10. FASTA2K95 - FASTAhTER
//LOCALCOMPARISON=30
//LOCALCOMPARISON=30
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 11. FASTA2K95 - FASTAMALAT1
//LOCALCOMPARISON=14
//LOCALCOMPARISON=9
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 12. FASTA2K95 - FASTAPAN1
//LOCALCOMPARISON=11
//LOCALCOMPARISON=9
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 13. FASTA2K95 - FASTAPAN2
//LOCALCOMPARISON=16
//LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 14. FASTA2M8K - FASTA4PLX
//LOCALCOMPARISON=12
//LOCALCOMPARISON=11
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 15. FASTA2M8K - FASTAhTER
//LOCALCOMPARISON=11
//LOCALCOMPARISON=7
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 16. FASTA2M8K - FASTAMALAT1
//LOCALCOMPARISON=13
//LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 17. FASTA2M8K - FASTAPAN1
//LOCALCOMPARISON=10
//LOCALCOMPARISON=7
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 18. FASTA2M8K - FASTAPAN2
//LOCALCOMPARISON=15
//LOCALCOMPARISON=9
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 19. FASTA4PLX - FASTAhTER
//LOCALCOMPARISON=16
//LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 20. FASTA4PLX - FASTAMALAT1
//LOCALCOMPARISON=53
//LOCALCOMPARISON=51
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 21. FASTA4PLX - FASTAPAN1
//LOCALCOMPARISON=21
//LOCALCOMPARISON=16
       //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 22. FASTA4PLX - FASTAPAN2
//LOCALCOMPARISON=18
//LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 23. FASTAhTER - FASTAMALAT1
//LOCALCOMPARISON=12
//LOCALCOMPARISON=11
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 24. FASTAhTER - FASTAPAN1
//LOCALCOMPARISON=11
//LOCALCOMPARISON=9
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 25. FASTAhTER - FASTAPAN2
//LOCALCOMPARISON=12
//LOCALCOMPARISON=9
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 26. FASTAMALAT1 - FASTAPAN1
//LOCALCOMPARISON=18
//LOCALCOMPARISON=17
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 27. FASTAMALAT1 - FASTAPAN2
//LOCALCOMPARISON=13
//LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 28. FASTAPAN1 - FASTAPAN2
//LOCALCOMPARISON=34
//LOCALCOMPARISON=33
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);


    }
}

