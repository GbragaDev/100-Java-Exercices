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
        System.out.println(hoje);

        System.out.println("-------------------");

        // obtendo a data atual e hora atual
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("agora: " + agora);

        System.out.println("-------------------");

        // obtendo o horario atual
        LocalTime now = LocalTime.now();
        System.out.println("now: " + now);

        System.out.println("-------------------");
    }

}
