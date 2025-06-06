package org.algoritmiDiConfronto.Test;

import org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation;
import org.algoritmiDiConfronto.algoritmi.GreedyLineare;

import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;

public class TestGreedyLineare {
    public static void main(String[] args) {

        GreedyLineare gl = new GreedyLineare();


        String FASTA1YMO = ("ABCD");
        String FASTA2K95 = ("ABD");

        List<Character> prima = stringaToListaCaratteri(FASTA1YMO);
        List<Character> seconda = stringaToListaCaratteri(FASTA2K95);

        gl.eseguiGreedyLineare(prima,seconda);




    }
}
