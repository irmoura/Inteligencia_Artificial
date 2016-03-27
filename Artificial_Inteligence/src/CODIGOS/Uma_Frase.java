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
          (p1.equals("olá")) || (p1.equals("Olá")) || (p1.equals("OLÁ")) || (p1.equals("ola")) || (p1.equals("Ola")) || (p1.equals("OLA"))
          ){//INICIO CUMPRIMENTOS
            
            if(t.na == 0){
             System.out.println("PC Diz: "+"Oi "+nome);
             JOptionPane.showMessageDialog(null,"Oi "+nome);   
            }
            else
            if(t.na == 1){
             System.out.println("PC Diz: "+"Oi tudo bom "+nome);
             JOptionPane.showMessageDialog(null,"Oi tudo bom "+nome);   
            }
            else
            if(t.na == 2){
             System.out.println("PC Diz: "+"Olá "+nome);
             JOptionPane.showMessageDialog(null,"Olá "+nome);   
            }
            else
            if(t.na == 3){
             System.out.println("PC Diz: "+"Oi como vai "+nome);
             JOptionPane.showMessageDialog(null,"Oi como vai "+nome);   
            }
        }//FIM CUMPRIMENTOS
        else
        if(
          (p1.equals("horas")) || (p1.equals("Horas")) || (p1.equals("HORAS"))
          ){
            Duas_Frases f2 = new Duas_Frases();
            f2.Duas_Frases("que","horas");
        }
        else
        if(
          (p1.equals("dia")) || (p1.equals("Dia")) || (p1.equals("DIA"))
          ){
            Duas_Frases f2 = new Duas_Frases();
            f2.Duas_Frases("que","dia");
        }
        else
        {
            System.out.println("PC Diz: "+"Eu não entendi o que você quis dizer "+nome);
            JOptionPane.showMessageDialog(null,"Eu não entendi o que você quis dizer "+nome); 
        }
    }
}
