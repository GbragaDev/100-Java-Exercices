package Exercicios_Vetores;

/**
 * 
 * Criar um vetor A com 5 elementos inteiros.
 * 
 * Construir um vetor B de mesmo tipo e tamanho e
 * 
 * 
 * com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
 * 
 * 
 * 
 **/

public class EC_001 {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5 };

        int[] B = new int[5];

        @Override
        public String toString(){


        }
       
       
        for (int i = 0; i < A.length; i++) {

            B[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {

            System.out.println(B[i]);

        }

    }

}
