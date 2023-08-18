package a230817;

import java.util.Arrays;

public class a1v2 {
    public static void main(String[] args){

        int[] numeros = {2,3,6,3,8,34,564,35}; //me cuesta pensar números al azar, y no quiero agregar un generador de números
        int suma=0;

        System.out.println("La lista de números es: " + Arrays.toString(numeros));

        for (int num : numeros ){ //estaba haciéndolo con el largo for (int i=0, i<.........)
            if (num%2 == 0){//y el intellij me retó :(
                suma+=num;
            }
        }

        System.out.println("La suma de los números pares es: " + suma);//... ¿no es necesario convertirlo a string?
    }//qué bendición hnbytgrfed
}
