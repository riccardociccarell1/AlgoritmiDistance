package org.algoritmiDiConfronto.algoritmi;

import java.util.ArrayList;
import java.util.List;

/**
 Verifica se subseq è una sottosequenza ordinata di seq.
 Ciò significa che tutti gli elementi di subseq devono apparire in seq nello stesso ordine,
 ma non necessariamente consecutivi.
 */
public class GreedyLineare {

    public boolean Sottosequenza(List<?> seq, List<?> subseq) {
        int i = 0, j = 0;

        while (i < seq.size() && j < subseq.size()) {
            if (seq.get(i).equals(subseq.get(j))) {
                j++;
            }
            i++;
        }

        return j == subseq.size(); // Se ho trovato tutti gli elementi di subseq in seq
    }


    public void eseguiGreedyLineare(List<?> seq, List<?> subseq) {
        if (Sottosequenza(seq, subseq)) {
            System.out.println(new ArrayList<>(subseq) + " è sottosequenza di " + new ArrayList<>(seq));
        } else {
            System.out.println(new ArrayList<>(subseq) + " non è sottosequenza di " + new ArrayList<>(seq));
        }
    }
}
