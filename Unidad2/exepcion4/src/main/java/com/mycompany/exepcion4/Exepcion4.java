package com.mycompany.exepcion4;
public class Exepcion4 {
public static void main(String[] args) {
      try{
          int division = miMetodo(10,0);
      }catch (ArithmeticException e){
          System.out.println("Exepcion aritmetica arrojada");
      }
    }
public static int miMetodo(int a, int b)throws ArithmeticException{
    int c = a / b;
    return c;
      }
    }
