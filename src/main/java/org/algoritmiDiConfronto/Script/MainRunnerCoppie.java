package org.algoritmiDiConfronto.Script;

import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;
import org.algoritmiDiConfronto.algoritmi.*;



import java.io.IOException;
import java.util.List;

import static org.algoritmiDiConfronto.Stampa.ControlliStampa.controlloAlgoritmo;
import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
import static org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie.*;

public class MainRunnerCoppie {
    public static void main(String[] args) throws IOException {
        if (args.length != 7) {
            System.err.println("Usage: java MainRunner <string1> <string2> <tipoElemento> <algoritmo> <filename>");
            return;
        }

        String lista1coppia1 = args[0];
        String lista2coppia1 = args[1];
        String lista1coppia2 = args[2].toUpperCase();
        String lista2coppia2 = args[3].toUpperCase();
        String tipologiaCoppie = args[4];
        String tipologiaAlgoritmo = args[5];
        String filename = args[6];

        TipologiaAlgoritmi tipoalgoritmi = null;
        if (tipologiaAlgoritmo.equals("1")) {tipoalgoritmi = TipologiaAlgoritmi.EDITDISTANCE;}
        else if (tipologiaAlgoritmo.equals("2")) {tipoalgoritmi = TipologiaAlgoritmi.GLOBALDISTANCE;}
        else  {tipoalgoritmi = TipologiaAlgoritmi.LOCALDISTANCE;}

        AlgoritmoBaseGenerics algoritmoScelto = controlloAlgoritmo(tipoalgoritmi);

        TipologiaCoppie tipologia =null;
        if (tipologiaCoppie.equals("1")){ tipologia =COPPIE_INTERI ;}
        else if (tipologiaCoppie.equals("2")){ tipologia =COPPIE_CARATTERI ;}
        else if (tipologiaCoppie.equals("3")){ tipologia =COPPIE_INTERO_CARATTERE ;}
        else { tipologia =COPPIE_CARATTERE_INTERO ;}

        List<Coppie> primalista = CreaListaCoppie(lista1coppia1,lista2coppia1, tipologia);
        List<Coppie> secondalista = CreaListaCoppie(lista1coppia2,lista2coppia2, tipologia);

        List<List<Integer>> matrice = algoritmoScelto.matrix(primalista, secondalista);
        List<List<String>> allineamento = algoritmoScelto.calcolaAllineamento(primalista, secondalista, matrice);


        // Genera CSV
        CSVGenerator.stampaMatriceCSV(primalista, secondalista,matrice, allineamento, algoritmoScelto, filename + ".csv");

        System.out.println("Matrice generata e salvata come: " + filename + ".csv");
    }
}