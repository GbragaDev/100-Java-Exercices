package Orientação_a_Objetos.Manipulaçãodedatas;

import java.time.LocalDate;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Manipulacao {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2020-01-04");
        // faz o parse(conversion) da data local para string
        System.out.println(d04);

        LocalDate d05 = LocalDate.parse("2020-01-05");
        // faz o parse(conversion) da data local para string

        Instant d06 = Instant.parse("2020-01-06T13:30:00Z");
        // faz o parse(conversion) da data local para string

        // documentação da classe DateTimeFormatter
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy")
                .withZone(ZoneId.of("America/Sao_Paulo"));
        // cria um formatador de data com o padrao dd/MM/yyyy com o fuso horario de sao
        // paulo

        LocalDate aniversario = LocalDate.now();
        // cria uma data

        String valorFormatado = aniversario.format(formatador);
        // formata a data com o formatador como parametro

        for (String S : ZoneId.getAvailableZoneIds()) {
            System.out.println(S);

            // aqui eu estou imprimindo todos os fusos horarios disponiveis

            // S é uma lista de strings que recebe todos os fusos horarios

            // na variavel S que é uma string que recebe todos os fusos horarios
        }

        String localtime = d05.format(formatador);
        System.out.println(localtime);

        String horario = ZoneId.of("America/Sao_Paulo").toString();

        String horario_formatado = horario.format(valorFormatado, args);
        // formata o horario com o formatador como parametro e o valor formatado.

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        // converte a data instant para localdate com o fuso horario do sistema
        // os parametros sao a data instant e o fuso horario do sistema
        // atribuindo a variavel r1

    }

}
