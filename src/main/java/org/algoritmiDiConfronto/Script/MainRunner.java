package org.algoritmiDiConfronto.Script;

import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.algoritmi.*;
import org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation;


import java.io.IOException;
import java.util.List;

import static org.algoritmiDiConfronto.Stampa.ControlliStampa.controlloAlgoritmo;

public class MainRunner {
    public static void main(String[] args) throws IOException {
        if (args.length != 5) {
            throw new IllegalArgumentException("Usage: java MainRunner <string1> <string2> <tipoElemento> <algoritmo> <filename>");

        }


        String s1 = args[0];
        String s2 = args[1];
        String tipo = args[2].toUpperCase();
        String algoritmo = args[3].toUpperCase();
        String filename = args[4];

        TipologiaAlgoritmi tipoalgoritmi;
        if (algoritmo.equals("1")) {tipoalgoritmi = TipologiaAlgoritmi.EDITDISTANCE;}
        else if (algoritmo.equals("2")) {tipoalgoritmi = TipologiaAlgoritmi.GLOBALDISTANCE;}
        else  {tipoalgoritmi = TipologiaAlgoritmi.LOCALDISTANCE;}

        AlgoritmoBaseGenerics algoritmoScelto = controlloAlgoritmo(tipoalgoritmi);

        List<?> lista1, lista2;
        switch (tipo) {
            case "1" -> {
                lista1 = InputTrasformation.stringaToListaCaratteri(s1);
                lista2 = InputTrasformation.stringaToListaCaratteri(s2);
            }
            case "2" -> {
                lista1 = InputTrasformation.stringaToListaInteri(s1);
                lista2 = InputTrasformation.stringaToListaInteri(s2);
            }
            default -> throw new IllegalArgumentException("Tipo non supportato");
        }

        List<List<Integer>> matrice = algoritmoScelto.matrix(lista1, lista2);
        List<List<String>> allineamento = algoritmoScelto.calcolaAllineamento(lista1, lista2, matrice);



        // Genera CSV
        CSVGenerator.stampaMatriceCSV(lista1, lista2,matrice,allineamento,algoritmoScelto, filename + ".csv");

        System.out.println("Matrice generata e salvata come: " + filename + ".csv");
    }
}