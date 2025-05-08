package org.algoritmiDiConfronto.Stampa;

import java.util.List;

public interface GestioneStampa{
    void stampaTestata(String nomeAlgoritmo);
    void stampaMatrice(List<?> X, List<?> Y, List<List<Integer>> M);
    void stampaSignificatoUltimoElemento(String significato);
    void stampaUltimoElemento(List<List<Integer>> M);
    void stampaAllineamento(List<String> ALX, List<String> ALY);
    void stampaChiusura();
}

