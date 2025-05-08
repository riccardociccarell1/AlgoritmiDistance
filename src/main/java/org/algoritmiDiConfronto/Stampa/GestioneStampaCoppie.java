package org.algoritmiDiConfronto.Stampa;

import java.util.List;

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
        for (int j = 0; j < m; j++) {
            System.out.printf("%10s",Y.get(j));
        }
        System.out.println();

        // Stampa ogni riga con intestazione da X
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.printf("%10s","0");
            } else {
                System.out.printf("%10s",X.get(i - 1) );
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
    public void stampaUltimoElemento(List<List<Integer>> M) {
        int ultimariga = M.size() - 1;
        int ultimacolonna = M.get(ultimariga).size() - 1;
        System.out.println(M.get(ultimariga).get(ultimacolonna));
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
