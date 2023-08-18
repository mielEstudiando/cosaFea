package a230817;

import java.util.Scanner;

public class a1v1 {
    public static void main(String[] args) {

        Scanner entraPalabra = new Scanner(System.in);
        System.out.println("Ingrese su palabra:");
        String palabra = entraPalabra.nextLine();

        int largoPalabra = palabra.length();
        char[] ListaAlReves=new char[largoPalabra];

        for (int i =0; i < largoPalabra; i++) {
            ListaAlReves[i] = palabra.charAt(largoPalabra - 1 - i);
        }
        String arbalaP = new String(ListaAlReves);

        System.out.println("su palabra deletreada al revés es: " + arbalaP);
    }
}
