package strategy.CalculadoraDeImpostoSemPadrao;

//Teste da calculadora sem o padrao
public class TesteCalculadoraSemPadrao {

	public static void main(String[] args) {
		CalculadoraDeImpostosSemPadrao calculadora = new CalculadoraDeImpostosSemPadrao();
		System.out.println("ICMS sem padrão => " + calculadora.calcular("ICMS", 100));
		System.out.println("IPI sem padrão => " + calculadora.calcular("IPI", 100));
	}
}
