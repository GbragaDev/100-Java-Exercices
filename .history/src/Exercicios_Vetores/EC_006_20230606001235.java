package Exercicios_Vetores;

import java.util.Scanner;

public class EC_006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe quantas notas seram inseridas");
        int QuantDeNotas = entrada.nextInt();

        System.out.println("Informe a Quantidade de Alunos");
        int QuantDeAlunos = entrada.nextInt();

        double[][] notasDaTurma = new double[QuantDeAlunos][QuantDeNotas];

        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                System.out.println("informe a nota %d do aluno %d,");

            }

        }

    }

}

// *inserir notas e nomes em uma matriz bidimensional e calcular a média das
// notas */