package exercicio02;

public class TecnicoManutencao extends Funcionario{
    // TODO: implemente o código desta classe
    private double insalubridade;
    private double salarioAnualFunc;

    //construtor

    public TecnicoManutencao() {
    }
    public TecnicoManutencao(String nome, double salarioMensal, double insalubridade) {
        super(nome, salarioMensal);
        this.insalubridade = insalubridade;
    }


    //metodos
    public void salarioAnualTecManutencao(double salarioAnualFunc){
        this.salarioAnualFunc = salarioAnualFunc;
        salarioAnualTecManutencao = (salarioAnualFunc +this.insalubridade+this.bonusAnulFixo)
    }

    //get e set

    public double getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(double insalubridade) {
        this.insalubridade = insalubridade;
    }

}
