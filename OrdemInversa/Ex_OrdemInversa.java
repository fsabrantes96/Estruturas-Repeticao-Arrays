package OrdemInversa;
/*
* Crie um vetor de 6 números inteiros
* e mostre-os na ordem inversa.
*/
public class Ex_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15 , 50, 8, 4};
        int i = 0;

        System.out.println("Vetor: ");
        while(i < (vetor.length)) {
            System.out.print(vetor[i] + " ");
            i++;
        }
        System.out.println("\nVetor inverso: ");
        for (int count = vetor.length-1; count >= 0; count--){
            System.out.print(vetor[count] + " ");
        }
    }
}
