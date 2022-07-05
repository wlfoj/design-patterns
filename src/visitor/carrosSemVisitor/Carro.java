package visitor.carrosSemVisitor;

public class Carro {

    private String marca;
    private String nome;

    public Carro(String marca, String nome){
        this.marca = marca;
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }

    public String getNome(){
        return nome;
    }

    
    @Override
	public String toString() {
		return "Veiculo: " + marca + " " + nome;
	}

}
