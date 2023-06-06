public class Cliente {

    private int numeroDaConta;
    
    private int totaldeCredito;
    private int limiteAutorizado;
    private int itensComprados;
    
    public Cliente(int numeroDaConta, int saldoInicial, int totaldeCredito, int limiteAutorizado, int itensComprados) {
        this.numeroDaConta = numeroDaConta;
        this.totaldeCredito = totaldeCredito;
        this.limiteAutorizado = limiteAutorizado;
        this.itensComprados = itensComprados;
    }

    public Cliente() {
        
    }

    public int getNumeroDaConta() {
        return numeroDaConta;

    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public int getTotaldeCredito() {
        return totaldeCredito;
    }

    public void setTotaldeCredito(int totaldeCredito) {
        this.totaldeCredito = totaldeCredito;
    }
    
    public int getLimiteAutorizado() {
        return limiteAutorizado;
    }

    public void setLimiteAutorizado(int limiteAutorizado) {
        this.limiteAutorizado = limiteAutorizado;
    }

    public int getItensComprados() {
        return itensComprados;
    }

    public int CalculaSaldo() {
        
        int saldoInicial;
        int itensComprados = 0; // or any other initial value
        saldoInicial = totaldeCredito - itensComprados;
        return saldoInicial;
    }


}
