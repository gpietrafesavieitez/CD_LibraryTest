/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelibrarytest;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gpietrafesavieitez
 */
public class IO {
    public static final int CONSOLA = 1, VENTANA = 2;
    
    public static int introducir(int tipo){
        switch (tipo) {
            case 1:
                Scanner leer = new Scanner(System.in);
                return leer.nextInt();
            case 2:
                return Integer.parseInt(JOptionPane.showInputDialog(null,"","Introducir",3));
            default:
                return 0;
        }
    }
    
    public static void mostrar(int msg, int tipo){
        switch (tipo) {
            case 1:
                System.out.println(msg);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,msg,"Mostrar",1);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
   
    public static void mostrar(float msg, int tipo){
        switch (tipo) {
            case 1:
                System.out.println(msg);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,msg,"Mostrar",1);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
    public static void mostrar(String msg, int tipo){
        switch (tipo) {
            case 1:
                System.out.println(msg);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,msg,"Mostrar",1);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
    public static void mostrar(int[] msg, int tipo){
        switch (tipo) {
            case 1:
                System.out.println(msg);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,msg,"Mostrar",1);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
