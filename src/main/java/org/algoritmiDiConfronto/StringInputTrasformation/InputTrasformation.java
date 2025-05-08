package org.algoritmiDiConfronto.StringInputTrasformation;


import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;

import java.util.ArrayList;
import java.util.List;


public class InputTrasformation {

    public static List<Character> stringaToListaCaratteri(String sequenza) {
        List<Character> caratteri = new ArrayList<>();
        for (char c : sequenza.toCharArray()) {
            caratteri.add(c);
        }
        return caratteri;
    }

    public static List<Integer> stringaToListaInteri(String sequenza) {
        List<Integer> numeri = new ArrayList<>();
        for (int c : sequenza.toCharArray()) {
            numeri.add(c);
        }
        return numeri;
    }




    public static List<Coppie> CreaListaCoppie(String primastringa, String secondastringa, TipologiaCoppie tipologia)
    {
        if(primastringa.length() != secondastringa.length()){
            throw new RuntimeException("LE STRINGHE NON HANNO LUNGHEZZA UGUALE");
        }
        List<?>  primalista = null;
        List<?>  secondalista = null;
        List<Coppie> coppielist = new ArrayList<>();

        if (tipologia.equals(TipologiaCoppie.COPPIE_INTERI)){
            primalista = stringaToListaInteri(primastringa);
            secondalista = stringaToListaInteri(secondastringa);
        }
        else if (tipologia.equals(TipologiaCoppie.COPPIE_CARATTERI)){
            primalista = stringaToListaCaratteri(primastringa);
            secondalista = stringaToListaCaratteri(secondastringa);
        }
        else if (tipologia.equals(TipologiaCoppie.COPPIE_CARATTERE_INTERO)){
            primalista = stringaToListaCaratteri(primastringa);
            secondalista = stringaToListaInteri(secondastringa);
        }
        else if (tipologia.equals(TipologiaCoppie.COPPIE_INTERO_CARATTERE)){
            primalista = stringaToListaInteri(primastringa);
            secondalista = stringaToListaCaratteri(secondastringa);
        }
        else{System.err.println("coppia non supportata");}
        for(int i = 0; i < primastringa.length(); i++){
            Coppie newcoppia = new Coppie(primalista.get(i),secondalista.get(i));
            coppielist.add(newcoppia);
        }

        return coppielist;
    }








}


