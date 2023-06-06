package Coleções;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + this.nome + " Idade: " + this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public boolean equals(Object obj) {

        // Checks if the input object is an instance of Pessoa class.
        if (obj instanceof Pessoa) {
            // If so, cast the object to Pessoa class and assign it to another variable
            // called outraPessoa.
            Pessoa outraPessoa = (Pessoa) obj;

            // Compare the name and age properties of the current object with the other
            // pessoa object.
            // Return true if they are equal, otherwise return false.

            return this.nome.equals(outraPessoa.nome) && this.idade == outraPessoa.idade;
        } else {
            return false;
        } // If not, return false.
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode() + this.idade;
    }

}
