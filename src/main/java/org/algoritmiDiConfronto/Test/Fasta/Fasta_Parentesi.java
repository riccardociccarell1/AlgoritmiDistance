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
        String uno = ("....((((((.(((((((((.(((...((((...((((((((...(((.....))).)))))))).....((((((((((......))))))).)))((((..(((.((.((((((((...((((((.((...((((((....((((....)))).......)))))).)).))).............((.(((.((((((....)))))).))).))..........)))...)))))))).)))))..))))....)))))))))))))........(((((((.((((((((.(((((..(((.........)))))))).....(((((((((((..(((.((....((((((.(((...))).))))))......)))))))))))))))).....))))))))...))).))))))).)))))).........(((((..........)))))..........((((((.((((((....(((((.......))))).......)).)))))).))))........");
        String due = (".............((((.((((((....................................................................................................................................................................................(((((.....(((((....................))))))))))..))))))))))..................................................................................................................................................................................(((((...(...((((......))))...)))))).(((((.(((((((.....................................)))))))))).)).........");


        stampaAlgoritmo.eseguiAlgoritmoSuListe(uno, due, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(uno, due, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(uno, due, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);


// 1. FASTA1YMO - FASTA2K95
//EDITDISTANCE=1
//GLOBALCOMPARISON=46
//LOCALCOMPARISON=46
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2K95, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2K95, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2K95, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 2. FASTA1YMO - FASTA2M8K

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 3. FASTA1YMO - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 4. FASTA1YMO - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 5. FASTA1YMO - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 6. FASTA1YMO - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 7. FASTA1YMO - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA1YMO, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 8. FASTA2K95 - FASTA2M8K

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA2M8K, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 9. FASTA2K95 - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 10. FASTA2K95 - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 11. FASTA2K95 - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 12. FASTA2K95 - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 13. FASTA2K95 - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2K95, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 14. FASTA2M8K - FASTA4PLX

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTA4PLX, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 15. FASTA2M8K - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 16. FASTA2M8K - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 17. FASTA2M8K - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 18. FASTA2M8K - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA2M8K, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 19. FASTA4PLX - FASTAhTER

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAhTER, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 20. FASTA4PLX - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 21. FASTA4PLX - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 22. FASTA4PLX - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTA4PLX, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 23. FASTAhTER - FASTAMALAT1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAMALAT1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 24. FASTAhTER - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 25. FASTAhTER - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAhTER, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 26. FASTAMALAT1 - FASTAPAN1

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN1, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 27. FASTAMALAT1 - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAMALAT1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

// 28. FASTAPAN1 - FASTAPAN2

        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuListe(FASTAPAN1, FASTAPAN2, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALCOMPARISON);

    }
}

