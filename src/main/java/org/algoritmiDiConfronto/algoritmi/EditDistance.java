package org.algoritmiDiConfronto.algoritmi;


import java.util.List;


public class EditDistance extends AlgoritmoBaseGenerics {


    @Override
    public String stampaTesto() {
        return "EDIT DISTANCE";
    }

    @Override
    public int inizializzazioneRigaColonna() {
        return 1;
    }

    @Override
    public String significatoUltimoElemento() {
        return "la edit distance corrisponde a:";
    }

    @Override
    public int pesoAlgoritmo() {
        return 1;
    }

    @Override
    public int pesoCaratteri(Object elemento1, Object elemento2) {
        if(elemento1.equals(elemento2)){return 0;}
        else return 1;

    }

    @Override
    public int calcola(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }

    @Override
    public boolean condizione(int m, int n, List<List<Integer>> M) {
        return m>0 || n>0;
    }

    @Override
    public int valoredipartenzay(List<?> Y,  List<List<Integer>> M) {
        return Y.size();
    }

    @Override
    public int valoreDipartenzax(List<?> X,  List<List<Integer>> M) {
        return X.size();
    }
}
