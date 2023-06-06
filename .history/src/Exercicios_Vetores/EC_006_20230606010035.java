package Exercicios_Vetores;

import java.util.Scanner;

public class EC_006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe quantas notas seram inseridas");
        int QuantDeNotas = entrada.nextInt();

        // Solicitando ao usuário o número de notas a serem inseridas.
        System.out.println("Informe a Quantidade de Alunos");
        int QuantDeAlunos = entrada.nextInt();

        // Inicializando uma matriz bidimensional para armazenar as notas da turma.
        double[][] notasDaTurma = new double[QuantDeAlunos][QuantDeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                // Solicitando ao usuário que informe a nota do aluno i na posição j

                System.out.printf("digite a nota %f do alunos %f ", i + 1, j + 1);

                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];

            }

            // Calculando e imprimindo a média da turma
            double media = total / (QuantDeAlunos * QuantDeNotas);
            System.out.println("media da turma é" + media);

        }
        entrada.close();
    }

}

// *inserir notas e nomes em uma matriz bidimensional e calcular a média das

// Solicitando ao usuário o número de notas a serem inseridas.