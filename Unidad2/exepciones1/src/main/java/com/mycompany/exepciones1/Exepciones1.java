package com.mycompany.exepciones1;
import javax.swing.JOptionPane;
public class Exepciones1 {

    public static void main(String[] args) {
        int x,y;
        try{
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese número1:", "Solicito datos",3));
    }catch (NumberFormatException n){
        System.out.println(n. getMessage() + "No seas chango ese no es un número Entero");
      }
    }
  }

