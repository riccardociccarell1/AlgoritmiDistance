package org.algoritmiDiConfronto.Test.Fasta;

import org.algoritmiDiConfronto.Bond.Bond;
import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;

import java.util.List;


import static org.algoritmiDiConfronto.Bond.ParserBond.parseBond;

public class FastaBond {
    public static void main(String[] args) {

        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();

        List<Bond> FASTA1YMO = parseBond("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA",
            "((((((........[[[[[[[[[))))))........]]]]]]]]].");

        List<Bond> FASTA2K95 = parseBond("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]].]]]]]].");

        List<Bond> FASTA2M8K = parseBond("GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA",
                "(((((......[[[[[[[[[[.[))))).......].]]]]]]]]]].");

        List<Bond> DFASTAPLX = parseBond("GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA",
                ".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]");

        List<Bond> FASTAhTER = parseBond("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC",
                "(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))");

        List<Bond> FASTAMALAT1 = parseBond("GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA",
                "(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]");

        List<Bond> FASTAPAN1 = parseBond("GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA",
                "((((((.....(((((....)))))[[[[[..))))))..............]]]]]");

        List<Bond> FASTAPAN2 = parseBond("GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA",
                "(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]");





        //1. FASTA1YMO - FASTA2K95
        //EDITDISTANCE=1
        //GLOBALCOMPARISON=31
        //LOCALCOMPARISON=31
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2K95, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2K95,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2K95,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //2. FASTA1YMO - FASTA2M8K
        //EDITDISTANCE=19
        //GLOBALCOMPARISON=-2
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2M8K,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2M8K,  TipologiaAlgoritmi.BONDGLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2M8K,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //3. FASTA1YMO - FASTA4PLX
        //EDITDISTANCE=27
        //GLOBALCOMPARISON=-3
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA4PLX,  TipologiaAlgoritmi.BONDBONDLOCALCOMPARISON);

        //4. FASTA1YMO - FASTAhTER
        //EDITDISTANCE=86
        //GLOBALCOMPARISON=-54
        //LOCALCOMPARISON=24
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAhTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //5. FASTA1YMO - FASTAMALAT1
        //EDITDISTANCE=41
        //GLOBALCOMPARISON=-16
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAMALAT1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //6. FASTA1YMO - FASTAPAN1
        //EDITDISTANCE=24
        //GLOBALCOMPARISON=-4
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //7. FASAT1YMO - FASTAPAN2
        //EDITDISTANCE=23
        //GLOBALCOMPARISON=-7
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN2, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN2, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTADB1YMO, FASTAPAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //8. FASTA2K95 - FASTA2M8K
        //EDITDISTANCE=18
        //GLOBALCOMPARISON=0
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA2M8K,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA2M8K,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA2M8K,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //9. FASTA2K95 - FASTA4PLX
        //EDITDISTANCE=28
        //GLOBALCOMPARISON=-4
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //10. FASTA2K95 - FASTAhTER
        //EDITDISTANCE=85
        //GLOBALCOMPARISON=-52
        //LOCALCOMPARISON=24
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAhTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //11. FASTA2K95 - FASTAMALAT1
        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-16
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, FASTAMALAT1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //12. FASTA2K95 - FASTAPAN1
        //EDITDISTANCE=24
        //GLOBALCOMPARISON=-4
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //13. FASTA2K95 - FASTAPAN2
        //EDITDISTANCE=24
        //GLOBALCOMPARISON=-8
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //14. FASTA2M8K - FASTA4PLX
        //EDITDISTANCE=32
        //GLOBALCOMPARISON=-12
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTA4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTA4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTA4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);


        //15. FASTA2M8K - FASTAhTER
        //EDITDISTANCE=92
        //GLOBALCOMPARISON=-66
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAhTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //16. FASTA2M8K - FASTAMALAT1
        //EDITDISTANCE=43
        //GLOBALCOMPARISON=-22
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAMALAT1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //17. FASTA2M8K - FASTAPAN1
        //EDITDISTANCE=27
        //GLOBALCOMPARISON=-12
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN1, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN1, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //18. FASTA2M8K - FASTAPAN2
        //EDITDISTANCE=23
        //GLOBALCOMPARISON=-6
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //19. FASTA4PLX - FASTAhTER
        //EDITDISTANCE=80
        //GLOBALCOMPARISON=-41
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAhTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //20. FASTA4PLX - FASTAMALAT1
        //EDITDISTANCE=17
        //GLOBALCOMPARISON=31
        //LOCALCOMPARISON=32
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAMALAT1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //21. FASTA4PLX - FASTAPAN1
        //EDITDISTANCE=23
        //GLOBALCOMPARISON=6
        //LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //22. FASTA4PLX - FASTAPAN2
        //EDITDISTANCE=31
        //GLOBALCOMPARISON=-11
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //23. FASTAhTER  - FASTAMALAT1
        //EDITDISTANCE=76
        //GLOBALCOMPARISON=-31
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAMALAT1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //24. FASTAhTER  - FASTAPAN1
        //EDITDISTANCE=88
        //GLOBALCOMPARISON=-58
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //25. FASTAhTER  - FASTAPAN2
        //EDITDISTANCE=94
        //GLOBALCOMPARISON=-70
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, PAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //26.FASTAMALAT1  - FASTAPAN1
        //EDITDISTANCE=33
        //GLOBALCOMPARISON=-2
        //LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN1, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN1, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN1, TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //27. FASTAMALAT1   - FASTAPAN2
        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-20
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN2, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN2, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN2, TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //28. FASTAPAN1   - FASTAPAN2
        //EDITDISTANCE=22
        //GLOBALCOMPARISON=-2
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAPAN1, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAPAN1, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAPAN1, FASTAPAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);





    }
    }
