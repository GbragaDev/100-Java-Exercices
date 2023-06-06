package Exercicios_Vetores;

import java.util.Scanner;

public class EC_006 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("informe quantas notas seram inseridas");
        int n = entrada.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.println("digite uma nota");
            double nota = entrada.nextDouble();
            notas[i] = nota;

        }

        for (double nota : notas) {

            double media = nota / 2;

            System.out.println("a media das notas é " + media);

        }

    }

}

// *inserir notas e nomes em uma matriz bidimensional e calcular a média das
// notas */