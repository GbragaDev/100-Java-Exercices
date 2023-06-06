package Orientação_a_Objetos.Manipulaçãodedatas.Orientação_a_Objetos;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

//iso 8601(international organization for standardization)

public class simpleDate {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat datasimples = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = datasimples.parse("25/06/2018");
        Date y2 = dateFormat.parse("25/06/2018 15:34:43");

        System.out.println(y1);
        System.out.println(y2);

    }

}
