/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcool.gasolina;

/**
 *
 * @author user
 */
public class Main {
        public static void main(String[] args) {
        //Instanciando objetos
        Alcool alcool = new Alcool();
        Gasolina gasolina = new Gasolina();
        Calculadora calc = new Calculadora();

        //entrada

        calc.imprimeNomePrograma();
        alcool.escrevePergunta();
        alcool.pegaPreco();
        gasolina.escrevePergunta();
        gasolina.pegaPreco();

        String resposta = calc.calculaPreco(alcool, gasolina);
        System.out.println(resposta);

        }
    
}
