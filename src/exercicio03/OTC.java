package exercicio03;
// TODO: implemente o código-fonte de OTC.java
public class OTC extends Produto{
    private double precoPromocional;

    //construtor

    public OTC() {
    }

    public OTC(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
    //metodos
    public void promocionalPreco(){
        if(precoPromocional<=0 || precoPromocional >= precosVendas){
            return false;
        }
    }

    public void descontos(){
        double desc = 0 <= 5 < 100;
    }



    //get e set


    public double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
}

