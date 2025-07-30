package org.algoritmiDiConfronto.Test.GenerazioneCSV;

import org.algoritmiDiConfronto.Bond.Bond;
import org.algoritmiDiConfronto.Bond.BondLocalComparison;
import org.algoritmiDiConfronto.algoritmi.EditDistance;
import org.algoritmiDiConfronto.algoritmi.GlobalComparison;
import org.algoritmiDiConfronto.algoritmi.LocalComparison;

import java.io.*;
import java.util.List;

import static org.algoritmiDiConfronto.Bond.ParserBond.parseBond;

public class Bond_Molecola_Input {

    /**
     * classe che, dato un file e un bond in input
     * restituisce un file con il confronto(bondlocalcomparison) tra tutte le molecole
     *
     */


    static List<Bond> HOTAIR = parseBond("GGGACUCGCCUGUGCUCUGGAGCUUGAUCCGAAAGCUUCCACAGUGAGGACUGCUCCGUGGGGGUAAGAGAGCACCAGGCACUGAGGCCUGGGAGUUCCACAGACCAACACCCCUGCUCCUGGCGGCUCCCACCCGGGGCUUAGACCCUCAGGUCCCUAAUAUCCCGGAGGUGCUCUCAAUCAGAAAGGUCCUGCUCCGCUUCGCAGUGGAAUGGAACGGAUUUAGAAGCCUGCAGUAGGGGAGUGGGGAGUGGAGAGAGGGAGCCCAGAGUUACAGACGGCGGCGAGAGGAAGGAGGGGCGUCUUUAUUUUUUUAAGGCCCCAAAGAGUCUGAUGUUUACAAGACCAGAAAUGCCACGGCCGCGUCCUGGCAGAGAAAAGGCUGAAAUGGAGGACCGGCGCCUUCCUUAUAAGUAUGCACAUUGGCGAGAGAAUUAAGUGCUGCAACCUAAACCAGCAAUUACACCCAAGCUCGUUGGGGCCUAAGCCAGUACCGACCUGGUAGAAAAAGCAACCACGAAGCUAGAGAGAG",
            "....((((((.(((((((((.(((...((((...((((((((...(((.....))).)))))))).....((((((((((......))))))).)))((((..(((.((.((((((((...((((((.((...((((((....((((....)))).......)))))).)).))).............((.(((.((((((....)))))).))).))..........)))...)))))))).)))))..))))....)))))))))))))........(((((((.((((((((.(((((..(((.........)))))))).....(((((((((((..(((.((....((((((.(((...))).))))))......)))))))))))))))).....))))))))...))).))))))).)))))).........(((((..........)))))..........((((((.((((((....(((((.......))))).......)).)))))).))))........");

    public static void main(String[] args) {
        BondLocalComparison bondLocalComparison = new BondLocalComparison();
        String folderPath = "src/main/resources/more500char";
        String csvPath = "bond_Local_500.csv";

        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(csvPath))) {
            // Intestazione CSV
            csvWriter.write("Molecola1,Molecola2, GlobalDistance");
            csvWriter.newLine();

            File folder = new File(folderPath);
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                            String primaLinea = br.readLine();
                            String secondaLinea = br.readLine();

                            List<Bond> molecolaDaConfrontare = parseBond(primaLinea, secondaLinea);



                            List<List<Integer>> matrice = bondLocalComparison.matrix(HOTAIR, molecolaDaConfrontare );
                            List<List<String>> allineamenti = bondLocalComparison.calcolaAllineamento(HOTAIR, molecolaDaConfrontare, matrice);


                            int x = bondLocalComparison.maggiorValoreindicex(matrice);
                            int y = bondLocalComparison.maggiorValoreindicey(matrice);
                            int maxVal = matrice.get(x).get(y);
                            //int maxVal = matrice.getLast().getLast();



                            String alignedFisso = "\"" + String.join(",", allineamenti.get(0)) + "\"";
                            String alignedRiga = "\"" + String.join(",", allineamenti.get(1)) + "\"";

                            alignedFisso = alignedFisso.replace("\n", "").replace("\r", "");
                            alignedRiga = alignedRiga.replace("\n", "").replace("\r", "");
                            // Scrivi nel CSV
                            csvWriter.write("HOTAIR"+","+file.getName() + "," + bondLocalComparison.valorePercentuale(maxVal,HOTAIR, molecolaDaConfrontare));
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