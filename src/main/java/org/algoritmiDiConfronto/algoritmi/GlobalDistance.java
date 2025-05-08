package org.algoritmiDiConfronto.algoritmi;

import java.util.List;


public class GlobalDistance extends AlgoritmoBaseGenerics {


    @Override
    public String stampaTesto() {
        return "GLOBAL DISTANCE";
    }

    @Override
    public int inizializzazioneRigaColonna() {
        return -1;
    }

    @Override
    public String significatoUltimoElemento() {
        return "LA GLOBAL DISTANCE CORRISPONDE A:";
    }

    @Override
    public int pesoAlgoritmo() {
        return -1;
    }

    @Override
    public int pesoCaratteri(Object elemento1, Object elemento2) {
        if(elemento1.equals(elemento2))return 1;
        return -1;
    }

    @Override
    public int calcola(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);

    }

    @Override
    public int valoreDipartenzax(List<?> X, List<List<Integer>> M) {
        return X.size();
    }

    @Override
    public int valoredipartenzay(List<?> Y, List<List<Integer>> M) {
        return Y.size();
    }

    @Override
    public boolean condizione(int m, int n, List<List<Integer>> M) {
        return  m > 0 || n > 0;

    }
}

