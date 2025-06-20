package org.algoritmiDiConfronto.Bond;

import org.algoritmiDiConfronto.GestioneCoppie.Coppie;

public class Bond {
   private Coppie primaCoppia;
   private Coppie secondaCoppia;

    public Bond(char lettera1, int indice1, char lettera2, int indice2) {
        this.primaCoppia = new Coppie(lettera1, indice1);
        this.secondaCoppia = new Coppie(lettera2, indice2);
    }

    public Coppie getBase1() {
        return primaCoppia;
    }

    public Coppie getBase2() {
        return secondaCoppia;
    }

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
                && secondaCoppia.getPrimoelemento().equals(other.secondaCoppia.getPrimoelemento());
    }

    @Override
    public int hashCode() {
        return 31 * primaCoppia.hashCode() + secondaCoppia.hashCode();
    }

    public static int similaritaBond(Object primoBond, Object secondoBond) {
        if (bondUguali(primoBond,secondoBond)) {
           return 1 ;
        }
        else if (isGap(primoBond,secondoBond)) {
            return -1 ;
        }
        else {
            return -100 ;
        }
    }

    // Metodo di utilità per riconoscere la coppia gap
    private static boolean isGap(Object object1, Object object2) {
        Bond bond1 = (Bond) object1;
        Bond bond2 = (Bond) object2;
        if ((Character.isLetter((char)bond1.primaCoppia.getPrimoelemento()) &&
                (Character.isLetter((char)bond2.primaCoppia.getPrimoelemento()))) &&
                (Character.isLetter((char)bond1.secondaCoppia.getPrimoelemento()) &&
                        (Character.isLetter((char)bond2.secondaCoppia.getPrimoelemento()))))
        {
            return true;
        }
        return false;
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

