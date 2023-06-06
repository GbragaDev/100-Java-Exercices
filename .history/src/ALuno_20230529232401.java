public class ALuno {

    private String nome;                        // declarando variaveis


    public Aluno (String nome) {                //construtor e inicializando variaveis
        this.nome = nome;
    }

    public String getNome() {                   //metodo get
        return nome;
    }
    
    public void setNome(String nome) {          //metodo set
        this.nome = nome;
    }

    @Override
    public String toString() { //metodo toString
                               // transforma o objeto em string
        return "Aluno{" + "nome=" + nome + '}';

    }
    
    @Override
public boolean equals(Object obj) {
    Aluno outro = (Aluno) obj;
    return outro.getNome().equals(this.nome);
}

}
