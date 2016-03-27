/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class GUI_Teste {
    
    static String nome = JOptionPane.showInputDialog(null,"Qual seu nome ?","Artificial Inteligence",JOptionPane.QUESTION_MESSAGE);
    static int na;
    static String validador;
    static String operacao;
    
    public static void main(String args[]){
        
        Uma_Frase f1 = new Uma_Frase();
        Duas_Frases f2 = new Duas_Frases();
        Tres_Frases f3 = new Tres_Frases();
        
        int qnt = 12;//4
        String frase = "";
        
        for(int i = 0; i < qnt; i++){
        
        Random numero_aleatorio = new Random();
        na = numero_aleatorio.nextInt(4);//NUMEROS ALEATORIOS ENTRE 0 E 3
            
        System.out.println("PC Diz: "+"Qual seu nome ?");
        f1.nome = nome;
        if(!f1.nome.equals("")){
            System.out.println(f1.nome+" Diz: "+f1.nome);
        }
        else
        if(f1.nome.equals("")){
            System.out.println("O usuário não informou o nome");
        }
        
        frase = JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"ª frase");
        if((frase.contains("0")) || 
           (frase.contains("1")) ||
           (frase.contains("2")) ||
           (frase.contains("3")) ||
           (frase.contains("4")) ||
           (frase.contains("5")) ||
           (frase.contains("6")) ||
           (frase.contains("7")) ||
           (frase.contains("8")) ||
           (frase.contains("9")) ||
           (frase.contains("+")) ||
           (frase.contains("-")) ||
           (frase.contains("*")) ||
           (frase.contains("/"))     
          )
        {
            char[] numeros_separados = frase.toCharArray();
            int[] numeros = new int[numeros_separados.length];
            
            for(int j = 0; j < numeros_separados.length; j++){//INICIO FOR
                
                JOptionPane.showMessageDialog(null,""+numeros_separados[j]+" "+(j+1)+" vez");
                
                validador = ""+numeros_separados[j];
                
                if(
                  (!validador.equals("+")) &&
                  (!validador.equals("-")) &&
                  (!validador.equals("*")) &&
                  (!validador.equals("/"))
                ){
                    numeros[j] = Integer.parseInt(""+numeros_separados[j]);
                }
                else
                if(
                  (validador.equals("+")) ||
                  (validador.equals("-")) ||
                  (validador.equals("*")) ||
                  (validador.equals("/"))
                ){
                    operacao = validador;
                }
            }//FIM FOR
                if(operacao.equals("+")){
                    JOptionPane.showMessageDialog(null,""+(numeros[0]+numeros[2]));
                }
                else
                if(operacao.equals("-")){
                    JOptionPane.showMessageDialog(null,""+(numeros[0]-numeros[2]));
                }
                else
                if(operacao.equals("*")){
                    JOptionPane.showMessageDialog(null,""+(numeros[0]*numeros[2]));
                }
                else
                if(operacao.equals("/")){
                    JOptionPane.showMessageDialog(null,""+(numeros[0]/numeros[2]));
                }
        }
        frase = frase.replace(" ",";");
            String[] s = frase.split(";");
            
            String[] palavras_separadas = new String[s.length];
        
        for(int j = 0; j < s.length; j++){
            palavras_separadas[j] = s[j];
        }
        
        if(s.length == 1){
            f1.Uma_Frase(palavras_separadas[0]);
        }
        else
        if(s.length == 2){
            f2.Duas_Frases(palavras_separadas[0], palavras_separadas[1]);
        }
        else
        if(s.length == 3){
            f3.Tres_Frases(palavras_separadas[0], palavras_separadas[1], palavras_separadas[2]);
        }
        else
        if(s.length > 3){
            JOptionPane.showMessageDialog(null,"Frases com mais de duas palavras ainda não podem ser interpretadas ..."
            ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        }
    }
}
