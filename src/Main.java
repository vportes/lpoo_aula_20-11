public class Main {
    Conta conta = new Conta(1001, "Amanda", 500.0);
    ContaPJ contapj = new ContaPJ(1002,"UniFil", 0.0, 1000.0);

    //UPCASTING > quando temos algo da subclasse para superclasse
    Conta conta1 = contapj;
    //conta1.getSaldo();
    Conta conta2 = new ContaPJ(1003, "Bobs", 0.0, 500.0);
    Conta conta3 = new ContaPoupanca(1004, "Cida", 0.0,0.02);
    //DOWNCASTING
    ContaPJ conta4 = (ContaPJ) conta2;
}
