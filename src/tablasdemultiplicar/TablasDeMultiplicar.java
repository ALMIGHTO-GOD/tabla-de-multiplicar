/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasdemultiplicar;
import javax.swing.*;
/**
 *
 * @author spart
 */
public class TablasDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero:"));
    int acu=0, i=0;
multiplicar(num,acu,i);
    
    }
    public static int multiplicar(int num,int acu, int i){

        if(i==10){   
        return acu;
        }
acu=acu+num;
i++;
        System.out.println(i+" X "+num+" = "+acu);
        return multiplicar(num,acu,i);

    }
}