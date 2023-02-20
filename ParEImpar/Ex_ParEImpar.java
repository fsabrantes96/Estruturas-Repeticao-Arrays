package ParEImpar;

import java.util.Scanner;

/*
* Fazer um programa que peça N números inteiros,
* calcule e mostre a quantidade de números pares
* e a quantidade de números ímpares.
*/
public class Ex_ParEImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int qtdNumeros;
        int numeros;
        int qtdNumPar = 0;
        int qtdNumImpar = 0;
        int i = 0;

        System.out.println("Quantos números deseja digitar? ");
        qtdNumeros = ler.nextInt();

        do{
            System.out.println("Informe um valor: ");
            numeros = ler.nextInt();

            if (numeros % 2 == 0) {
                qtdNumPar++;
            } else {
                qtdNumImpar++;
            }

            i++;
        } while(i < qtdNumeros);
        System.out.println("A quntidade de valores pares é: " + qtdNumPar);
        System.out.println("A quntidade de valores impares é: " + qtdNumImpar);
    }
}
