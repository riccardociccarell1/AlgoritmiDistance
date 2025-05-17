package org.algoritmiDiConfronto.Test;



import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;

import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
public class
TestFileDBEditDistance {
    public static void main(String[] args) {


        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();



        List<Coppie> DB1YMO = CreaListaCoppie("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]]]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> DB2K95 = CreaListaCoppie("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]].]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> DB2M8K = CreaListaCoppie("GGUUUCUUUUUAGUGAUUUUUCCAAACCCCUUUGUGCAAAAAUCAUUA",
                "(((((......[[[[[[[[[[.[))))).......].]]]]]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> DB4PLX = CreaListaCoppie("GGAAGGUUUUUCUUUUCCUGAGGCGAAAGUCUCAGGUUUUGCUUUUUGGCCUUUCUUAAAAAAAAAAAAAGCAAAA",
                ".(((((..........(((((((((..)))))))))[[[[[[[[[[[..)))))...........]]]]]]]]]]]", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> hTER = CreaListaCoppie("GGCCAUUUUUUGUCUAACCCUAACUGAGAAGGGCGUAGGCGCCGUGCUUUUGCUCCCCGCGGGCUGUUUUUCUCGCUGACUUUCAGCCCGCGGAAAAGCCUCGGCCUGCCGCCUUCCACCGUUCAUUCUAGAGCAAACAAAAAAUGUCAGCAGCUGGCC",
                "(((((........................(((((((((((.....((((((.....((((((((((........[[[[[[[[[))))))))))))))))....))))).))))))..........................]]].]]]]]]...)))))", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> MALAT1completionof4PLX = CreaListaCoppie("GAAGGUUUUUCUUUUCCUGAGAAAACAACACGUAUUGUUUUCUCAGGUUUUGCUUUUUGGCCUUUUUCUAGCUUAAAAAAAAAAAAAGCAAAA",
                "(((((..........(((((((((((((......)))))))))))))[[[[[[[[[[[..))))).................]]]]]]]]]]]", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> PAN1 = CreaListaCoppie("GCUGGGUUUUUCCUUCGAAAGAAGGUUUUUAUCCCAGUGUAUAAAAAAAAAAAAAAA",
                "((((((.....(((((....)))))[[[[[..))))))..............]]]]]", TipologiaCoppie.COPPIE_CARATTERI);

        List<Coppie> PAN2 = CreaListaCoppie("GGGUUUUUUCCUUCGAAAGAAGGUUUUUAUCCCUGCCUUCGGGCAAAAAAAA",
                "(((.....(((((....)))))[[[[[..)))((((....))))...]]]]]", TipologiaCoppie.COPPIE_CARATTERI);


        //EDITDISTANCE=1
        //GLOBALCOMPARISON=46
        //LOCALCOMPARISON=46
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2K95, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2K95, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2K95, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=25
        //GLOBALCOMPARISON=1
        //LOCALCOMPARISON=4
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=48
        //GLOBALCOMPARISON=-18
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=112
        //GLOBALCOMPARISON=10
        //LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=64
        //GLOBALCOMPARISON=-33
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=38
        //GLOBALCOMPARISON=-14
        //LOCALCOMPARISON=3
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=38
        //GLOBALCOMPARISON=-14
        //LOCALCOMPARISON=1
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=25
        //GLOBALCOMPARISON=1
        //LOCALCOMPARISON=3
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=48
        //GLOBALCOMPARISON=-18
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=111
        //GLOBALCOMPARISON=-63
        //LOCALCOMPARISON=12
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=64
        //GLOBALCOMPARISON=-33
        //LOCALCOMPARISON=5
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=39
        //GLOBALCOMPARISON=-15
        //LOCALCOMPARISON=2
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=39
        //GLOBALCOMPARISON=-15
        //LOCALCOMPARISON=0
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=52
        //GLOBALCOMPARISON=-27
        //LOCALCOMPARISON=3
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=122
        //GLOBALCOMPARISON=-85
        //LOCALCOMPARISON=0
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=66
        //GLOBALCOMPARISON=-38
        //LOCALCOMPARISON=3
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-22
        //LOCALCOMPARISON=0
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=39
        //GLOBALCOMPARISON=-19
        //LOCALCOMPARISON=0
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=112
        //GLOBALCOMPARISON=-65
        //LOCALCOMPARISON=0
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=22
        //GLOBALCOMPARISON=51
        //LOCALCOMPARISON=50
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=36
        //GLOBALCOMPARISON=5
        //LOCALCOMPARISON=10
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=42
        //GLOBALCOMPARISON=-7
        //LOCALCOMPARISON=4
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=111
        //GLOBALCOMPARISON=-61
        //LOCALCOMPARISON=1
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=121
        //GLOBALCOMPARISON=-83
        //LOCALCOMPARISON=0
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=126
        //GLOBALCOMPARISON=-92
        //LOCALCOMPARISON=0
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=51
        //GLOBALCOMPARISON=-9
        //LOCALCOMPARISON=8
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1completionof4PLX, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1completionof4PLX, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1completionof4PLX, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=58
        //GLOBALCOMPARISON=-23
        //LOCALCOMPARISON=4
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1completionof4PLX, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1completionof4PLX, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1completionof4PLX, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

        //EDITDISTANCE=22
        //GLOBALCOMPARISON=14
        //LOCALCOMPARISON=17
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(PAN1, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.EDITDISTANCE);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(PAN1, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.GLOBALCOMPARISON);
        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(PAN1, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALCOMPARISON);

    }


}





