
package com.mycompany.v2trefiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada =new BufferedReader(new InputStreamReader(System.in));
        int numero=0;
        int mult3;
        int mult5;
          System.out.println("Dame un numero: ");
        numero = Integer.parseInt(bufEntrada.readLine());
        mult3 = numero % 3;
        mult5 = numero % 5;
        if (mult3 ==0 && mult5 ==0){
            System.out.println("TRIFIV");    
        }
        else if (mult3 == 0){
        System.out.println("TRE");
    }
        else if (mult5 == 0){
                System.out.println("FIV");
                }
    }
}
