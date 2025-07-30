package org.algoritmiDiConfronto.Test.GenerazioneCSV;

import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;
import org.algoritmiDiConfronto.algoritmi.EditDistance;
import org.algoritmiDiConfronto.algoritmi.GlobalComparison;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import java.io.*;
import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.stringaToListaCaratteri;

public class Molecola_Input {

    /**
     * classe che, dato un file e una sequenza in input
     * restituisce un file con il confronto tra tutte le molecole
     *
     */


    //static List<Character> HOTAIRNUCLEOTIDI=  stringaToListaCaratteri("GGGACUCGCCUGUGCUCUGGAGCUUGAUCCGAAAGCUUCCACAGUGAGGACUGCUCCGUGGGGGUAAGAGAGCACCAGGCACUGAGGCCUGGGAGUUCCACAGACCAACACCCCUGCUCCUGGCGGCUCCCACCCGGGGCUUAGACCCUCAGGUCCCUAAUAUCCCGGAGGUGCUCUCAAUCAGAAAGGUCCUGCUCCGCUUCGCAGUGGAAUGGAACGGAUUUAGAAGCCUGCAGUAGGGGAGUGGGGAGUGGAGAGAGGGAGCCCAGAGUUACAGACGGCGGCGAGAGGAAGGAGGGGCGUCUUUAUUUUUUUAAGGCCCCAAAGAGUCUGAUGUUUACAAGACCAGAAAUGCCACGGCCGCGUCCUGGCAGAGAAAAGGCUGAAAUGGAGGACCGGCGCCUUCCUUAUAAGUAUGCACAUUGGCGAGAGAAUUAAGUGCUGCAACCUAAACCAGCAAUUACACCCAAGCUCGUUGGGGCCUAAGCCAGUACCGACCUGGUAGAAAAAGCAACCACGAAGCUAGAGAGAG");
    //static List<Character> HOTAIRSTRUTTURA=  stringaToListaCaratteri("....((((((.(((((((((.(((...((((...((((((((...(((.....))).)))))))).....((((((((((......))))))).)))((((..(((.((.((((((((...((((((.((...((((((....((((....)))).......)))))).)).))).............((.(((.((((((....)))))).))).))..........)))...)))))))).)))))..))))....)))))))))))))........(((((((.((((((((.(((((..(((.........)))))))).....(((((((((((..(((.((....((((((.(((...))).))))))......)))))))))))))))).....))))))))...))).))))))).)))))).........(((((..........)))))..........((((((.((((((....(((((.......))))).......)).)))))).))))........");

    static List<Coppie> HOTAIR = CreaListaCoppie("GGGACUCGCCUGUGCUCUGGAGCUUGAUCCGAAAGCUUCCACAGUGAGGACUGCUCCGUGGGGGUAAGAGAGCACCAGGCACUGAGGCCUGGGAGUUCCACAGACCAACACCCCUGCUCCUGGCGGCUCCCACCCGGGGCUUAGACCCUCAGGUCCCUAAUAUCCCGGAGGUGCUCUCAAUCAGAAAGGUCCUGCUCCGCUUCGCAGUGGAAUGGAACGGAUUUAGAAGCCUGCAGUAGGGGAGUGGGGAGUGGAGAGAGGGAGCCCAGAGUUACAGACGGCGGCGAGAGGAAGGAGGGGCGUCUUUAUUUUUUUAAGGCCCCAAAGAGUCUGAUGUUUACAAGACCAGAAAUGCCACGGCCGCGUCCUGGCAGAGAAAAGGCUGAAAUGGAGGACCGGCGCCUUCCUUAUAAGUAUGCACAUUGGCGAGAGAAUUAAGUGCUGCAACCUAAACCAGCAAUUACACCCAAGCUCGUUGGGGCCUAAGCCAGUACCGACCUGGUAGAAAAAGCAACCACGAAGCUAGAGAGAG",
            "....((((((.(((((((((.(((...((((...((((((((...(((.....))).)))))))).....((((((((((......))))))).)))((((..(((.((.((((((((...((((((.((...((((((....((((....)))).......)))))).)).))).............((.(((.((((((....)))))).))).))..........)))...)))))))).)))))..))))....)))))))))))))........(((((((.((((((((.(((((..(((.........)))))))).....(((((((((((..(((.((....((((((.(((...))).))))))......)))))))))))))))).....))))))))...))).))))))).)))))).........(((((..........)))))..........((((((.((((((....(((((.......))))).......)).)))))).))))........", TipologiaCoppie.COPPIE_CARATTERI);

    public static void main(String[] args) {
        GlobalComparison localComparison = new GlobalComparison();
        String folderPath = "src/main/resources/more500char";
        String csvPath = "nucleotidi_parentesi_global_500.csv";

        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(csvPath))) {
            // Intestazione CSV
            csvWriter.write("Molecola1,Molecola2, GlobalComparsion");
            csvWriter.newLine();

            File folder = new File(folderPath);
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                            String primaLinea = br.readLine();
                            String secondaLinea = br.readLine();


                            //List<Character> molecolaDaConfrontare = stringaToListaCaratteri(primaLinea);
                            List<Coppie> molecolaDaConfrontare = CreaListaCoppie(primaLinea,secondaLinea,TipologiaCoppie.COPPIE_CARATTERI);


                            List<List<Integer>> matrice = localComparison.matrix(HOTAIR, molecolaDaConfrontare);
                            List<List<String>> allineamenti = localComparison.calcolaAllineamento(HOTAIR, molecolaDaConfrontare, matrice);


                            //int x = localComparison.maggiorValoreindicex(matrice);
                            //int y = localComparison.maggiorValoreindicey(matrice);
                            //int maxVal = matrice.get(x).get(y);
                            int maxVal = matrice.getLast().getLast();


                            String alignedFisso = "\"" + String.join(",", allineamenti.get(0)) + "\"";
                            String alignedRiga = "\"" + String.join(",", allineamenti.get(1)) + "\"";

                            // Scrivi nel CSV
                            csvWriter.write("HOTAIR"+","+file.getName() + "," + localComparison.valorePercentuale(maxVal,HOTAIR,molecolaDaConfrontare));
                            csvWriter.newLine();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                System.out.println("La cartella non esiste o è vuota");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
