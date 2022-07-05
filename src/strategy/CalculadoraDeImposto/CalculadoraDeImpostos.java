package strategy.CalculadoraDeImposto;

//Calculadora de imposto sem o padrao
public class CalculadoraDeImpostos {
		  
		  public double calcular(String imposto, double valor) { 
		    if (imposto.equals("ICMS")) 
		      return valor * 0.10; 
		    else if (imposto.equals("IPI")) 
		      return valor * 0.20; 
		    return valor; 
		  } 
}
