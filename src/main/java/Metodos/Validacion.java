package Metodos;

import javax.swing.JOptionPane;

public class Validacion 
{
   public double suma(double n1, double n2)
   {
      double resultado;
      
      resultado = (n1 + n2);
      
      return resultado;
   }//Fin suma.
   
   public double resta(double n1, double n2)
   {
      double resultado;
      
      resultado = (n1 - n2);
      
      return resultado;
   }// Fin resta;
   
   public double multiplicacion(double n1, double n2)
   {
      double resultado;
      
      resultado = (n1 * n2);
      
      return resultado;
   }// Fin multiplicacion;
   
   public double division(double n1, double n2)
   {
      
      double resultado = 1;
      
      try
      {
         resultado = (n1 / n2);
         
         
      }catch(Exception e)
      {
         JOptionPane.showMessageDialog(null, e);
      }//Fin try and catch.
      
      return resultado;
      
   }// Fin division;
   
}//Fin Validación.
