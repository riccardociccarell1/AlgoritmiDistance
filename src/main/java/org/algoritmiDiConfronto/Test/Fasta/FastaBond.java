package org.algoritmiDiConfronto.Test.Fasta;

import org.algoritmiDiConfronto.Bond.Bond;
import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;

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

        List<Bond> FASTA4PLX = parseBond("GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA",
                ".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]");

        List<Bond> FASTAhTER = parseBond("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC",
                "(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))");

        List<Bond> FASTAMALAT1 = parseBond("GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA",
                "(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]");

        List<Bond> FASTAPAN1 = parseBond("GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA",
                "((((((.....(((((....)))))[[[[[..))))))..............]]]]]");

        List<Bond> FASTAPAN2 = parseBond("GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA",
                "(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]");


        List<Bond> uno = parseBond("GGCUCUCAGUGAGCC",
                "(((((.....)))))");

        List<Bond> due = parseBond("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGCGCUGUUUUUCUCGCUGACUUUCAGCGGGCGGAAAAGCCUCGGCCUGCCGCCUUGAGCAAACAAAAAAUGUCAGCUGCUGGCCCCCGAACCCCGCCUGGAGGCCGCGGUCGGCCCGGGGCUUCUCCGGAGGCACCCACUGCCACCGCGAAGAGUUGGGCUCUGUCAGCCGCGGGUCUCUCGG",
                "(((((........................(...((.(((((....((((((.....(......(((........[[[[[[[[[)))......))))))).)..))))..))...)...........]]].]]]]]]...))))).((((...((((.....((((.((((.(((..((((((((....))))).)))...))))))).)..(((.....))).....))))))).....))))");
//
//stampaAlgoritmo.eseguiAlgoritmoSuBond(uno, due, TipologiaAlgoritmi.EDITDISTANCE);
//        stampaAlgoritmo.eseguiAlgoritmoSuBond(uno, due,  TipologiaAlgoritmi.GLOBALCOMPARISON);
//        stampaAlgoritmo.eseguiAlgoritmoSuBond(uno, due,  TipologiaAlgoritmi.LOCALCOMPARISON);





        //1. FASTA1YMO - FASTA2K95

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2K95, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2K95,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2K95,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //2. FASTA1YMO - FASTA2M8K

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2M8K,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2M8K,  TipologiaAlgoritmi.BONDGLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA2M8K,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //3. FASTA1YMO - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTA4PLX,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //4. FASTA1YMO - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAhTER,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //5. FASTA1YMO - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAMALAT1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //6. FASTA1YMO - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //7. FASAT1YMO - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN2, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA1YMO, FASTAPAN2, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTADB1YMO, FASTAPAN2,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //8. FASTA2K95 - FASTA2M8K

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA2M8K,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA2M8K,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA2M8K,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //9. FASTA2K95 - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTA4PLX,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //10. FASTA2K95 - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAhTER,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //11. FASTA2K95 - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, FASTAMALAT1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //12. FASTA2K95 - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //13. FASTA2K95 - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2K95, FASTAPAN2,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //14. FASTA2M8K - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTA4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTA4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTA4PLX,  TipologiaAlgoritmi.LOCALCOMPARISON);


        //15. FASTA2M8K - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAhTER,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //16. FASTA2M8K - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAMALAT1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //17. FASTA2M8K - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN1, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN1, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //18. FASTA2M8K - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA2M8K, FASTAPAN2,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //19. FASTA4PLX - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAhTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAhTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAhTER,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //20. FASTA4PLX - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAMALAT1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //21. FASTA4PLX - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //22. FASTA4PLX - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTA4PLX, FASTAPAN2,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //23. FASTAhTER  - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAMALAT1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAMALAT1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAMALAT1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //24. FASTAhTER  - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN1,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //25. FASTAhTER  - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, PAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAhTER, FASTAPAN2,  TipologiaAlgoritmi.LOCALCOMPARISON);

        //26.FASTAMALAT1  - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN1, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN1, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN1, TipologiaAlgoritmi.LOCALCOMPARISON);

        //27. FASTAMALAT1   - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN2, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN2, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAMALAT1, FASTAPAN2, TipologiaAlgoritmi.LOCALCOMPARISON);

        //28. FASTAPAN1   - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAPAN1, FASTAPAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAPAN1, FASTAPAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(FASTAPAN1, FASTAPAN2,  TipologiaAlgoritmi.LOCALCOMPARISON);





    }
    }
