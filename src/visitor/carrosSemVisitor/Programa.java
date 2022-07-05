package visitor.carrosSemVisitor;

public class Programa {
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Toro");
      
        Acessorios acessorios = new Acessorios("Black", "Pionner");
        
        System.out.println(carro.toString()+"\n"+acessorios.toString());
	}
}
