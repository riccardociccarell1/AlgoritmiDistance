package org.algoritmiDiConfronto.Stampa;

import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;

import java.util.List;

public interface GestioneStampa{
    void stampaTestata(String nomeAlgoritmo);
    void stampaMatrice(List<?> X, List<?> Y, List<List<Integer>> M);
    void stampaSignificato(String significato);
    void stampaValoreAlgoritmo(List<List<Integer>> M, AlgoritmoBaseGenerics algo);
    void stampaAllineamento(List<String> ALX, List<String> ALY);
    void stampaValorePercentuale(double percentuale);
    void stampaChiusura();
}


