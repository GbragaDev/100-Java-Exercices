package pasta;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização do vetor com valores digitados pelo usuário
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];
        System.out.println("Digite os " + n + " valores do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor a ser procurado: ");
        int valorProcurado = scanner.nextInt();

        int inicio = 0;
        int fim = n - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (valorProcurado == vetor[meio]) {
                System.out.println("O valor está no índice " + meio);
                break;
            } else if (valorProcurado < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        if (inicio > fim) {
            System.out.println("O valor não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
