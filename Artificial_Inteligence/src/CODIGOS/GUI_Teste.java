/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Mael
 */
public class GUI_Teste {
    
    static String nome = JOptionPane.showInputDialog(null,"Qual seu nome ?","Artificial Inteligence",JOptionPane.QUESTION_MESSAGE);
    
    static int na;
    static String validador;
    static String operacao;
    
    static String operador_procurado, Depois, Antes;
    static int antes_do_operador, depois_do_operador, depois, antes;
    
    public static void main(String args[]) throws IOException{
        
        java.io.File Diretorio_Principal = new java.io.File("C:\\AI");
        java.io.File Diretorio_Nomes = new java.io.File("C:\\AI\\Nomes");
        java.io.File Diretorio_Cores = new java.io.File("C:\\AI\\Cores");
        Diretorio_Principal.mkdir();
        Diretorio_Nomes.mkdir();
        Diretorio_Cores.mkdir();
        
        String Nome = nome;
        
        if (!Nome.equals(""))
        {
        
        Nome = Nome+".txt";
        
        File dir = new File("C:\\AI\\Nomes");//LER
        
        File arq = new File(dir,Nome);//LER
            try {
                FileReader fileReader = new FileReader(arq);//LER
                
                if (Nome.equals(Nome))
                {
                    //JOptionPane.showMessageDialog(null,"Você optou por não alterar as informações atuais.");
                    Nome = "";  
                }
                
            } catch (FileNotFoundException ex) {
                //System.out.println("Nome não encontrado");
                //Logger.getLogger(GUI_Teste.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        java.io.File arquivo = new java.io.File(Diretorio_Nomes,Nome );
        
        if (Nome.equals("")){
        //JOptionPane.showMessageDialog(null,"Eu já lhe conheço "+nome);    
        }
        else{
        JOptionPane.showMessageDialog(null,"Prazer em conhecer "+nome);   
        }
        
        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Teste.class.getName()).log(Level.SEVERE, null, ex);
    }       
}       
/*=======================================================================================================================================================*/        
        
        Uma_Frase f1 = new Uma_Frase();
        Duas_Frases f2 = new Duas_Frases();
        Tres_Frases f3 = new Tres_Frases();
        Comandos cmd = new Comandos();
        Calculos_Diretos cd = new Calculos_Diretos();
        
        int qnt = 12;//4
        String frase = "";
        
        for(int i = 0; i < qnt; i++){
        
        Random numero_aleatorio = new Random();
        na = numero_aleatorio.nextInt(4);//NUMEROS ALEATORIOS ENTRE 0 E 3
            
        f1.nome = nome;
        
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
        {//SE CONTEM OPERADORES
            
            String calculo = frase;
            cd.Calculo(calculo);
        
        }//SE CONTEM OPERADORES
        frase = frase.replace(" ",";");
            String[] s = frase.split(";");
            
            String[] palavras_separadas = new String[s.length];
        
        for(int j = 0; j < s.length; j++){
            palavras_separadas[j] = s[j];
        }
        
        if(s.length == 1 && !frase.contains("-") && !frase.contains("+") && !frase.contains("*") && !frase.contains("/")){
            f1.Uma_Frase(palavras_separadas[0]);
        }
        else
        if(s.length == 2 && !frase.contains("-")){
            f2.Duas_Frases(palavras_separadas[0], palavras_separadas[1]);
        }
        else
        if(s.length == 3 && !frase.contains("-")){
            f3.Tres_Frases(palavras_separadas[0], palavras_separadas[1], palavras_separadas[2]);
        }
        else
        if(s.length == 5 && !frase.contains("-")){
            cmd.Comandos(palavras_separadas[0], palavras_separadas[1], palavras_separadas[2], palavras_separadas[3], palavras_separadas[4]);
        }
        else
        if(s.length > 3 && !frase.contains("-")){
            JOptionPane.showMessageDialog(null,"Frases com mais de 3 palavras ainda não podem ser interpretadas ..."
            ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        }
    }
}