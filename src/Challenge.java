// @Dante Gennari

import java.util.Scanner;

class Challenge {
    public static int countClumps(int[] numeros) {
        int contador = 0;
        boolean igual = false;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1] && (!igual)) {
                igual = true;
                contador++;
            } else if (numeros[i] != numeros[i + 1]) {
                igual = false;
            }
        }
        return contador;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Introduzca os valores no Array:");
        for (int i = 0; i < numeros.length; i++)
            numeros[i] = scanner.nextInt();
        System.out.println("La cantidad de 'Clumps' en este Array es: " + countClumps(numeros));
    }
}