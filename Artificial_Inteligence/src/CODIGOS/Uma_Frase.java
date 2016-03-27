/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Uma_Frase {
    
    GUI_Teste t = new GUI_Teste();
    
    String nome = t.nome;
    
    public void Uma_Frase(String p1){
        if(
          (p1.equals("oi")) || (p1.equals("Oi")) || (p1.equals("OI")) || 
          (p1.equals("olá")) || (p1.equals("Olá")) || (p1.equals("OLÁ")) || 
          (p1.equals("ola")) || (p1.equals("Ola")) || (p1.equals("OLA"))
          ){
            
            if(t.na == 0){
             JOptionPane.showMessageDialog(null,"Oi "+nome);   
            }
            else
            if(t.na == 1){
             JOptionPane.showMessageDialog(null,"Oi tudo bom "+nome);   
            }
            else
            if(t.na == 2){
             JOptionPane.showMessageDialog(null,"Olá "+nome);   
            }
            else
            if(t.na == 3){
             JOptionPane.showMessageDialog(null,"Oi como vai "+nome);   
            }
        }
/*========================================================================================================================================================*/
        else
        if(
          ((p1.equals("horas")) || (p1.equals("Horas")) || (p1.equals("HORAS")) || 
           (p1.equals("hora")) || (p1.equals("Hora")) || (p1.equals("HORA")))
          ){
            Duas_Frases f2 = new Duas_Frases();
            f2.Duas_Frases("que","horas");
        }
/*========================================================================================================================================================*/
        else
        if(
          ((p1.equals("dia")) || (p1.equals("Dia")) || (p1.equals("DIA")))
          ){
            Duas_Frases f2 = new Duas_Frases();
            f2.Duas_Frases("que","dia");
        }
/*========================================================================================================================================================*/
        else
        {
            JOptionPane.showMessageDialog(null,"Eu não entendi o que você quis dizer "+nome); 
        }
    }
}
