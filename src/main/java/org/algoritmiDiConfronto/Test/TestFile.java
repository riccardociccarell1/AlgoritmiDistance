package org.algoritmiDiConfronto.Test;



import org.algoritmiDiConfronto.GestioneCoppie.Coppie;
import org.algoritmiDiConfronto.Stampa.StampaAlgoritmo;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaAlgoritmi;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaCoppie;
import org.algoritmiDiConfronto.TipologiaElementi.TipologiaSingoliElementi;

import java.util.List;

import static org.algoritmiDiConfronto.StringInputTrasformation.InputTrasformation.CreaListaCoppie;
public class
TestFile {
    public static void main(String[] args) {


        StampaAlgoritmo stampaAlgoritmo = new StampaAlgoritmo();


        stampaAlgoritmo.eseguiAlgoritmoSuListe("ALBERO","LABBRO",
                TipologiaSingoliElementi.CHARACTER,TipologiaSingoliElementi.CHARACTER, TipologiaAlgoritmi.EDITDISTANCE);

        List<Coppie> primacoppia = CreaListaCoppie("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]]]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);
        List<Coppie> secondacoppia = CreaListaCoppie("GGGCUGUUUUUCUCGCUGACUUUCAGCCCCAAACAAAAAAUGUCAGCA",
                "((((((........[[[[[[[[[))))))........]]].]]]]]].", TipologiaCoppie.COPPIE_CARATTERI);
        stampaAlgoritmo.eseguiAlgoritmoSuCoppie(primacoppia,secondacoppia,TipologiaCoppie.COPPIE_CARATTERI,
                TipologiaCoppie.COPPIE_CARATTERI,TipologiaAlgoritmi.EDITDISTANCE);
    }

}



