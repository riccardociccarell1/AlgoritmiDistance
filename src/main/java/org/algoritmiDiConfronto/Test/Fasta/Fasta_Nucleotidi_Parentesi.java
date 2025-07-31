package org.algoritmiDiConfronto.Test.Fasta;



import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;

import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
public class
Fasta_Nucleotidi_Parentesi {
    public static void main(String[] args) {


        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();



        List<Coppie> FASTA1YMO = CreaListaCoppie("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]]]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> FASTA2K95 = CreaListaCoppie("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]].]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> FASTA2M8K = CreaListaCoppie("GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA",
                "(((((......[[[[[[[[[[.[))))).......].]]]]]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> FASTA4PLX = CreaListaCoppie("GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA",
                ".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> FASTAhTER = CreaListaCoppie("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC",
                "(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> FASTAMALAT1 = CreaListaCoppie("GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA",
                "(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> FASTAPAN1 = CreaListaCoppie("GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA",
                "((((((.....(((((....)))))[[[[[..))))))..............]]]]]", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> FASTAPAN2 = CreaListaCoppie("GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA",
                "(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]", TipologiaCoppie.COPPIE_CARATTERI);


        //1. FASTA1YMO - FASTA2K95
        //EDITDISTANCE=1
        //GLOBALCOMPARISON=46
        //LOCALCOMPARISON=46
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2K95, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2K95, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2K95, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //2. FASTA1YMO - FASTA2M8K

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //3. FASTA1YMO - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //4. FASTA1YMO - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //5. FASTA1YMO - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //6. FASTA1YMO - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //7. FASTA1YMO -FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FATSAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //8. FASTA2K95 - FASTA2M8K

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //9. FASTA2K95 - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //10. FASTA2K95 - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //11. FASTA2K95 - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //12. FASTA2K95 - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //13. FASTA2K95 - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //14. FASTA2M8K - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //15. FASTA2M8K - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //16. FASTA2M8K - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //17. FASTA2M8K - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //18. FASTA2M8K - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //19. FASTA4PLX - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //20. FASTA4PLX - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //21. FASTA4PLX - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //22. FASTA4PLX - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //23. FASTAhTER  - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //24. FASTAhTER  - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //25. FASTAhTER  - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //26.FASTAMALAT1 - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //27. FASTAMALAT1 - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //28. FASTAPAN1   - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAPAN1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAPAN1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAPAN1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

    }


}





