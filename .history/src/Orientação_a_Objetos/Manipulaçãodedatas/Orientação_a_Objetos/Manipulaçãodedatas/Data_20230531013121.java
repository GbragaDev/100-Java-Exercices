package Orientação_a_Objetos.Manipulaçãodedatas.Orientação_a_Objetos.Manipulaçãodedatas;

import java.time.*;

/*Instanciando objetos do tipo Date
 * Fazendo operaçoes
 * Convertendo
 * 
 */

public class Data {

    public static void main(String[] args) {

        System.out.println("-------------------");
        // obtendo a data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("hoje é " + "_________" + hoje);
        System.out.println("-------------------");

        // obtendo a data atual e hora atual
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("agora é : " + agora);
        System.out.println("-------------------");

        // obtendo o horario atual
        LocalTime now = LocalTime.now();
        System.out.println("O horario é: " + now);
        System.out.println("-------------------");

        // Operações com Data

        LocalDate umdia = LocalDate.now();// cria uma dia
        LocalDate Amanha = umdia.plusDays(1);// adicionando um dia
        LocalDate mespassado = hoje.minusMonths(1);// subtraindo um mes

        // fazendo Comparações
        LocalDate data1 = LocalDate.of(2019, 12, 25);
        LocalDate data2 = LocalDate.of(2020, 1, 1);

        if (data1.isBefore(data2)) {
            System.out.println("data1 é anterior a data2");
        }

        LocalDate novahora = LocalDate.now();// data atual
        LocalTime novoTempo = LocalTime.now();// hora atual

        LocalDateTime novahoraNovotempo = novahora.atTime(novoTempo);
        // juntando data e hora //convertendo para LocalDateTime

        System.out.println("Data e hora atual: " + novahoraNovotempo);

        // Convertendo LocalDateTime -> LocalDate e LocalTime
        LocalDateTime dataHora = LocalDateTime.now();// data e hora atual

        LocalDate dataConvertida = dataHora.toLocalDate();
        LocalTime horaConvertida = dataHora.toLocalTime();

        // convertendo para String

        String hojeemString = hoje.toString();
        System.out.println("hoje em String: " + hojeemString);

        // convertendo string para formato de data

        LocalDate dataemString = LocalDate.parse(hojeemString);
        // convertendo string para formato de data

        // calculando a diferença entre datas

        LocalTime inicio = LocalTime.of(14, 3); // 14:03

        LocalTime fim = LocalTime.of(14, 5); // 14:05

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração: " + duracao);

        System.out.println(duracao.toMinutes() + " minutos");

    }

}
