package org.algoritmiDiConfronto.Stampa;

import org.algoritmiDiConfronto.Bond.Bond;
import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaSingoliElementi;
import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;


import java.util.List;

import static org.algoritmiDiConfronto.Stampa.ControlliStampa.*;
import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;
import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaInteri;

/**
 * classe che gestisce la stampa degli algoritmi su terminale,
 * la stampa è gestita in base alla tipologia della lista
 */
public class StampaAlgoritmo {

    private AlgoritmoBaseGenerics algoritmo;
    private GestioneStampa stampatore;


    public void esegui(List<?> X, List<?> Y) {
        stampatore.stampaTestata(algoritmo.stampaTesto());

        List<List<Integer>> M = algoritmo.matrix(X, Y);

        stampatore.stampaMatrice(X, Y, M);
        stampatore.stampaSignificato(algoritmo.significatoUltimoElemento());
        stampatore.stampaValoreAlgoritmo(M,algoritmo);
        stampatore.stampaValorePercentuale(algoritmo.valorePercentuale(controlloValoreAlgoritmo(algoritmo,M,X,Y),X,Y));

        List<List<String>> allineamento = algoritmo.calcolaAllineamento(X, Y, M);
        stampatore.stampaAllineamento(allineamento.get(0), allineamento.get(1));

        stampatore.stampaChiusura();
    }


    public void eseguiAlgoritmoSuListe(String primastringa, String secondastringa,
                                       TipologiaSingoliElementi tprimalista, TipologiaSingoliElementi tsecondalista,
                                       TipologiaAlgoritmi algoritmo) {
        if (tprimalista.equals(tsecondalista)) {
            stampatore = new GestioneStampaSingleElement();
            this.algoritmo = controlloAlgoritmo(algoritmo);

            if (tprimalista.equals(TipologiaSingoliElementi.INTEGER)) {
                esegui(stringaToListaInteri(primastringa), stringaToListaInteri(secondastringa));
            } else if (tprimalista.equals(TipologiaSingoliElementi.CHARACTER)) {
                esegui(stringaToListaCaratteri(primastringa), stringaToListaCaratteri(secondastringa));
            }
        } else {
            throw new IllegalArgumentException("Stringhe di diversa tipologia");
        }
    }


    public void eseguiAlgoritmoSuCoppie(List<Coppie> primacoppia, List<Coppie> secondacoppia,
                                        TipologiaCoppie tprimaCOPPIA, TipologiaCoppie tsecondaCOPPIA,
                                        TipologiaAlgoritmi algoritmo) {
        if (tprimaCOPPIA.equals(tsecondaCOPPIA)) {
            stampatore = new GestioneStampaCoppie();
            this.algoritmo = controlloAlgoritmo(algoritmo);
            esegui(primacoppia, secondacoppia);
        } else {
            throw new IllegalArgumentException("coppie di diversa tipologia");
        }
    }

    public void eseguiAlgoritmoSuBond(List<Bond> primaLista, List<Bond> secondaLista, TipologiaAlgoritmi algoritmo) {
        stampatore = new GestioneStampaBond();
        this.algoritmo = controlloAlgoritmo(algoritmo);
        esegui(primaLista, secondaLista);
    }


    public int controlloValoreAlgoritmo(AlgoritmoBaseGenerics algoritmo, List<List<Integer>> M, List<?> X, List<?> Y ) {
        int x = algoritmo.valoreDipartenzax(X,M);
        int y = algoritmo.valoredipartenzay(Y,M);
        return M.get(x).get(y);
    }


}