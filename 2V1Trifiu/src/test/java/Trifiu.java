package com.mycompany.trifiu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Trifiu {

    public static void main(String[] args) throws IOException{
        BufferedReader bufENTRADA = new BufferedReader(new InputStreamReader(System.in));
                int numero;
                int mut3;
                int mult5;
                System.out.println("Dame un numero: ");
                numero = Integer.parseInt (bufENTRADA.readLine());
                mut3 = numero % 3;
                mult5 = numero % 5;
                if(mut3==0 ){
                    System.out.println("TRI");
                }
                if(mult5==0 ){
                    System.out.println("FIV");
                }
                if(mut3==0 && mult5==0){
                
    }
}
}