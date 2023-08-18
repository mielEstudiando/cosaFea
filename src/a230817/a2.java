package a230817;

public class a2 {
    public static double calcularPromedio(double[] array){
        double cantidad_notas = array.length;
        double suma_notas=0;
        for (double nota : array){
            suma_notas+=nota;
        }
        return suma_notas/cantidad_notas;
    }
    public static void mostrarResultados(double a){
        if (a >= 4){
            System.out.println("¡Felicitaciones, aprobaste!");
        }
        else if (a<3.6){
            System.out.println("Lo siento, reprobaste.");
        }
        else {
            System.out.println("Vas a examen.");
        }
    }
    public static void main(String[] args){
        double[] notas = {7, 3, 2.1,1}; //notitas
        double promedio= calcularPromedio(notas);
        mostrarResultados(promedio);
    }
}

