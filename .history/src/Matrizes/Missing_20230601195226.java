package Matrizes;

import java.util.Arrays;

public class Missing {

    public static void main(String[] args) {

        int listaincompleta[] = { 1, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 15 };
        int listacompleta[] = new int[15];

        for (int i = 0; i < listaincompleta.length; i++) {
            for (int j = 0; j < listacompleta.length; i++) {
                if (listaincompleta[i] != listacompleta[j]) {
                    System.out.println("o numero faltante é: " + listacompleta[j]);

                }

            }
        }

    }

}

// em um array de 1 a 15 com um numero faltando, como encontrar o numero
// faltando?