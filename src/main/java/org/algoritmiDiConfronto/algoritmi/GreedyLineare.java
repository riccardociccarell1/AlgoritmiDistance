package org.algoritmiDiConfronto.algoritmi;

import java.util.ArrayList;
import java.util.List;

public class GreedyLineare {

    public  boolean Sottosequenza(List<?> seq, List<?> subseq) {
        int j = 0;

        for (int i = 0; i < seq.size(); i++) {
            if (!seq.get(i).equals(subseq.get(j))) {return false;}
            if (j < subseq.size() && seq.get(i).equals(subseq.get(j))) {
                j++;
            }
            if (j == subseq.size()) {
                return true;
            }
        }

        return false;
    }


    public void eseguiGreedyLineare(List<?> seq, List<?> subseq) {
        if (Sottosequenza(seq, subseq)) {
            System.out.println(new ArrayList<>(subseq) + " è sottosequenza di " + new ArrayList<>(seq));
        } else {
            System.out.println(new ArrayList<>(subseq) + " non è sottosequenza di " + new ArrayList<>(seq));
        }
    }
}
