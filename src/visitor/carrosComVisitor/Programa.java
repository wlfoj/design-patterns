package visitor.carrosComVisitor;

public class Programa {
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Toro");
        VeiculoVisitor visitor = new VeiculoVisitor();
        
        Acessorios acessorios = new Acessorios("Black", "Pionner");
        
        System.out.println(visitor.exibirCarro(carro)+"\n"+visitor.exibirAcessorios(acessorios));
	}
}
