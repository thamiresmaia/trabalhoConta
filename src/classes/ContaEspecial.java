
package classes;


public class ContaEspecial extends Contas {
    private double limite;
    private double multa1;

    public double getMulta1() {
        return multa1;
    }

    public void setMulta1(double multa1) {
        this.multa1 = multa1;
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void tipoConta(){
        System.out.println("Tipo de conta: conta-especial");
    }
}
