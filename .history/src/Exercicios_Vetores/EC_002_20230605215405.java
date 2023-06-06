package Exercicios_Vetores;

public class EC_002 {

    public static void main(String[] args) {

        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int B[] = new int[8];

        for (int i = 0; i < A.length; i++) { // primeiro for percorre e preenche B

            B[i] = A[i] * 2;

        }

    }

}

// ** Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo
// tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja:
// B[i] = A[i] * 2 */
