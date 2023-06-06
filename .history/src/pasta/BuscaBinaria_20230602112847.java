package pasta;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Instancia um Scanner para ler a entrada do usuário

        int[] vetor = { 34, 4, 5, 6, 7, 78, 8, 9 };// Cria um vetor de 10 posições

        int chute; // Variável que armazenará o número que o usuário deseja procurar

        int inicio = 0; // Variável que armazenará o início do vetor

        int meio; // Variável que armazenará o meio do vetor

        int fim = vetor.length - 1;// vetor menos 1, pois o vetor começa em 0

        while (inicio <= fim) {

            System.out.println("Digite um número para procurar no vetor: ");
            chute = leitor.nextInt(); // Lê o número que o usuário deseja procurar no vetor
            meio = vetor.length / 2; // Divide o vetor ao meio

            if (chute == vetor[meio]) {
                System.out.println("O número " + chute + " foi encontrado na posição " + meio);
            } else if (chute < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

            System.out.println("O número " + chute + " não foi encontrado no vetor.");

        }

        leitor.close(); // Fecha o Scanner
    }

}
