package NomeIdade;
/*
*Faça um programa que leia conjuntos de valores,
* o primeiro representando o nome de um aluno e o segundo representando sua idade.
* (Pare o programa inserindo o valor 0 no campo nome)
*/
import java.util.Scanner;
public class Ex_Nome_Idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;

        while(true) {
            System.out.println("Informe seu nome: ");
            nome = ler.next();
            if (nome.equals("0")) break;
            System.out.println("Informe sua idade: ");
            idade = ler.nextInt();
        }
        System.out.println("Continua aqui...");
    }
}
