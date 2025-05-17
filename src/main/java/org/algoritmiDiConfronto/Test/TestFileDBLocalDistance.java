package org.algoritmiDiConfronto.Test;

import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;

import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;

public class TestFileDBLocalDistance {
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




        //stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2K95, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB1YMO, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB2M8K, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, MALAT1completionof4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2K95, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, DB4PLX, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, MALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB2M8K, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, hTER, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, MALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(DB4PLX, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, MALAT1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(hTER, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1, PAN1, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(MALAT1, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

//stampaAlgoritmo.eseguiAlgoritmoSuCoppie(PAN1, PAN2, TipologiaCoppie.COPPIE_CARATTERI, TipologiaCoppie.COPPIE_CARATTERI, TipologiaAlgoritmi.LOCALDISTANCE);

    }

}
