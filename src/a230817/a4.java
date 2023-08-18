package a230817;

import java.util.Scanner;

public class a4 {

    public static int dinero(){
        Scanner dinerito = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero a pedir prestada:");
        return dinerito.nextInt();
    }
    public static int cuotas() {
        Scanner cuotitas = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cuotas para pagar:");
        return cuotitas.nextInt();
    }
    public static double interes(int money, int payments){
        double extra=0;
        double intereces=0;
        if (money<=1000000){
            extra+= 0.1;
        }
        if (payments<=12){
            intereces+=(1.15+extra);
        }
        else if (payments<=23){
            intereces+=(1.20+extra);
        }
        else {
            intereces+=(1.25+extra);
        }
        return intereces;
    }
    public static void main(String[] arg){
        int prestamo=0;
        int cuotaas=0;
        while (prestamo<=0){
            prestamo=dinero();
        }
        while (cuotaas<=0){
            cuotaas=cuotas();
        }
        double interecees= interes(prestamo,cuotaas);

        System.out.println("Monto total a pagar: " + (interecees*prestamo) + " Cuota mensual: " + (interecees*prestamo/cuotaas));
    }
}
