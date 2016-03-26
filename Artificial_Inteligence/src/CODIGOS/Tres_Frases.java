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
    public static void Tres_Frases(String p1, String p2, String p3){
        if(p1.equals("que")){//QUE
            if(p2.equals("horas")){//HORAS
                if(p3.equals("são")){//SÃO
                    Duas_Frases f2 = new Duas_Frases();
                    f2.Duas_Frases("que","horas");
                }//SÃO
            }//HORAS
            else
            if(p2.equals("dia")){//DIA
                if(p3.equals("hoje")){//HOJE
                    Duas_Frases f2 = new Duas_Frases();
                    f2.Duas_Frases("que", "dia");
                }//HOJE
            }//DIA
        }//QUE
        else
        if(p1.equals("qual")){//QUAL
            if(p2.equals("seu")){
                if(p3.equals("nome")){
                    JOptionPane.showMessageDialog(null,"Ainda não tenho um nome");
                }
            }
        }//QUAL
    }
}
