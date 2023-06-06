package Orientação_a_Objetos.Manipulaçãodedatas.Orientação_a_Objetos;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

//iso 8601(international organization for standardization)

public class simpleDate {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat datasimples = new SimpleDateFormat("dd/MM/yyyy ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = (Date) datasimples.parse("25/06/2018");

    }

}
