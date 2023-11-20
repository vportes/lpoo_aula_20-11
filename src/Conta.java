public class Conta {
    private int numero;
    private String nome;
    protected double saldo;

    public Conta() {   } //Construtor padrão

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* public void setSaldo(double saldo) {
        this.saldo = saldo;
    } */
    public void saque(double quantia){
        saldo -= quantia + 5.0;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }
}
