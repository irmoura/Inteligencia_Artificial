/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Tres_Frases {
    
    GUI_Teste t = new GUI_Teste();
    
    String nome = t.nome;
    
    public void Tres_Frases(String p1, String p2, String p3){
/*=======================================================================================================================================================*/
        if((p1.equals("que")) || (p1.equals("Que")) || (p1.equals("QUE"))){//QUE
            if((p2.equals("horas")) || (p2.equals("Horas")) || (p2.equals("HORAS")) || (p1.equals("hora")) || (p1.equals("Hora")) || (p2.equals("HORA"))){//HORAS
                if((p3.equals("são")) || (p3.equals("São")) || (p3.equals("SÃO")) || (p3.equals("sao")) || (p3.equals("Sao")) || (p3.equals("SAO"))){//SÃO
                    Duas_Frases f2 = new Duas_Frases();
                    f2.Duas_Frases("que","horas");
                }//SÃO
            }//HORAS
            else
            if(p2.equals("dia") || (p2.equals("Dia")) || (p2.equals("DIA"))){//DIA
                if(p3.equals("hoje") || (p3.equals("Hoje")) || (p3.equals("HOJE"))){//HOJE
                    Duas_Frases f2 = new Duas_Frases();
                    f2.Duas_Frases("que", "dia");
                }//HOJE
            }//DIA
        }//QUE
/*=======================================================================================================================================================*/
        else
        if(p1.equals("oi") || (p1.equals("Oi")) || (p1.equals("OI"))){//OI
            if(p2.equals("tudo") || (p2.equals("Tudo")) || (p2.equals("TUDO"))){//TUDO
                if(p3.equals("bom") || (p3.equals("Bom")) || (p3.equals("BOM"))){//BOM
                    Duas_Frases f2 = new Duas_Frases();
                    f2.Duas_Frases("que","horas");
                }//BOM
            }//TUDO
            else
            if(p2.equals("dia") || (p2.equals("Dia")) || (p2.equals("DIA"))){//DIA
                if(p3.equals("hoje") || (p3.equals("Hoje")) || (p3.equals("HOJE"))){//HOJE
                    Duas_Frases f2 = new Duas_Frases();
                    f2.Duas_Frases("que", "dia");
                }//HOJE
            }//DIA
        }//OI
/*=======================================================================================================================================================*/
        else
        if((p1.equals("eu")) || (p1.equals("Eu")) || (p1.equals("EU"))){
        if((p2.equals("amo")) || (p2.equals("Amo")) || (p2.equals("AMO")) ||
           (p2.equals("lhe")) || (p2.equals("Lhe")) || (p2.equals("LHE")) ||
           (p2.equals("TE")) || (p2.equals("Te")) || (p2.equals("te"))){
        if((p3.equals("voce")) || (p3.equals("Voce")) || (p3.equals("VOCE")) || (p3.equals("você")) || (p3.equals("Você")) || (p3.equals("VOCÊ")) || 
           (p3.equals("amo")) || (p3.equals("Amo")) || (p3.equals("AMO")) || 
           (p3.equals("vc")) || (p3.equals("Vc")) || (p3.equals("VC")) ||
           (p3.equals("tu")) || (p3.equals("Tu")) || (p3.equals("TU"))){
                    JOptionPane.showMessageDialog(null,"Eu também te amo "+nome);
                }
            }
        }
/*=======================================================================================================================================================*/
        else
        if((p1.equals("qual")) || (p1.equals("Qual")) || (p1.equals("QUAL"))){
            if((p2.equals("seu")) || (p2.equals("Seu")) || (p2.equals("SEU")) ||
              ((p2.equals("teu")) || (p2.equals("Teu")) || (p2.equals("TEU")))){
                if(p3.equals("nome") || (p3.equals("Nome")) || (p3.equals("NOME"))){
                    JOptionPane.showMessageDialog(null,"Ainda não tenho um nome "+nome);
                }
            }
        }
/*=======================================================================================================================================================*/
        else
        if((p1.equals("como")) || (p1.equals("Como")) || (p1.equals("COMO"))){
            if((p2.equals("vai")) || (p2.equals("Vai")) || (p2.equals("VAI")) ||
              ((p2.equals("esta")) || (p2.equals("Esta")) || (p2.equals("ESTA")) ||
              ((p2.equals("está")) || (p2.equals("Está")) || (p2.equals("ESTÁ"))))){
                if(p3.equals("voce") || (p3.equals("Voce")) || (p3.equals("VOCE"))){
                    JOptionPane.showMessageDialog(null,"Estou bem "+nome+" obrigado");
                }
            }
        }
/*=======================================================================================================================================================*/
        else
        if((p1.equals("voce")) || (p1.equals("Voce")) || (p1.equals("VOCE")) || (p1.equals("você")) || (p1.equals("Você")) || (p1.equals("VOCÊ")) || (p1.equals("vc")) || (p1.equals("Vc")) || (p1.equals("VC"))){
            if((p2.equals("ta")) || (p2.equals("Ta")) || (p2.equals("TA")) ||
               (p2.equals("tá")) || (p2.equals("Tá")) || (p2.equals("TÁ")) ||
              ((p2.equals("esta")) || (p2.equals("Esta")) || (p2.equals("ESTA")) ||
              ((p2.equals("está")) || (p2.equals("Está")) || (p2.equals("ESTÁ"))))){
                if(p3.equals("bem") || (p3.equals("Bem")) || (p3.equals("BEM"))){
                    JOptionPane.showMessageDialog(null,"Estou bem "+nome+" obrigado");
                }
            }
        }
    }
}