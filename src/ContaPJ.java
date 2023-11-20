public class ContaPJ extends Conta{
    private double limiteEmprestimo;

    public ContaPJ() {
        super();
    }

    public ContaPJ(int numero, String nome, double saldo, double limiteEmprestimo) {
        super(numero, nome, saldo);
        this.limiteEmprestimo = limiteEmprestimo; //método acessor
    }
    public void emprestimo(double quantia){ //método para empréstimo
        if (quantia <= limiteEmprestimo){ //verifica se a quantia é possível para empréstimo
            saldo += quantia - 10.0; //desconta do saldo a quantia + 10 reais
        }
    }
    @Override //Sobrescrita do método da superclasse
    public void saque(double quantia){
        super.saque(quantia); //chamada do método da superclasse
        saldo -= 2.0; //acréscimo de regra nessa classe
    }
}
