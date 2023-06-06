package pasta;

public class BuscaBinaria {

    public static void main(String[] args) {

        // inicialização
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int valor = 5;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (valor == vetor[meio]) {
                System.out.println("o valor está no meio" + meio);
            } else if (valor < vetor[meio]) {

                fim = meio - 1;

            } else if (valor > vetor[meio]) {

                inicio = meio + 1;

            } else {
                System.out.println("o valor não está no vetor");
            }
        }

    }

}
