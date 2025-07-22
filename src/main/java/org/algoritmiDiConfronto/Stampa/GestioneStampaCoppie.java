package org.algoritmiDiConfronto.Stampa;


import org.algoritmiDiConfronto.algoritmi.AlgoritmoBaseGenerics;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import java.util.List;

import static org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi.LOCALCOMPARISON;
/**
 * classe che gestisce la stampa delle coppie
 */
public class GestioneStampaCoppie implements GestioneStampa{
    @Override
    public void stampaTestata(String nomeAlgoritmo) {
        System.out.println(nomeAlgoritmo);
    }

    @Override
    public void stampaMatrice(List<?> X, List<?> Y, List<List<Integer>> M) {
        int n = X.size();
        int m = Y.size();

        System.out.print("          ");         // Spazio iniziale per allineare la riga 0
        System.out.printf("%10s","0");
        for (int j = 1; j <= m; j++) {
            System.out.printf("%10s",j);
        }
        System.out.println();
        System.out.print("          ");         // Spazio iniziale per allineare la riga 0
        System.out.printf("%10s","0");
        for (int j = 0; j < m; j++) {
            System.out.printf("%10s",Y.get(j));
        }
        System.out.println();

        // Stampa ogni riga con intestazione da X
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.printf("%10s","0");
            } else {
                System.out.printf("%10s",i+"."+X.get(i - 1) );
            }

            for (int j = 0; j <= m; j++) {
                System.out.printf("%10d",M.get(i).get(j));
            }
            System.out.println();
        }
    }

    @Override
    public void stampaSignificatoUltimoElemento(String significato) {
        System.out.print(significato);
    }
    @Override
    public void stampaUltimoElemento(List<List<Integer>> M, AlgoritmoBaseGenerics algo) {
        if (algo instanceof LocalComparison) {
            int indicey = 0;
            int indicex = 0;
            int max = 0;
            for (List<Integer> riga : M) {
                for (int j = 0; j < riga.size(); j++) {
                    if (riga.get(j) >= max) {
                        max = riga.get(j);
                        indicey = j;
                        indicex = M.indexOf(riga);
                    }
                }
            }
            System.out.println("x:" + indicex + ", y:" + indicey + ", valore=" + max);
        }
        else System.out.println("x:" + M.indexOf(M.getLast()) +
                ", y:" + (M.get(M.size() - 1).size() - 1) +
                ", valore=" + M.getLast().getLast());
    }


    @Override
    public void stampaAllineamento(List<String> ALX, List<String> ALY) {
        for (String alx : ALX) {
            if (alx.equals("_")) {
                System.out.print("  _  ");
            } else System.out.print(alx);
        }
        System.out.println();
        for (String aly : ALY) {
            if (aly.equals("_")) {
                System.out.print("  _  ");
            } else System.out.print(aly);
        }
        System.out.println();
    }

    @Override
    public void stampaChiusura() {
        System.out.println("-".repeat(50));

    }
}
