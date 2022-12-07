package alcool.gasolina;

public class Calculadora {
    private static final String nomePrograma = "Alcool x Gasolina";
    private static final String respostaAlcool = "Abasteca com Alcool";
    private static final String respostaGasolina = "Abasteca com Gasolina";
    private static final double percentual = 0.7;
    public Calculadora() {
    }

    public void imprimeNomePrograma() {
        System.out.println(nomePrograma);
    }

    public String calculaPreco(Alcool alcool, Gasolina gasolina) {
        if (alcool.getPreco() <= percentual * gasolina.getPreco()) {
            return respostaAlcool;
        } else {
            return respostaGasolina;
        }
    }
}
