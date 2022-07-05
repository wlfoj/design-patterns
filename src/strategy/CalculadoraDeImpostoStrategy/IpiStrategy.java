package strategy.CalculadoraDeImpostoStrategy;

//classe IPI calculo
public class IpiStrategy implements ImpostoStrategy {

	//atributo
	private double valor;

	public IpiStrategy(double valor) {
		this.valor = valor;
	}

	//Sobreescrita do metodo da classe ImpostoStrategy
	@Override
	public double calcularStrategy() {
		return this.valor * 0.20;
	}
}

