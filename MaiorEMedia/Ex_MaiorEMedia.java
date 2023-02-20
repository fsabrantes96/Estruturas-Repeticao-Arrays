package MaiorEMedia;

import java.util.Scanner;

/*
* Fazer um programa que leia 5 números
* e informe o maior número
* e a média desses números.
*/
public class Ex_MaiorEMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int maior = 0;
        int i = 0;
        int soma = 0;

        do{
            System.out.println("Informe um valor: ");
            numero = ler.nextInt();
            soma += numero;
            if (numero > maior)
                maior = numero;
            i++;
        } while(i < 5);
        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (soma/5));
    }
}
