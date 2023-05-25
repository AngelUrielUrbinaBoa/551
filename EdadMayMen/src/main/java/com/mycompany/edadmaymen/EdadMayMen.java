
package com.mycompany.edadmaymen;
import java.util.Scanner;
import CalculoEdad.*;

public class EdadMayMen {

    public static void main(String[] args) {
       int edad;
       Scanner leer=new Scanner(System.in);
       System.out.println("Introduce tu edad: ");
       edad=leer.nextInt();
       CalculoEdad varEdad=new CalculoEdad();
       varEdad.retornamultiplo(edad);
       System.out.println(varEdad.retornamultiplo(edad));
    }
}
