
package com.mycompany.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    public static void main(String[] args) throws IOException {
   BufferedReader bufEntrada =new BufferedReader(new InputStreamReader(System.in));
        int num=0;
          System.out.println("Dame un numero: ");
        num = Integer.parseInt(bufEntrada.readLine());
        retornaMultiplo(num);
        }
    public static String retornaMultiplo(int num);{
    int mult3;
    int mult5;
        int num = 0;
    mult3 = num % 3;
    mult5 = num % 5;
     if (mult3 ==0 && mult5 ==0){
        }
        else if (mult3 == 0){
    }
        else if (mult5 == 0){
                }
    }
}
