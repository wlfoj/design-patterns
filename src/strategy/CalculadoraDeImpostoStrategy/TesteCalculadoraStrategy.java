package strategy.CalculadoraDeImpostoStrategy;

//Teste rapido da calculadora com o padrao
public class TesteCalculadoraStrategy {

	public static void main(String[] args) {
		CalculadoraDeImpostoStrategy calculadora = new CalculadoraDeImpostoStrategy(); 
	    IcmsStrategy icms = new IcmsStrategy(100.0); 
	    IpiStrategy ipi = new IpiStrategy(100.0); 
	    System.out.println("ICMS com padrão => " + calculadora.calcular(icms)); 
	    System.out.println("IPI com padrão => " + calculadora.calcular(ipi)); 
	}
}
