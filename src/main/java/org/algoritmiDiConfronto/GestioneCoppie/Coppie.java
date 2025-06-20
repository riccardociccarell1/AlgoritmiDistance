package org.algoritmiDiConfronto.GestioneCoppie;



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
