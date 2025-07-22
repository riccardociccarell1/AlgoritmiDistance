package org.algoritmiDiConfronto.algoritmi;


import java.util.List;
import java.util.ArrayList;

/**
 * classe astratta, rappresenta l'algoritmo base che verrà poi esteso da:
 * -EditDistance
 * -GlobalComparioson
 * -LocalComparison
 *
 */

public abstract class AlgoritmoBaseGenerics {


    /**
     * metodo che stampa il nome dell'algoritmo.
     *
     */
    public abstract String stampaTesto();



    /**
     * metodo inizializza la prima riga e la prima colonna
     * varia da algoritmo ad algoritmo.
     *
     */
    public abstract int inizializzazioneRigaColonna();




    /**
     *metodo che stampa il significato dell'ultimo elemento della matrice,
     * questo dipende dall'algoritmo utilizzato.
     *
     */
    public abstract String significatoUltimoElemento();



    /**
     * Restituisce il valore associato a questo algoritmo da utilizzare nella matrice di calcolo.
     * Ad esempio, per l'Edit Distance il valore è 1
     * mentre per l'algoritmo di allineamento globale è -1.
     *
     * @return il valore da scrivere nella matrice
     */
    public abstract int pesoAlgoritmo();



    /**
     * metodo che inica il peso associato a match,
     * mismatch o sostituzione di un algoritmo, avrà un valore di
     * ritorno differente se i caratteri saranno uguali o differenti.
     * @param elemento1 primo elemento
     * @param elemento2 secondo elemento
     * @return il peso
     */
    public abstract int pesoCaratteri(Object elemento1, Object elemento2);



    /**
     * metodo che calcola il min o max tra a,b,c.
     * @param a valore alla riga precedente, stessa colonna
     * @param b valore alla stessa riga, colonna precdente
     * @param c valore alla riga precedente e colonna precedente
     * @return il numero da cercare
     */
    public abstract int calcola(int a, int b, int c);



    /**
     * metodo che restituisce l'indice della riga per il traceback,
     * per la edit distance e la global distance corrisponde all'ultimo elemento
     * della matrice.
     * @param X stringa
     * @return l'indice x da cui partire
     */
    public abstract int valoreDipartenzax(List<?> X,  List<List<Integer>> M );


    /**
     * metodo che restituisce l'indice della colonna per il traceback,
     * per la edit distance e la global distance corrisponde all'ultimo elemento
     * della matrice.
     * @param Y stringa
     * @return l'indice y da cui partire
     */
    public abstract int valoredipartenzay(List<?> Y,  List<List<Integer>> M);



    /**
     * metodo che controlla la condizione per far terminare il traceback di ogni algoritmo.
     * @param m indice riga
     * @param n indice colonna
     * @param M la matrice
     * @return true se l'algoritmo  deve continuare altrimenti false
     */
    public abstract boolean condizione(int m, int n, List<List<Integer>> M);



    /**
     * Crea la matrice per l'algoritmo specifico, seguendo
     * le regole dell'Edit Distance, della Global Distance e della Local Distance.
     *
     * @param X la prima stringa
     * @param Y la seconda stringa
     * @return la matrice
     */
    public List<List<Integer>> matrix(List<?> X, List<?> Y) {

        int n = X.size(); //lunghezza della stringa X
        int m = Y.size(); //lunghezza della stringa Y


        // Matrice M di dimensioni (n+1) x (m+1)
        List<List<Integer>> M = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= m; j++) {
                row.add(null);
            }
            M.add(row);
        }

// Inizializza la prima riga
        for (int j = 0; j <= m; j++) {
            M.getFirst().set(j, (j * inizializzazioneRigaColonna()));
        }

// Inizializza la prima colonna
        for (int i = 0; i <= n; i++) {
            M.get(i).set(0,i * inizializzazioneRigaColonna());
        }

// Calcola i valori interni della matrice
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int up =  M.get(i - 1).get(j);
                int left =  M.get(i).get(j - 1);
                int diag = M.get(i - 1).get(j - 1);
                int matchMismatch = pesoCaratteri(X.get(i - 1),Y.get(j - 1));

                int val = calcola(up + pesoAlgoritmo(), left + pesoAlgoritmo(), diag + matchMismatch);
                M.get(i).set(j, val);
            }
        }
        return M;
    }


    /**
     * metodo che crea l'allineamaento ottimo, le condizione il pesodell'algoritmo
     * ed il peso dei caratteri varia a seconda dell'algoritmo
     *
     * @param X la prima stringa
     * @param Y la seconda stringa
     * @param M la matrice su cui applicare l'algoritmo allinea
     */
    public List<List<String>> calcolaAllineamento(List<?> X, List<?> Y, List<List<Integer>> M) {

        int m = valoreDipartenzax(X, M);
        int n = valoredipartenzay(Y, M);


        List<String> ALX = new ArrayList<>();
        List<String> ALY = new ArrayList<>();

        while (condizione(m, n, M)) {

            if (m > 0 && M.get(m).get(n).equals(M.get(m - 1).get(n) + pesoAlgoritmo())) {           //cancellazione
                ALX.addFirst((X.get(m - 1)).toString());
                ALY.addFirst("_");
                m--;
            } else if (m > 0 && n > 0 && M.get(m).get(n).equals(M.get(m - 1).get(n - 1) + pesoCaratteri(X.get(m - 1),Y.get(n - 1)))) {        //corrispondenaza
                ALX.addFirst(X.get(m - 1).toString());
                ALY.addFirst(Y.get(n - 1).toString());
                m--;
                n--;
            } else {
                ALX.addFirst("_");
                ALY.addFirst(Y.get(n - 1).toString());
                n--;
            }
        }
        return List.of(ALX, ALY);
    }


}


