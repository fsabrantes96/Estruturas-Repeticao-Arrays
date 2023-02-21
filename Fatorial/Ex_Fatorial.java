package Fatorial;

import java.util.Scanner;

/*
* Fazer um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
* Ex.: 5! = 120
*/
public class Ex_Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int fat=1;
        int res=0;

        System.out.println("Informe o valor que deseja saber o fatorial: ");
        num = ler.nextInt();

        for (int i = num; i >= 1; i--) {
            fat *= i;
        }
        System.out.println(num + "! = " + fat);
    }
}
