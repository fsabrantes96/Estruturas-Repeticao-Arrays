package Nota;

import java.util.Scanner;
/*
* Fazer um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido e continue
* pedindo até que o usuário informe um valor válido.
*/
public class Ex_Nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota;

        System.out.println("Informe a nota: ");
        nota = ler.nextInt();

            while(nota < 0 || nota > 10){
                System.out.println("Nota inválida, informe uma nota entre Zero e Dez: ");
                nota = ler.nextInt();
            }
            System.out.println("Nota valida: " + nota);

    }
}
