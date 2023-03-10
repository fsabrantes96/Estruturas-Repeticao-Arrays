package NumerosAleatorios;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) aramzene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatorios");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números aleatorios");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero+1 + " ");
        }

        System.out.println("\nAntecessor dos Números aleatorios");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero-1 + " ");
        }
    }
}
