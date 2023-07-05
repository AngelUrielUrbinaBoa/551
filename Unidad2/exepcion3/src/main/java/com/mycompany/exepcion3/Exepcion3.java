package com.mycompany.exepcion3;
public class Exepcion3 {
public static void main(String[] args) {
     try{
         float equis = 5/0;
         System.out.println("Equis =" + equis);
     }catch (ArithmeticException e){
         System.out.println("Error: divicion entre cero.");
     }
     finally {
    System.out.println("Apesar de todo, se ejecuta el bloque finally.");
    }
}
}

