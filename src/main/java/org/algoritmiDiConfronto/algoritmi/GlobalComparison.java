package org.algoritmiDiConfronto.algoritmi;

import java.util.List;


/**
 nella globalcomparison:

 Ogni match (elementi uguali) ha punteggio +1.

 Ogni mismatch o gap (inserimento/cancellazione) ha punteggio -1.

 L'obiettivo è massimizzare il punteggio totale dell'allineamento ottimo tra le due sequenze
 VIENE PRESSA IN CONSIDERAZIONE TUTTA LA SEQUENZA
 **/
public class GlobalComparison extends AlgoritmoBaseGenerics {


    @Override
    public String stampaTesto() {
        return "GLOBAL COMPARISON";
    }

    @Override
    public int inizializzazioneRigaColonna() {
        return -1;
    }

    @Override
    public String significatoUltimoElemento() {
        return "LA GLOBALCOMPARISON CORRISPONDE A:";
    }

    @Override
    public int pesoAlgoritmo() {
        return -1;
    }



    /**
     *
     * @param elemento2 stringa
     * @param elemento1
     * @return 1 se sono uguali -1 altrimenti
     */
    @Override
    public int pesoCaratteri(Object elemento1, Object elemento2) {
        // Se sono entrambi caratteri
        if (elemento1 instanceof Character && elemento2 instanceof Character) {
            char c1 = (Character) elemento1;
            char c2 = (Character) elemento2;

            if (c1 == c2) {
                if (c1 == '.' && c2 == '.') {
                    return -1;
                } else {
                    return 1;
                }
            }
            return -1;
        }
        if(elemento1.equals(elemento2)) {
            return 1;
        }
        return -1;
    }

    @Override
    public int calcola(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);

    }

    /**
     *
     * @param X stringa
     * @param M
     * @return la lunghezza di y
     */
    @Override
    public int valoreDipartenzax(List<?> X, List<List<Integer>> M) {
        return X.size();
    }


    /**
     *
     * @param Y stringa
     * @param M
     * @return la lunghezza di y
     */
    @Override
    public int valoredipartenzay(List<?> Y, List<List<Integer>> M) {
        return Y.size();
    }


    /**
     *
     * condizione per la creazione dell'allineamento
     */
    @Override
    public boolean condizione(int m, int n, List<List<Integer>> M) {
        return  m > 0 || n > 0;

    }

    @Override
    public double valorePercentuale(int valore, List<?> X, List<?> Y) {
        int maxLen = Math.max(X.size(), Y.size());
        return (double) valore * 100 / maxLen;
    }
}

