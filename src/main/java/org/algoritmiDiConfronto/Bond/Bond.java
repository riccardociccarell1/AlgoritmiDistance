package org.algoritmiDiConfronto.Bond;

import org.algoritmiDiConfronto.GestioneCoppie.Coppie;


/**
 * La classe Bond rappresenta una coppia di Coppie.
 *
 *   Ogni {@code Bond} contiene quindi due {@code Coppie}:
 *   - la prima rappresenta un nucleotide e la sua posizione di apertura (A,()
 *   - la seconda rappresenta il nucleotide appaiato e la sua posizione di chiusura  (U,))
 *
 **/
public class Bond {
   private Coppie primaCoppia;
   private Coppie secondaCoppia;

   private char parentesiAperta;
   private char parentesiChiusa;

    public Bond(char lettera1, int indice1, char lettera2, int indice2, char parentesiAperta, char parentesiChiusa) {
        this.primaCoppia = new Coppie(lettera1, indice1);
        this.secondaCoppia = new Coppie(lettera2, indice2);
        this.parentesiAperta = parentesiAperta;
        this.parentesiChiusa = parentesiChiusa;
    }

    public Coppie getBase1() {
        return primaCoppia;
    }

    public Coppie getBase2() {
        return secondaCoppia;
    }

    public char getParentesiAperta() {return parentesiAperta;}
    public char getParentesiChiusa() {return parentesiChiusa;}

    @Override
    public String toString() {
        return "(" + this.primaCoppia + " <-> " + this.secondaCoppia + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bond other = (Bond) obj;
        return primaCoppia.getPrimoelemento().equals(other.primaCoppia.getPrimoelemento())
                && secondaCoppia.getPrimoelemento().equals(other.secondaCoppia.getPrimoelemento())
                && parentesiAperta == other.parentesiAperta
                && parentesiChiusa == other.parentesiChiusa;
    }

    @Override
    public int hashCode() {
        return 31 * primaCoppia.hashCode() + secondaCoppia.hashCode();
    }

    public static int similaritaBond(Object primoBond, Object secondoBond) {
        if (bondUguali(primoBond,secondoBond)) {
           return 1 ;
        }
        return -1;
    }


    private static boolean bondUguali(Object object1, Object object2) {
        Bond bond1 = (Bond) object1;
        Bond bond2 = (Bond) object2;
    if ((bond1.primaCoppia.getPrimoelemento().equals(bond2.primaCoppia.getPrimoelemento()))
            &&(bond1.secondaCoppia.getPrimoelemento().equals(bond2.secondaCoppia.getPrimoelemento())))
                    return true;
            {
              return false;
            }
    }
}

