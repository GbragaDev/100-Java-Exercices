package Orientação_a_Objetos.Manipulaçãodedatas.Orientação_a_Objetos.Manipulaçãodedatas;

import java.time.*;

/*Instanciando objetos do tipo Date
 * 
 * 
 */

public class Data {

    public static void main(String[] args) {

        System.out.println("-------------------");

        // obtendo a data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("hoje é " + "é" + "_________" + hoje);

        System.out.println("-------------------");

        // obtendo a data atual e hora atual
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("agora é : " + agora);

        System.out.println("-------------------");

        // obtendo o horario atual
        LocalTime now = LocalTime.now();
        System.out.println("O horario é: " + now);

        System.out.println("-------------------");
    }

}
