package org.algoritmiDiConfronto.Test;

import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaSingoliElementi;

public class FirstTest {
    public static void main(String[] args) {

        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();


        stampaAlgoritmo.eseguiAlgoritmoSuListe("ALBERO", "LABBRO",
                TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);

        stampaAlgoritmo.eseguiAlgoritmoSuListe("ALBERO", "LABBRO",
                TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALDISTANCE);

        stampaAlgoritmo.eseguiAlgoritmoSuListe("ALTERO", "TALALTRA",
                TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.LOCALDISTANCE);


    }
}
