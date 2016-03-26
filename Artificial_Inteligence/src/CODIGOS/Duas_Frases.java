/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Duas_Frases {

    GUI_Teste t = new GUI_Teste();
    
    Calendar calendario = Calendar.getInstance();
    int hora = calendario.get(Calendar.HOUR);
    int minuto = calendario.get(Calendar.MINUTE);
    int dia_int = calendario.get(Calendar.DAY_OF_WEEK);
    String nome = t.nome;
    
    public void Duas_Frases(String p1, String p2){
        
        if(
          (p1.equals("que")) ||
          (p1.equals("QUE"))
          ){//INICIO COMEÇANDO COM QUE
            if(
          (p2.equals("horas")) ||
          (p2.equals("HORAS"))
          ){
             JOptionPane.showMessageDialog(null,"Agora são "+hora+" horas e "+minuto+" minutos "+nome);   
            }
            else
           if(
          (p2.equals("dia")) ||
          (p2.equals("DIA"))
          ){
             if(dia_int == 1){
                 JOptionPane.showMessageDialog(null,"Hoje é domingo");
             }
             else
             if(dia_int == 2){
                 JOptionPane.showMessageDialog(null,"Hoje é segunda feira");
             }
             else
             if(dia_int == 3){
                 JOptionPane.showMessageDialog(null,"Hoje é terça feira");
             }
             else
             if(dia_int == 4){
                 JOptionPane.showMessageDialog(null,"Hoje é quarta feira");
             }
             else
             if(dia_int == 5){
                 JOptionPane.showMessageDialog(null,"Hoje é quinta feira");
             }
             else
             if(dia_int == 6){
                 JOptionPane.showMessageDialog(null,"Hoje é sexta feira");
             }
             else
             if(dia_int == 7){
                 JOptionPane.showMessageDialog(null,"Hoje é sábado");
             }
            }
        }//FIM COMEÇANDO COM QUE
        else
        if(
          (p1.equals("bom")) ||
          (p1.equals("BOM"))
          ){//INICIO COMEÇANDO COM BOM
            if(
          (p2.equals("dia")) ||
          (p2.equals("DIA"))
          ){
             JOptionPane.showMessageDialog(null,"Bom dia "+nome);   
            }
            else
            if(
          (p2.equals("trabalho")) ||
          (p2.equals("TRABALHO"))
          ){
             JOptionPane.showMessageDialog(null,"Obrigado "+nome);   
            }
            else
            if(
          (p2.equals("apetite")) ||
          (p2.equals("APETITE"))
          ){
             JOptionPane.showMessageDialog(null,"Obrigado "+nome);   
            }
        }//FIM COMEÇANDO COM BOM
        else
        if(
          (p1.equals("boa")) ||
          (p1.equals("BOA"))
          ){//INICIO COMEÇANDO COM BOA
            if(
          (p2.equals("noite")) ||
          (p2.equals("NOITE"))
          ){
                JOptionPane.showMessageDialog(null,"Boa noite "+nome);
            }
            else
            if(
          (p2.equals("tarde")) ||
          (p2.equals("TARDE"))
          ){
                JOptionPane.showMessageDialog(null,"Boa tarde "+nome);
            }
        }//FIM COMEÇANDO COM BOA
    }
}
