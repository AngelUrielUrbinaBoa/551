
package com.mycompany.v1trifiu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
public class V1Trifiu {

    public static void main(String[] args) throws IOException{
        BufferedReader bufENTRADA = new BufferedReader(new InputStreamReader(System.in));
                int numero;
                int mut3;
                int mult5;
                System.out.println("Dame un numero: ");
                numero = Integer.parseInt (bufENTRADA.readLine());
                mult3 = numero % 3;
                mutl5 = numero % 5;
                if(mult3==0 ){
                    System.out.println("TRI");
                }
                if(mult5==0 ){
                    System.out.println("FIV");
                }
                if(mult3==0 && mult5==0){
                
    }
}
}
