package org.algoritmiDiConfronto.Test.Telomerase;

import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaSingoliElementi;

import static org.algoritmiDiConfronto.Bond.ParserBond.parseBondParentesi;

public class provaTelomerase {
    public static void main(String[] args) {

        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();

        String t7lma = ("(((()))([[)]])((((()))))");
        String t7lmb = ("((())([[)]])(((())))");

        stampaAlgoritmo.eseguiAlgoritmoSuListe(t7lma, t7lmb, TipologiaSingoliElementi.CHARACTER, TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.GLOBALCOMPARISON);

    }


}