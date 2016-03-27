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
public class Comandos {
    public void Comandos(String p1, String p2, String p3, String p4, String p5){
        
        if((p1.equals("crie")) || (p1.equals("Crie")) || (p1.equals("CRIE"))){
        if((p2.equals("uma")) || (p2.equals("Uma")) || (p2.equals("UMA"))){
        if((p3.equals("pasta")) || (p3.equals("Pasta")) || (p3.equals("PASTA"))){
        if((p4.equals("chamada")) || (p4.equals("Chamada")) || (p4.equals("CHAMADA"))){
                        
                        java.io.File Nova_Pasta = new java.io.File("C:\\AI\\"+p5);
                        Nova_Pasta.mkdir();
                        JOptionPane.showMessageDialog(null,"Criei uma pasta em C:\\AI chamada "+p5,"Nova pasta",JOptionPane.WARNING_MESSAGE);
                        
                    }
                }
            }
        }
/*=======================================================================================================================================================*/
        else
        if((p1.equals("crie")) || (p1.equals("Crie")) || (p1.equals("CRIE"))){
        if((p2.equals("um")) || (p2.equals("Um")) || (p2.equals("UM"))){
        if((p3.equals("arquivo")) || (p3.equals("Arquivo")) || (p3.equals("ARQUIVO"))){
        if((p4.equals("chamado")) || (p4.equals("Chamado")) || (p4.equals("CHAMADO"))){
                        
                        
                        
                    }
                }
            }
        }
    }
}
