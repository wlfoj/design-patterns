package strategy.CalculadoraDeImposto;

//Teste da calculadora sem o padrao
public class TesteCalculadora {

	public static void main(String[] args) {
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println("ICMS sem padrão => " + calculadora.calcular("ICMS", 100));
		System.out.println("IPI sem padrão => " + calculadora.calcular("IPI", 100));
	}
}
