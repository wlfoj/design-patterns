package strategy.CalculadoraDeImpostoStrategy;

//Implementaçao da calculadora com padrão
public class CalculadoraDeImpostoStrategy {
	  public double calcular(ImpostoStrategy imposto) { 
		    return imposto.calcularStrategy(); 
		  } 
}

