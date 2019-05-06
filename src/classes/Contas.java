
package classes;


public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    private double valorSaque;

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void multaPagar(double valor,double multa ){
        this.saldo -= valor;
        double mult = this.saldo * multa/100;
        this.saldo += mult;
    }
    public void sacar(double valor) {
        if(valor<=saldo) {
            double novoSaldo = saldo - valor;
            this.saldo = novoSaldo;
            //System.out.println("Saque efetuado com sucesso");
        } 
       // else System.out.println("Saldo insuficiente, o seu saldo é: "+this.saldo);
    }
    public void transferir(int conta1, int conta2, double valor){
        
        
    }
    public void tipoConta(){
        System.out.println("Tipo de conta: comum");
    }
    
    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
