package org.algoritmiDiConfronto.Bond;

import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;

import java.util.List;

import static org.algoritmiDiConfronto.Bond.ParserBond.parseBondParentesi;
import static org.algoritmiDiConfronto.Bond.ParserBond.parseBond;

public class TestBond {
    public static void main(String[] args) {

        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();

        List<Bond> DB1YMO = parseBond("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA",
            "((((((........[[[[[[[[[))))))........]]]]]]]]].");

        List<Bond> DB2K95 = parseBond("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]].]]]]]].");

        List<Bond> DB2M8K = parseBond("GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA",
                "(((((......[[[[[[[[[[.[))))).......].]]]]]]]]]].");

        List<Bond> DB4PLX = parseBond("GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA",
                ".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]");

        List<Bond> hTER = parseBond("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC",
                "(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))");

        List<Bond> MALAT1completionof4PLX = parseBond("GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA",
                "(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]");

        List<Bond> PAN1 = parseBond("GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA",
                "((((((.....(((((....)))))[[[[[..))))))..............]]]]]");

        List<Bond> PAN2 = parseBond("GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA",
                "(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]");


        List<Bond> Hotair = parseBond("GGGACUCGCCUGUGCUCUGGAGCUUGAUCCGAAAGCUUCCACAGUGAGGACUGCUCCGUGGGGGUAAGAGAGCACCAGGCACUGAGGCCUGGGAGUUCCACAGACCAACACCCCUGCUCCUGGCGGCUCCCACCCGGGGCUUAGACCCUCAGGUCCCUAAUAUCCCGGAGGUGCUCUCAAUCAGAAAGGUCCUGCUCCGCUUCGCAGUGGAAUGGAACGGAUUUAGAAGCCUGCAGUAGGGGAGUGGGGAGUGGAGAGAGGGAGCCCAGAGUUACAGACGGCGGCGAGAGGAAGGAGGGGCGUCUUUAUUUUUUUAAGGCCCCAAAGAGUCUGAUGUUUACAAGACCAGAAAUGCCACGGCCGCGUCCUGGCAGAGAAAAGGCUGAAAUGGAGGACCGGCGCCUUCCUUAUAAGUAUGCACAUUGGCGAGAGAAUUAAGUGCUGCAACCUAAACCAGCAAUUACACCCAAGCUCGUUGGGGCCUAAGCCAGUACCGACCUGGUAGAAAAAGCAACCACGAAGCUAGAGAGAG",
                "....((((((.(((((((((.(((...((((...((((((((...(((.....))).)))))))).....((((((((((......))))))).)))((((..(((.((.((((((((...((((((.((...((((((....((((....)))).......)))))).)).))).............((.(((.((((((....)))))).))).))..........)))...)))))))).)))))..))))....)))))))))))))........(((((((.((((((((.(((((..(((.........)))))))).....(((((((((((..(((.((....((((((.(((...))).))))))......)))))))))))))))).....))))))))...))).))))))).)))))).........(((((..........)))))..........((((((.((((((....(((((.......))))).......)).)))))).))))........");

        List<Bond> prova = parseBond("UAGUCAAUUGUUAUUAUUCAUAUUAAUUAAUUUAAUUGUUUUUAAAUUUUAUUUUAGUUUAUUUUUUAAAUAUUGUGCAAAUUGUUUAGGAAUAGUUAAUAAUAAUUUAUAAUUUUGAUUAGAUUAUUUUGUUAAUGCUAAUAUAUAGGUGUGGAAAAAGUGAAAAAUGUAAAAUACAAUAAAAUAAAAAACAAAAUUAACUCAUUAGUCAGAAAUGGAUGCCAGCCGUUGCGGUAAUUUCUAUGCUUUUAAAUAUUAUAAUGUUAUUUUAUCUCAAUGUUAUUUCUAAAUUCUAUAGAUUAGUCAAAAAUAAAUAUUUAAUUUUUUGUUUUUAAACACCAUCCGGUAUAUGCAAAUAAAAAAUGAAAGUAAUUAUUAAUUAUAUUAUAUUAUAUUUAUUCACAUUUUUACAUCUCCAAUAUUACGAACUUUUGACACCAUGAUAAGGAUAUUGAAUGGAAUUGAAAAUUUUAUAAUCAAAAUUAAUUAAUUAUAUUAAAUCUGCAAAAUUAGAUAAAACAAAAAAUUUAAAAGGUAUUGUUGCCCA",
                ".............((((.((((((....................................................................................................................................................................................(((((.....(((((....................))))))))))..))))))))))..................................................................................................................................................................................(((((...(...((((......))))...)))))).(((((.(((((((.....................................)))))))))).)).........");

        stampaAlgoritmo.eseguiAlgoritmoSuBond(Hotair, prova, TipologiaAlgoritmi.BONDLOCALCOMPARISON);


        //1. DB1YMO - DB2K95
        //EDITDISTANCE=1
        //GLOBALCOMPARISON=31
        //LOCALCOMPARISON=31
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB2K95, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB2K95,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB2K95,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //2. DB1YMO - DB2M8K
        //EDITDISTANCE=19
        //GLOBALCOMPARISON=-2
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB2M8K,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB2M8K,  TipologiaAlgoritmi.BONDGLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB2M8K,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //3. DB1YMO - DB4PLX
        //EDITDISTANCE=27
        //GLOBALCOMPARISON=-3
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, DB4PLX,  TipologiaAlgoritmi.BONDBONDLOCALCOMPARISON);

        //4. DB1YMO - hTER
        //EDITDISTANCE=86
        //GLOBALCOMPARISON=-54
        //LOCALCOMPARISON=24
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, hTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, hTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, hTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //5. DB1YMO - MALAT1completionof4PLX
        //EDITDISTANCE=41
        //GLOBALCOMPARISON=-16
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, MALAT1completionof4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, MALAT1completionof4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, MALAT1completionof4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //6. DB1YMO - PAN1
        //EDITDISTANCE=24
        //GLOBALCOMPARISON=-4
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, PAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, PAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, PAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //7. DB1YMO -PAN2
        //EDITDISTANCE=23
        //GLOBALCOMPARISON=-7
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, PAN2, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, PAN2, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB1YMO, PAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //8. DB2K95 - DB2M8K
        //EDITDISTANCE=18
        //GLOBALCOMPARISON=0
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, DB2M8K,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, DB2M8K,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, DB2M8K,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //9. DB2K95 - DB4PLX
        //EDITDISTANCE=28
        //GLOBALCOMPARISON=-4
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, DB4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, DB4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, DB4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //10. DB2K95 - hTER
        //EDITDISTANCE=85
        //GLOBALCOMPARISON=-52
        //LOCALCOMPARISON=24
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, hTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, hTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, hTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //11. DB2K95 - MALAT1completionof4PLX
        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-16
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, MALAT1completionof4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, MALAT1completionof4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, MALAT1completionof4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //12. DB2K95 - PAN1
        //EDITDISTANCE=24
        //GLOBALCOMPARISON=-4
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, PAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, PAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, PAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //13. DB2K95 - PAN2
        //EDITDISTANCE=24
        //GLOBALCOMPARISON=-8
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, PAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, PAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2K95, PAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //14. DB2M8K - DB4PLX
        //EDITDISTANCE=32
        //GLOBALCOMPARISON=-12
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, DB4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, DB4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, DB4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);


        //15. DB2M8K - hTER
        //EDITDISTANCE=92
        //GLOBALCOMPARISON=-66
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, hTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, hTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, hTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //16. DB2M8K - MALAT1completionof4PLX
        //EDITDISTANCE=43
        //GLOBALCOMPARISON=-22
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, MALAT1completionof4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, MALAT1completionof4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, MALAT1completionof4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //17. DB2M8K - PAN1
        //EDITDISTANCE=27
        //GLOBALCOMPARISON=-12
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, PAN1, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, PAN1, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, PAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //18. DB2M8K - PAN2
        //EDITDISTANCE=23
        //GLOBALCOMPARISON=-6
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, PAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, PAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB2M8K, PAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //19. DB4PLX - hTER
        //EDITDISTANCE=80
        //GLOBALCOMPARISON=-41
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, hTER,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, hTER,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, hTER,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //20. DB4PLX - MALAT1completionof4PLX
        //EDITDISTANCE=17
        //GLOBALCOMPARISON=31
        //LOCALCOMPARISON=32
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, MALAT1completionof4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, MALAT1completionof4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, MALAT1completionof4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //21. DB4PLX - PAN1
        //EDITDISTANCE=23
        //GLOBALCOMPARISON=6
        //LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, PAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, PAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, PAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //22. DB4PLX - PAN2
        //EDITDISTANCE=31
        //GLOBALCOMPARISON=-11
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, PAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, PAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(DB4PLX, PAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //23. hTER  - MALAT1completionof4PLX
        //EDITDISTANCE=76
        //GLOBALCOMPARISON=-31
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, MALAT1completionof4PLX,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, MALAT1completionof4PLX,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, MALAT1completionof4PLX,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //24. hTER  - PAN1
        //EDITDISTANCE=88
        //GLOBALCOMPARISON=-58
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, PAN1,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, PAN1,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, PAN1,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //25. hTER  - PAN2
        //EDITDISTANCE=94
        //GLOBALCOMPARISON=-70
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, PAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, PAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(hTER, PAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //26.MALAT1completionof4PLX   - PAN1
        //EDITDISTANCE=33
        //GLOBALCOMPARISON=-2
        //LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(MALAT1completionof4PLX, PAN1, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(MALAT1completionof4PLX, PAN1, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(MALAT1completionof4PLX, PAN1, TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //27. MALAT1completionof4PLX   - PAN2
        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-20
        //LOCALCOMPARISON=6
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(MALAT1completionof4PLX, PAN2, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(MALAT1completionof4PLX, PAN2, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(MALAT1completionof4PLX, PAN2, TipologiaAlgoritmi.BONDLOCALCOMPARISON);

        //28. PAN1   - PAN2
        //EDITDISTANCE=22
        //GLOBALCOMPARISON=-2
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(PAN1, PAN2,  TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(PAN1, PAN2,  TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuBond(PAN1, PAN2,  TipologiaAlgoritmi.BONDLOCALCOMPARISON);






        //stampaAlgoritmo.eseguiAlgoritmoSuBond(Tetrahymenathermophila, b,  TipologiaAlgoritmi.LOCALCOMPARISON);



//
//        for (Bond b : DB1YMO) {
//            System.out.println(b.toString());
//        }

//        for (Bond d : Tetrahymenathermophila) {
//            System.out.println(b.toString());
//       }

    }
    }
