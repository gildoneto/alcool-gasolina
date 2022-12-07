package alcool.gasolina;

import java.util.Scanner;

public class Alcool extends Combustivel implements Produto {

    private double preco;

    public static String getMensagem() {
        return mensagem;
    }

    private static String mensagem = "Digite o valor do Álcool: ";
    private static String tipo = "Álcool";

    public Alcool() {

    }

    @Override
    public void pegaPreco() {
        Scanner teclado = new Scanner(System.in);
        this.preco = teclado.nextDouble();
    }

    @Override
    public void escrevePergunta() {
        System.out.println(getMensagem());
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
