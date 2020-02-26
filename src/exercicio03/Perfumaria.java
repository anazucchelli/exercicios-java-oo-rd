package exercicio03;

// TODO: implemente o código-fonte de Perfumaria.java

public class Perfumaria extends Produto{
    private double precoPromocional;
    private int qtdade;
    private double precoLMPM;

    //construtor

    public Perfumaria() {
    }

    public Perfumaria(double precoPromocional, int qtdade, double precoLMPM) {
        this.precoPromocional = precoPromocional;
        this.qtdade = qtdade;
        this.precoLMPM = precoLMPM;
    }

    //metodos
    public void leveMpagueM(){
        if(precoLMPM <= && precoLMPM>= precosVendas){
            return false;
        }
    }

    public void descontos(){
        double desc = 0 <= 10 < 100;
    }

    //get eset

    public double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public int getQtdade() {
        return qtdade;
    }

    public void setQtdade(int qtdade) {
        this.qtdade = qtdade;
    }

    public double getPrecoLMPM() {
        return precoLMPM;
    }

    public void setPrecoLMPM(double precoLMPM) {
        this.precoLMPM = precoLMPM;
    }
}