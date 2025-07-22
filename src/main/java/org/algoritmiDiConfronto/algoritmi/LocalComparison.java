package org.algoritmiDiConfronto.algoritmi;


import java.util.List;


/**
 la LocalComparison:
 Non confronta necessariamente tutta la sequenza, ma si concentra sulle sottosequenze che sono più simili.
 Serve, ad esempio, per trovare segmenti condivisi o pattern comuni tra sequenze

  **/


public class LocalComparison extends AlgoritmoBaseGenerics {


    /**
     * metodo che trova la riga da cui deve partire
     * l'allineamento ottimo
     * @param M la matrice su cui effetuare il controllo
     * **/
    public int maggiorValoreindicex(List<List<Integer>> M) {
        int indicex=0;
        int max=0;
        for (int i = 0; i < M.size(); i++) {
            for (int j = 0; j < M.get(i).size(); j++) {
                if (M.get(i).get(j) >= max) {
                    max = M.get(i).get(j);
                    indicex = i;
                }
            }
        }
        return indicex;
    }



    /**
     * metodo che trova la colonna da cui deve partire
     * l'allineamento ottimo
     * @param M la matrice su cui effetuare il controllo
     * **/
    public int maggiorValoreindicey(List<List<Integer>> M) {
        int indicey=0;
        int max=0;
        for (List<Integer> riga : M) {
            for (int j = 0; j < riga.size(); j++) {
                if (riga.get(j) >= max) {
                    max = riga.get(j);
                    indicey = j;
                }
            }
        }
        return indicey;
    }


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
        if(elemento1.equals(elemento2))return 1;
        return -1;
    }

    @Override
    public int calcola(int a, int b, int c) {
        return Math.max(Math.max(Math.max(a, b), c), 0);
    }


    /**
     *
     * @param X stringa
     * @param M
     * @return la lunghezza di y
     */
    @Override
    public int valoreDipartenzax(List<?> X, List<List<Integer>> M) {
        return  maggiorValoreindicex(M);
    }


    /**
     *
     * @param Y stringa
     * @param M
     * @return la lunghezza di y
     */
    @Override
    public int valoredipartenzay(List<?> Y, List<List<Integer>> M) {
        return maggiorValoreindicey(M);
    }

    @Override
    public boolean condizione(int m, int n, List<List<Integer>> M) {
        return m > 0 && n > 0 && M.get(m).get(n) > 0;

    }
}


