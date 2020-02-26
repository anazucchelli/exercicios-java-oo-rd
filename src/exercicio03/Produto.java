package exercicio03;

public class Produto{
    private int codID;
    private String nome;
    private double precoVenda;
    private double desconto;

    //construtor

    public Produto() {
    }

    public Produto(int codID, String nome, double precoVenda, double desconto) {
        this.codID = codID;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.desconto = desconto;
    }
    //metodos
    public void precosVendas(){
       if(precoVenda <= 0){
           System.out.println("Não foi possivel concluir esta ação");
           return false;
       }
    }

    public void descontos(){
        double desc = 0 <= desconto < 100;
    }



    //get e set


    public int getCodID() {
        return codID;
    }

    public void setCodID(int codID) {
        this.codID = codID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
// TODO: implemente o código-fonte de Produto.java

