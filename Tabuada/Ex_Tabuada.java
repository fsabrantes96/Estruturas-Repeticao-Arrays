package Tabuada;

import java.util.Scanner;

/*
*  Desenvolver um gerador de tabuada,
* capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
* O usuário deve informar de qual número ele deseja ver a tabuada.
* a saída deve ser conforme o exemplo abaixo:
*
* Tabuada de 5:
* 5 X 1 = 5
* 5 X 2 = 10
* ...
* 5 X 10 = 50
*/
public class Ex_Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.println("Informe o valor da tabuada que deseja gerar: ");
        num = ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
