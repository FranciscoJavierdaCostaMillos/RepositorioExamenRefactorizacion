/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrefactorizar;

/**
 *
 * @author fdacostamillos
 */
import javax.swing.JOptionPane;

public class ExamenRefactorizar {

   

    
    public static void Calcular(int numero){

        if (1==1){
            int meses = (numero*12);
             int dias = (numero*365);
            int horas = (dias*24);
            
             JOptionPane.showMessageDialog(null,  "Meses: "  +meses+"Numero de meses vividos de ");


                JOptionPane.showMessageDialog(null, "Días: " +dias+"Numero de días vividos de ");


            JOptionPane.showMessageDialog(null, "Horas: " +horas+"Numero de horas vividos");
            
            System.exit (0);
        }
        
        
    }
    
    public static void main(String[] args) {
        String nombre;
        String edad;

       
       

nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
  int a= Integer.parseInt (edad);
    String ponerEdad= Integer.parseInt(Calcular(edad));
 

 


   

}

    
    }
    

