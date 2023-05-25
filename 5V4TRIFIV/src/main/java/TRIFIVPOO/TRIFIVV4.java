
package TRIFIVPOO;
import CajaDeHerramientas.conversionesMultiplo;
import java.util.Scanner;
public class TRIFIVV4 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      Byte numero;
      System.out.println("introduce el numero: ");
      numero = entrada.nextByte();
      conversionesMultiplo variableMultiplo = new conversionesMultiplo();
        String retornaMultiplo = variableMultiplo.retornaMultiplo(numero);
        System.out.println(variableMultiplo.retornaMultiplo(numero));
    }
}
