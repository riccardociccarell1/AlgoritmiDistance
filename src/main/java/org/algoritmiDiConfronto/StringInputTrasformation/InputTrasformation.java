package org.algoritmiDiConfronto.StringInputTrasformation;


import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;

import java.util.ArrayList;
import java.util.List;


public class InputTrasformation {

    public static List<Character> stringaToListaCaratteri(String sequenza) {
        for (char c : sequenza.toCharArray()) {
            if (!Character.isLetter(c) && !carattereSpeciale(c)) {
                throw new IllegalArgumentException("Errore: la stringa contiene caratteri non alfabetici.");
            }
        }
        List<Character> caratteri = new ArrayList<>();
        for (char c : sequenza.toCharArray()) {
            caratteri.add(c);
        }
        return caratteri;
    }

    public static boolean carattereSpeciale(char c) {
        return c == '[' || c == '{' || c == '(' || c == '.'
                || c == ']' || c == '}' || c == ')';
    }



    public static List<Integer> stringaToListaInteri(String sequenza) {
        // Controlla se ogni carattere della stringa è un numero tra '0' e '9'
        for (char c : sequenza.toCharArray()) {
            // Controlla se il carattere non è tra '0' e '9'
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Errore: la stringa contiene caratteri non numerici.");
            }
        }

        // Crea la lista di numeri
        List<Integer> numeri = new ArrayList<>();
        for (char c : sequenza.toCharArray()) {
            numeri.add(Character.getNumericValue(c)); // Aggiunge il valore numerico del carattere
        }

        return numeri;
    }




    public static List<Coppie> CreaListaCoppie(String primastringa, String secondastringa, TipologiaCoppie tipologia)
    {
        if(primastringa.length() != secondastringa.length()){
            throw new IllegalArgumentException("LE STRINGHE NON HANNO LUNGHEZZA UGUALE");
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
        else{ throw new IllegalArgumentException("coppia non supportata");}
        for(int i = 0; i < primastringa.length(); i++){
            Coppie newcoppia = new Coppie(primalista.get(i),secondalista.get(i));
            coppielist.add(newcoppia);
        }

        return coppielist;
    }








}










