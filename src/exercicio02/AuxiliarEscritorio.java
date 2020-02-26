package exercicio02;

public class AuxiliarEscritorio extends Funcionario{
    // TODO: implemente o código desta classe
    private double bonusAnualFixo;
    private double salarioAnualFunc;

    //construtor

    public AuxiliarEscritorio() {
    }

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusAnualFixo) {
        super(nome, salarioMensal);
        this.bonusAnualFixo = bonusAnualFixo;
    }

    //metodo
    public void salarioAnualAuxE(double salarioAnualFunc){
        this.salarioAnualFunc = salarioAnualFunc;
        salarioAnualAuxE = salarioAnualFunc + this.bonusAnualFixo;

    }

    //get e set

    public double getBonusAnualFixo() {
        return bonusAnualFixo;
    }

    public void setBonusAnualFixo(double bonusAnualFixo) {
        this.bonusAnualFixo = bonusAnualFixo;
    }
}
