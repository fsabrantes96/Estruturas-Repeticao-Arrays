package Consoantes;

import java.util.Scanner;

/*
* Faça um Programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas.
* Imprima as consoantes
*/
public class Ex_Consoantes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = ler.next();

            if(!( letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtdConsoantes++;
            }
            count++;
        } while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes ) {
            if (consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + qtdConsoantes);

    }
}
