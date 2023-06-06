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

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                System.out.print("digite a nota do aluno");
                System.out.print(i + 1);
                System.out.print("Digite a nota do aluno");
                System.out.print(j + 1);

                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];

            }

            double media = total / (QuantDeAlunos * QuantDeNotas);
            System.out.println("media da turma é" + media);

        }
        entrada.close();
    }

}

// *inserir notas e nomes em uma matriz bidimensional e calcular a média das
// notas */