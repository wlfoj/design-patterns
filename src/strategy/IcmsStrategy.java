package strategy;

//classe icms calculo
public class IcmsStrategy implements ImpostoStrategy {

	//Atributo
	 private double valor; 
	  
	  public IcmsStrategy(double valor) { 
	    this.valor = valor; 
	  }
	  
	//Sobreescrita do metodo da classe ImpostoStrategy
	@Override
	public double calcularStrategy() {
		return this.valor * 0.10;
	}

}

