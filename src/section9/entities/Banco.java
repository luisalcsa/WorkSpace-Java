package section9.entities;

public class Banco {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Banco(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public Banco(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    public String toString(){
        return "Conta "
                + numeroConta
                +", Titular: "
                + nomeTitular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }


}
