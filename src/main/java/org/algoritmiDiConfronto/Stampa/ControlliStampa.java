package org.algoritmiDiConfronto.Stampa;

import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;
import org.algoritmiDiConfronto.algoritmi.EditDistance;
import org.algoritmiDiConfronto.algoritmi.GlobalComparison;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

/**
 * classe che permette di determinare l'algoritmo su stampa da terminale
 */

public class ControlliStampa {






    public static AlgoritmoBaseGenerics controlloAlgoritmo(TipologiaAlgoritmi algoritmo) {
        AlgoritmoBaseGenerics algo = null;
        switch (algoritmo) {
            case EDITDISTANCE ->
                    algo = new EditDistance();

            case GLOBALCOMPARISON ->
                    algo = new GlobalComparison();

            case LOCALCOMPARISON ->
                    algo = new LocalComparison();
            case BONDLOCALCOMPARISON ->
                algo = new LocalComparison();

            default -> throw new IllegalArgumentException("Algoritmo non gestito");
        }
        return algo;
    }






}
