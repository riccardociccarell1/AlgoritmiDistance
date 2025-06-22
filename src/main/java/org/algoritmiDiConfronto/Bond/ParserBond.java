package org.algoritmiDiConfronto.Bond;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParserBond {

    public static List<Bond> parseBond(String sequenza, String struttura) {
        List<Bond> bonds = new ArrayList<Bond>();

        Stack<Integer> parentesiRotonde = new Stack<>();
        Stack<Integer> parentesiquadre = new Stack<>();
        Stack<Integer> parentesiGraffe = new Stack<>();
        Stack<Integer> parentesiMinoreMaggiore = new Stack<>();

        for (int i = 0; i < struttura.length(); i++) {
            char carattereStruttura = struttura.charAt(i);

            switch (carattereStruttura) {

                case '.' :
                    bonds.add(new Bond(sequenza.charAt(i),i,'.',-1));
                    break;

                case '(':
                    parentesiRotonde.push(i);
                    break;
                    case ')':
                        if (!parentesiRotonde.isEmpty()) {
                            int j = parentesiRotonde.pop();
                            bonds.add(new Bond(sequenza.charAt(j),j,sequenza.charAt(i),i));}
                        break;

                            case '[':
                            parentesiquadre.push(i);
                            break;
                            case ']':
                                if (!parentesiquadre.isEmpty()) {
                                    int j = parentesiquadre.pop();
                                    bonds.add(new Bond(sequenza.charAt(j),j,sequenza.charAt(i),i));
                                }
                                break;

                                            case '{':
                                            parentesiGraffe.push(i);
                                            break;
                                            case '}':
                                                if (!parentesiGraffe.isEmpty()) {
                                                    int j = parentesiGraffe.pop();
                                                    bonds.add(new Bond(sequenza.charAt(j),j,sequenza.charAt(i),i));
                                                }
                                                break;

                                                            case '<':
                                                            parentesiMinoreMaggiore.push(i);
                                                            break;
                                                            case '>':
                                                            if (!parentesiMinoreMaggiore.isEmpty()) {
                                                                int j = parentesiMinoreMaggiore.pop();
                                                                bonds.add(new Bond(sequenza.charAt(j),j,sequenza.charAt(i),i));
                                                            }
                                                            break;

            }
        }
        bonds.sort((b1, b2) -> Integer.compare((Integer) b1.getBase1().getSecondoelemento(), (Integer) b2.getBase1().getSecondoelemento()));
        return bonds;
    }



    public static List<Bond> parseBondParentesi(String struttura){
        List<Bond> bonds = new ArrayList<Bond>();

        Stack<Integer> parentesiRotonde = new Stack<>();
        Stack<Integer> parentesiquadre = new Stack<>();
        Stack<Integer> parentesiGraffe = new Stack<>();
        Stack<Integer> parentesiMinoreMaggiore = new Stack<>();

        for (int i = 0; i < struttura.length(); i++) {
            char carattereStruttura = struttura.charAt(i);

            switch (carattereStruttura) {

                case '(':
                    parentesiRotonde.push(i);
                    break;
                case ')':
                    if (!parentesiRotonde.isEmpty()) {
                        int j = parentesiRotonde.pop();
                        bonds.add(new Bond(struttura.charAt(j),j,struttura.charAt(i),i));}
                    break;

                case '[':
                    parentesiquadre.push(i);
                    break;
                case ']':
                    if (!parentesiquadre.isEmpty()) {
                        int j = parentesiquadre.pop();
                        bonds.add(new Bond(struttura.charAt(j),j,struttura.charAt(i),i));
                    }
                    break;

                case '{':
                    parentesiGraffe.push(i);
                    break;
                case '}':
                    if (!parentesiGraffe.isEmpty()) {
                        int j = parentesiGraffe.pop();
                        bonds.add(new Bond(struttura.charAt(j),j,struttura.charAt(i),i));
                    }
                    break;

                case '<':
                    parentesiMinoreMaggiore.push(i);
                    break;
                case '>':
                    if (!parentesiMinoreMaggiore.isEmpty()) {
                        int j = parentesiMinoreMaggiore.pop();
                        bonds.add(new Bond(struttura.charAt(j),j,struttura.charAt(i),i));
                    }
                    break;

            }
        }
        bonds.sort((b1, b2) -> Integer.compare((Integer) b1.getBase1().getSecondoelemento(), (Integer) b2.getBase1().getSecondoelemento()));
        return bonds;

    }
}
