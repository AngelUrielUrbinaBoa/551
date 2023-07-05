package com.mycompany.exepcion8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exepcion8 {

    public static void main(String[] args) {
      try {
            Scanner Scanner = new Scanner(new File("input.txt"));
            int dividend = Scanner.nextInt();
            int divisor = Scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("El resultado de la división es: " + result);
            Scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
}
    

