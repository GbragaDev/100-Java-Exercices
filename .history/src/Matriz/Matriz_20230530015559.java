package Matriz;



/*
 *  Array  = lista de n Elementos do mesmo tipo ;
 * 
 *  Matriz = lista de n Elementos do mesmo tipo e mesma dimensão;
 *      n  x   elementos
 * 
 *  Matriz == array de array ;
 * /*
 * 
 * Matriz é uma tabela de dados, onde cada elemento é identificado por um indice de linha e coluna.
 */
 

public class Matriz {

    public static void main(String[] args) {


       
        // 1º forma de declarar uma matriz
        double[][] notasdealunos = new double[30][4];
     
        
        
        // nome da matriz [linha][coluna]
        notasdealunos[0][0] = 10;
        notasdealunos[0][1] = 7;
        notasdealunos[0][2] = 8;
        notasdealunos[0][3] = 9.5;
        notasdealunos[1][0] = 9;
        notasdealunos[1][1] = 8;
        notasdealunos[1][2] = 7;
        notasdealunos[1][3] = 9.5;
        notasdealunos[2][0] = 10;
            


        //imprimir matriz na tela interar sobre a matriz
        double soma;
        for (int i = 0; i < notasdealunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasdealunos[i].length; j++) {
                soma += notasdealunos[i][j]; 
                
            }
            System.out.println(notasdealunos[i][j]+"-");
            System.out.println("A média é: "+(soma/4));
            System.out.println("__________________________");
        }

        //cada rodada do loop a notadealunos[i] vai receber um numero I equivalente ao numero do loop e ao indice da matriz
        // precisa de dois for para percorrer a matriz
        // o outro é para as colunas [i] [j]
    
}





}



// armazenar as 4 notas do ano de 30 alunos.

// Calculando a media das notas desses alunos

