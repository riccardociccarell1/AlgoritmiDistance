package org.algoritmiDiConfronto.GestioneCoppie;
/**
 * La classe Coppie rappresenta una coppia di oggetti generici.
 * È utile per memorizzare e gestire due elementi associati tra loro,
 * ad esempio per confronti a coppie,
 *
 * questa claasse viene utilizzata per costruire liste di coppie
 * si confronteranno quindi liste di coppie (A,})
 * dove il primo elemento rappresenta un nucleotide, il secono la aprentesi associata
 **/


public class Coppie{
    private final Object primoelemento;
    private final Object secondoelemento;

    public Coppie(Object primoelemento, Object secondoelemento) {
        this.primoelemento = primoelemento;
        this.secondoelemento = secondoelemento;
    }

    public Object getPrimoelemento() {
        return primoelemento;
    }
    public Object getSecondoelemento() {
        return secondoelemento;
    }

    @Override
    public String toString() {
        return "("+primoelemento+","+secondoelemento+")";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Se sono lo stesso oggetto
        if (obj == null || getClass() != obj.getClass()) return false; // Se l'oggetto è null o di tipo diverso
        Coppie coppie = (Coppie) obj; // Cast dell'oggetto
        return primoelemento.equals(coppie.primoelemento) && secondoelemento.equals(coppie.secondoelemento); // Confronto dei valori
    }

    @Override
    public int hashCode() {
        return 31 * primoelemento.hashCode() + secondoelemento.hashCode(); // Assicurati che hashCode sia sovrascritto quando sovrascrivi equals
    }
}
