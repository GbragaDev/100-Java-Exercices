package Orientação_a_Objetos.Interfaces;

public abstract class carro implements Contrato {

    @Override
    public void acelerar() {
        System.out.println("Acelerando o Carro");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando o Carro");
    }

    @Override
    public void passarmarcha() {
        System.out.println("Passando marcha do Carro");
    }

}
