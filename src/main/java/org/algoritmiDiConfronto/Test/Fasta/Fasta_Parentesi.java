package org.algoritmiDiConfronto.Test.Fasta;


import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaSingoliElementi;

public class Fasta_Parentesi {
    public static void main(String[] args) {

        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();


        String FASTA1YMO = ("((((((........[[[[[[[[[))))))........]]]]]]]]].");
        String FASTA2K95 = ("((((((........[[[[[[[[[))))))........]]].]]]]]].");
        String FASTA2M8K = ("(((((......[[[[[[[[[[.[))))).......].]]]]]]]]]].");
        String FASTA4PLX = (".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]");
        String FASTAhTER = ("(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))");
        String FASTAMALAT1 = ("(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]");
        String FASTAPAN1 = ("((((((.....(((((....)))))[[[[[..))))))..............]]]]]");
        String FASTAPAN2 = ("(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]");



// 1. FASTA1YMO - FASTA2K95
//EDITDISTANCE=1
//GLOBALCOMPARISON=46
//LOCALCOMPARISON=46
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2K95, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2K95, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2K95, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 2. FASTA1YMO - FASTA2M8K
//EDITDISTANCE=7
//GLOBALCOMPARISON=36
//LOCALCOMPARISON=37
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 3. FASTA1YMO - FASTA4PLX
//EDITDISTANCE=32
//GLOBALCOMPARISON=12
//LOCALCOMPARISON=24
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 4. FASTA1YMO - FASTAhTER
//EDITDISTANCE=112
//GLOBALDISTANCE=-65
//LOCALCOMPARISON=29
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 5. FASTA1YMO - FASTAMALAT1
//EDITDISTANCE=49
//GLOBALCOMPARISON=-5
//LOCALCOMPARISON=20
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 6. FASTA1YMO - FASTAPAN1
//EDITDISTANCE=20
//GLOBALCOMPARISON=18
//LOCALCOMPARISON=20
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 7. FASTA1YMO - FASTAPAN2
//EDITDISTANCE=26
//GLOBALCOMPARISON=3
//LOCALCOMPARISON=13
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 8. FASTA2K95 - FASTA2M8K
//EDITDISTANCE=7
//GLOBALCOMPARISON=36
//LOCALCOMPARISON=37
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 9. FASTA2K95 - FASTA4PLX
//EDITDISTANCE=32
//GLOBALCOMPARISON=12
//LOCALCOMPARISON=25
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 10. FASTA2K95 - FASTAhTER
//EDITDISTANCE=111
//GLOBALCOMPARISON=-63
//LOCALCOMPARISON=29
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 11. FASTA2K95 - FASTAMALAT1
//EDITDISTANCE=49
//GLOBALCOMPARISON=-5
//LOCALCOMPARISON=20
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 12. FASTA2K95 - FASTAPAN1
//EDITDISTANCE=19
//GLOBALCOMPARISON=20
//LOCALCOMPARISON=21
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 13. FASTA2K95 - FASTAPAN2
//EDITDISTANCE=25
//GLOBALCOMPARISON=2
//LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 14. FASTA2M8K - FASTA4PLX
//EDITDISTANCE=31
//GLOBALCOMPARISON=15
//LOCALCOMPARISON=30
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 15. FASTA2M8K - FASTAhTER
//EDITDISTANCE=115
//GLOBALCOMPARISON=-71
//LOCALCOMPARISON=22
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 16. FASTA2M8K - FASTAMALAT1
//EDITDISTANCE=48
//GLOBALCOMPARISON=-3
//LOCALCOMPARISON=24
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 17. FASTA2M8K - FASTAPAN1
//EDITDISTANCE=23
//GLOBALCOMPARISON=12
//LOCALCOMPARISON=19
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 18. FASTA2M8K - FASTAPAN2
//EDITDISTANCE=27
//GLOBALCOMPARISON=1
//LOCALCOMPARISON=13
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 19. FASTA4PLX - FASTAhTER
//EDITDISTANCE=97
//GLOBALCOMPARISON=-34
//LOCALCOMPARISON=20
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 20. FASTA4PLX - FASTAMALAT1
//EDITDISTANCE=19
//GLOBALCOMPARISON=56
//LOCALCOMPARISON=57
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 21. FASTA4PLX - FASTAPAN1
//EDITDISTANCE=27
//GLOBALCOMPARISON=23
//LOCALCOMPARISON=27
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 22. FASTA4PLX - FASTAPAN2
//EDITDISTANCE=36
//GLOBALCOMPARISON=6
//LOCALCOMPARISON=17
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 23. FASTAhTER - FASTAMALAT1
//EDITDISTANCE=80
//GLOBALCOMPARISON=-1
//LOCALCOMPARISON=36
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 24. FASTAhTER - FASTAPAN1
//EDITDISTANCE=107
//GLOBALCOMPARISON=-55
//LOCALCOMPARISON=24
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 25. FASTAhTER - FASTAPAN2
//EDITDISTANCE=118
//GLOBALCOMPARISON=-77
//LOCALCOMPARISON=16
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 26. FASTAMALAT1 - FASTAPAN1
//EDITDISTANCE=38
//GLOBALCOMPARISON=17
//LOCALCOMPARISON=29
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 27. FASTAMALAT1 - FASTAPAN2
//EDITDISTANCE=49
//GLOBALCOMPARISON=-5
//LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 28. FASTAPAN1 - FASTAPAN2
//EDITDISTANCE=13
//GLOBALCOMPARISON=31
//LOCALCOMPARISON=34
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

    }
}

