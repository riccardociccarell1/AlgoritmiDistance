package org.algoritmiDiConfronto.Bond;

import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;

import java.util.List;

import static org.algoritmiDiConfronto.Bond.Bond.similaritaBond;

public class BondLocalComparison extends AlgoritmoBaseGenerics {
    @Override
    public String stampaTesto() {
        return "LOCAL COMPARISON  ";
    }

    @Override
    public int inizializzazioneRigaColonna() {
        return 0;
    }

    @Override
    public String significatoUltimoElemento() {
        return "LA LOCALCOMPARISON CORRISPONDE A:";
    }

    @Override
    public int pesoAlgoritmo() {
        return -1;
    }

    @Override
    public int pesoCaratteri(Object elemento1, Object elemento2) {
        return similaritaBond(elemento1,elemento2) ;
    }

    @Override
    public int calcola(int a, int b, int c) {
        return 0;
    }

    @Override
    public int valoreDipartenzax(List<?> X, List<List<Integer>> M) {
        return 0;
    }

    @Override
    public int valoredipartenzay(List<?> Y, List<List<Integer>> M) {
        return 0;
    }

    @Override
    public boolean condizione(int m, int n, List<List<Integer>> M) {
        return false;
    }
}
