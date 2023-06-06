package Orientação_a_Objetos.Manipulaçãodedatas.Orientação_a_Objetos;

import java.text.SimpleDateFormat;
import java.time.Instant;

//iso 8601(international organization for standardization)

public class simpleDate {

    public static void main(String[] args) {

        SimpleDateFormat datasimples = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(datasimples);
    }

}
