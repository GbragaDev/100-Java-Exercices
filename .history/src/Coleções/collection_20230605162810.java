package Coleções;

import java.util.ArrayList;
import java.util.List;

public class collection {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("joao", 18)); // Adiciona uma pessoa no ArrayList com o construtor pessoa(String, int)
        Pessoa a = pessoas.get(0);
        pessoas.remove(a);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " " + pessoa.getIdade());
        }

    }

}
