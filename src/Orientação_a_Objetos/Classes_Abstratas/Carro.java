package Orientação_a_Objetos.Classes_Abstratas;

public class Carro extends Veiculo {

    @Override
    void acelerar() {
        System.out.println("Acelerando o Carro");

    }

    @Override
    void freiar() {
        System.out.println("Freiando o Carro");

    }

}
