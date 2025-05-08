package org.algoritmiDiConfronto.Stampa;

import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;
import org.algoritmiDiConfronto.algoritmi.EditDistance;
import org.algoritmiDiConfronto.algoritmi.GlobalDistance;
import org.algoritmiDiConfronto.algoritmi.LocalDistance;


public class ControlliStampa {





    public static AlgoritmoBaseGenerics controlloAlgoritmo(TipologiaAlgoritmi algoritmo) {
        AlgoritmoBaseGenerics algo = null;
        switch (algoritmo) {
            case EDITDISTANCE ->
                    algo = new EditDistance();

            case GLOBALDISTANCE ->
                    algo = new GlobalDistance();

            case LOCALDISTANCE ->
                    algo = new LocalDistance();

            default -> System.err.println("Algoritmo non gestito");
        }
        return algo;
    }






}
