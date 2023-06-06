package Coleções;

import java.util.ArrayList;
import java.util.List;

public class collection {

    public static void main(String[] args) {

        List<pessoa> pessoas = new ArrayList<pessoa>();
        pessoas.add(new pessoa("João", 18)); // Adiciona uma pessoa no ArrayList com o construtor pessoa(String, int)
        pessoa a = pessoas.get(0);

    }

}
