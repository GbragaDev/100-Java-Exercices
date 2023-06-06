package pasta;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Instancia um Scanner para ler a entrada do usuário

        int[] vetor = { 34, 4, 5, 6, 7, 78, 8, 9 };

        int chute; 

        int inicio = 0; 
        int meio; 
        int fim = vetor.length - 1;

        while (inicio <= fim) {

           

            if (chute == vetor[meio]) {
               
                System.out.println("O número " + chute + " foi encontrado na posição " + meio);
            } if (chute < vetor[meio]) {
                fim = meio - 1;
                
            
            } else {
                inicio = meio + 1;
            }

            
        }

        leitor.close(); // Fecha o Scanner
    }

}

System.out.println("Digite um número para procurar no vetor: ");chute=leitor.nextInt();meio=vetor.length/2;