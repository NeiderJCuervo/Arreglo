import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];
        int suma = 0;

        // Llenar los primeros dos arreglos
        System.out.println("Ingrese los números para el primer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("arreglo1[" + i + "]: ");
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los números para el segundo arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("arreglo2[" + i + "]: ");
            arreglo2[i] = scanner.nextInt();
        }

        // Llenar el tercer arreglo con la diferencia de los dos primeros
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
        }

        // Mostrar los datos del tercer arreglo y calcular la suma
        System.out.println("Elementos del tercer arreglo (diferencias):");
        for (int i = 0; i < 7; i++) {
            System.out.println("arreglo3[" + i + "] = " + arreglo3[i]);
            suma += arreglo3[i];
        }

        // Calcular y mostrar el promedio
        double promedio = (double) suma / 7;
        System.out.println("El promedio de los datos en el tercer arreglo es: " + promedio);
    }
}
