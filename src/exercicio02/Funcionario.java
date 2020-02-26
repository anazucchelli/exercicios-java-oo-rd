package exercicio02;

public class Funcionario {
    // TODO: implemente o código desta classe
    private String nome;
    private double salarioMensal;

    //construtor
    public Funcionario() {
    }
    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    //metodos
    public void salarioAnualFunc(){
        //public double salario;
        salarioAnualFunc = salarioMensal * 13;
    }

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
