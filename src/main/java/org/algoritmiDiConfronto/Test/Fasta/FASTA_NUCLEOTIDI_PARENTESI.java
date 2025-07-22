package org.algoritmiDiConfronto.Test.Fasta;



import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;

import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
public class
FASTA_NUCLEOTIDI_PARENTESI {
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
        //EDITDISTANCE=25
        //GLOBALCOMPARISON=1
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //3. FASTA1YMO - FASTA4PLX
        //EDITDISTANCE=48
        //GLOBALCOMPARISON=-18
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //4. FASTA1YMO - FASTAhTER
        //EDITDISTANCE=112
        //GLOBALCOMPARISON=10
        //LOCALCOMPARISON=29
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //5. FASTA1YMO - FASTAMALAT1
        //EDITDISTANCE=64
        //GLOBALCOMPARISON=-33
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //6. FASTADB1YMO - FASTAPAN1
        //EDITDISTANCE=38
        //GLOBALCOMPARISON=-14
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTADB1YMO, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTADB1YMO, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTADB1YMO, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //7. FASTA1YMO -FASTAPAN2
        //EDITDISTANCE=38
        //GLOBALCOMPARISON=-14
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FATSAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA1YMO, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //8. FASTA2K95 - FASTA2M8K
        //EDITDISTANCE=25
        //GLOBALCOMPARISON=1
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //9. FASTA2K95 - FASTA4PLX
        //EDITDISTANCE=48
        //GLOBALCOMPARISON=-18
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //10. FASTA2K95 - FASTAhTER
        //EDITDISTANCE=111
        //GLOBALCOMPARISON=-63
        //LOCALCOMPARISON=29
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //11. FASTA2K95 - FASTAMALAT1
        //EDITDISTANCE=64
        //GLOBALCOMPARISON=-33
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //12. FASTA2K95 - FASTAPAN1
        //EDITDISTANCE=39
        //GLOBALCOMPARISON=-15
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //13. FASTA2K95 - FASTAPAN2
        //EDITDISTANCE=39
        //GLOBALCOMPARISON=-15
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2K95, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //14. FASTA2M8K - FASTA4PLX
        //EDITDISTANCE=52
        //GLOBALCOMPARISON=-27
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTA4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //15. FASTA2M8K - FASTAhTER
        //EDITDISTANCE=122
        //GLOBALCOMPARISON=-85
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //16. FASTA2M8K - FASTAMALAT1
        //EDITDISTANCE=66
        //GLOBALCOMPARISON=-38
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //17. FASTA2M8K - FASTAPAN1
        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-22
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //18. FASTA2M8K - FASTAPAN2
        //EDITDISTANCE=39
        //GLOBALCOMPARISON=-19
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA2M8K, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //19. FASTA4PLX - FASTAhTER
        //EDITDISTANCE=112
        //GLOBALCOMPARISON=-65
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAhTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //20. FASTA4PLX - FASTAMALAT1
        //EDITDISTANCE=22
        //GLOBALCOMPARISON=51
        //LOCALCOMPARISON=51
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //21. FASTA4PLX - FASTAPAN1
        //EDITDISTANCE=36
        //GLOBALCOMPARISON=5
        //LOCALCOMPARISON=14
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //22. FASTA4PLX - FASTAPAN2
        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-7
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTA4PLX, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //23. FASTAhTER  - FASTAMALAT1
        //EDITDISTANCE=111
        //GLOBALCOMPARISON=-61
        //LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAMALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //24. FASTAhTER  - FASTAPAN1
        //EDITDISTANCE=121
        //GLOBALCOMPARISON=-83
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //25. FASTAhTER  - FASTAPAN2
        //EDITDISTANCE=126
        //GLOBALCOMPARISON=-92
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAhTER, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //26.FASTAMALAT1 - FASTAPAN1
        //EDITDISTANCE=51
        //GLOBALCOMPARISON=-9
        //LOCALCOMPARISON=13
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //27. FASTAMALAT1 - FASTAPAN2
        //EDITDISTANCE=58
        //GLOBALCOMPARISON=-23
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAMALAT1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //28. FASTAPAN1   - FASTAPAN2
        //EDITDISTANCE=22
        //GLOBALCOMPARISON=14
        //LOCALCOMPARISON=20
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAPAN1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAPAN1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(FASTAPAN1, FASTAPAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

    }


}





