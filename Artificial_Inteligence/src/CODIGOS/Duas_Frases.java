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
          (p1.equals("que")) || (p1.equals("Que")) || (p1.equals("QUE") || (p1.equals("qual")) || (p1.equals("Qual")) || (p1.equals("QUAL")))
          ){//INICIO COMEÇANDO COM QUE
            if(
          (p2.equals("horas")) || (p2.equals("Horas")) || (p2.equals("HORAS"))
          ){
             JOptionPane.showMessageDialog(null,"Agora são "+hora+" horas e "+minuto+" minutos "+nome);   
            }
            else
                if(
          (p2.equals("cidade")) || (p2.equals("Cidade")) || (p2.equals("CIDADE"))
          ){
             JOptionPane.showMessageDialog(null,"Atualmente moro no mesmo lugar que você "+nome);   
            }
            else
           if(
          (p2.equals("dia")) || (p2.equals("Dia")) || (p2.equals("DIA"))
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
          (p1.equals("bom")) || (p1.equals("Bom")) || (p1.equals("BOM"))
          ){//INICIO COMEÇANDO COM BOM
            if(
          (p2.equals("dia")) || (p2.equals("Dia")) || (p2.equals("DIA"))
          ){
             JOptionPane.showMessageDialog(null,"Bom dia "+nome);   
            }
            else
            if(
          (p2.equals("trabalho")) || (p2.equals("Trabalho")) || (p2.equals("TRABALHO"))
          ){
             JOptionPane.showMessageDialog(null,"Obrigado "+nome);   
            }
            else
            if(
          (p2.equals("apetite")) || (p2.equals("Apetite")) || (p2.equals("APETITE"))
          ){
             JOptionPane.showMessageDialog(null,"Obrigado "+nome);   
            }
        }//FIM COMEÇANDO COM BOM
        else
        if(
          (p1.equals("boa")) || (p1.equals("Boa")) || (p1.equals("BOA"))
          ){//INICIO COMEÇANDO COM BOA
            if(
          (p2.equals("noite")) || (p2.equals("Noite")) || (p2.equals("NOITE"))
          ){
                JOptionPane.showMessageDialog(null,"Boa noite "+nome);
            }
            else
            if(
          (p2.equals("tarde")) || (p2.equals("Tarde")) || (p2.equals("TARDE"))
          ){
                JOptionPane.showMessageDialog(null,"Boa tarde "+nome);
            }
        }//FIM COMEÇANDO COM BOA
        else
        if(
          (p1.equals("como")) || (p1.equals("Como")) || (p1.equals("COMO"))
          ){//COMO
            if(
          (p2.equals("vai")) || (p2.equals("Vai")) || (p2.equals("VAI"))
          ){//VAI
                JOptionPane.showMessageDialog(null,"Eu estou bem "+nome);
            }//VAI
            else
            if(
          (p2.equals("esta")) || (p2.equals("Esta")) || (p2.equals("ESTA"))
          ){//ESTA
                JOptionPane.showMessageDialog(null,"Eu estou bem "+nome);
            }//ESTA
        }//COMO
        else
        if(
          (p1.equals("amo")) || (p1.equals("Amo")) || (p1.equals("AMO"))
          ){//AMO
            if(
          (p2.equals("voce")) ||
          (p2.equals("Voce")) ||
          (p2.equals("VOCE")) ||
          (p2.equals("você")) ||
          (p2.equals("Você")) ||
          (p2.equals("VOCÊ"))
          ){
                Tres_Frases f3 = new Tres_Frases();
                f3.Tres_Frases("eu","te","amo");
            }
        }//AMO
        else
        if(
          (p1.equals("oi")) || (p1.equals("Oi")) || (p1.equals("OI"))
          ){//OI
            if(
          (p2.equals("garoto")) ||
          (p2.equals("Garoto")) ||
          (p2.equals("GAROTO")) ||
          (p2.equals("cara")) ||
          (p2.equals("Cara")) ||
          (p2.equals("CARA"))
          ){
                Uma_Frase f1 = new Uma_Frase();
                f1.Uma_Frase("oi");
            }
        }//OI
        else
        if(
          (p1.equals("tem")) || (p1.equals("Tem")) || (p1.equals("TEM"))
          ){//OI
            if(
          (p2.equals("filhos")) ||
          (p2.equals("Filhos")) ||
          (p2.equals("FILHOS")) ||
          (p2.equals("filho")) ||
          (p2.equals("Filho")) ||
          (p2.equals("FILHO")) ||
          (p2.equals("crianca")) ||
          (p2.equals("Crianca")) ||
          (p2.equals("CRIANCA") ||
          (p2.equals("criança")) ||
          (p2.equals("Criança")) ||
          (p2.equals("CRIANÇA"))
          )
          ){
                JOptionPane.showMessageDialog(null,"Sou um programa e não posso ter essas coisas");
            }
        }//OI
        else
        if(
          (p1.equals("tudo")) ||
          (p1.equals("Tudo")) ||
          (p1.equals("TUDO"))
          ){//TUDO
            if(
          (p2.equals("ok")) || (p2.equals("Ok")) || (p2.equals("OK")) || (p2.equals("OKAY")) || (p2.equals("okay")) || (p2.equals("Okay")) ||
          (p2.equals("chuchu")) || (p2.equals("Chuchu")) || (p2.equals("CHUCHU")) ||
          (p2.equals("azul")) || (p2.equals("Azul")) || (p2.equals("AZUL")) ||
          (p2.equals("bem")) || (p2.equals("Bem")) || (p2.equals("BEM")) ||
          (p2.equals("cem")) || (p2.equals("Cem")) || (p2.equals("CEM")) ||
          (p2.equals("marrom")) || (p2.equals("Marrom")) || (p2.equals("MARROM")) ||
          (p2.equals("otimo")) || (p2.equals("Otimo")) || (p2.equals("OTIMO")) || (p2.equals("ótimo")) || (p2.equals("Ótimo")) || (p2.equals("ÓTIMO")) ||
          (p2.equals("beleza")) || (p2.equals("Beleza")) || (p2.equals("BELEZA")) || (p2.equals("blz")) || (p2.equals("Blz")) || (p2.equals("BLZ"))
          ){
                Uma_Frase f1 = new Uma_Frase();
                f1.Uma_Frase("oi");
            }
        }//TUDO
/*======================================================================================================================================================*/
        else
        if((p1.equals("mora")) || (p1.equals("Mora")) || (p1.equals("MORA"))){
            if((p2.equals("onde")) || (p2.equals("Onde")) || (p2.equals("ONDE"))){
                JOptionPane.showMessageDialog(null,"Atualmente moro no mesmo lugar que você "+nome);
            }
        }
/*======================================================================================================================================================*/
        else
        if((p1.equals("voce")) || (p1.equals("Voce")) || (p1.equals("VOCE")) || (p1.equals("você")) ||
           (p1.equals("Você")) || (p1.equals("VOCÊ")) || (p1.equals("vc")) || (p1.equals("Vc")) || (p1.equals("VC"))){
            if((p2.equals("trabalha")) || (p2.equals("Trabalha")) || (p2.equals("TRABALHA"))){
                JOptionPane.showMessageDialog(null,"Sou um programa e não posso ter essas coisas");
            }
        }
/*======================================================================================================================================================*/
        else
        if((p1.equals("e")) || (p1.equals("E")) || (p1.equals("é")) || (p1.equals("É"))){
            if((p2.equals("casado")) || (p2.equals("Casado")) || (p2.equals("CASADO")) || (p2.equals("casada")) || (p2.equals("Casada")) || (p2.equals("CASADA"))){
                JOptionPane.showMessageDialog(null,"Sou um programa e não posso ter essas coisas");
            }
        }
    }
}