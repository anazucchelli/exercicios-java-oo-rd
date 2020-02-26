package exercicio02;

public class Gerente extends Funcionario {
    // TODO: implemente o código desta classe
    private double bonusAnual;

    //construtor
    public Gerente() {
    }

    public Gerente(String nome, double salarioMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }
    //metodos
    public void salarioAnualGerente(double salarioAnualFunc){
        double bonus = bonusAnual * salarioMensal;
        salarioAnualGerente = (salarioAnualFunc + bonus);
    }
    //get e set


    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}
