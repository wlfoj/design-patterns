package visitor;

public class CarroSemVisitor {

    private String marca;
    private String nome;

    public CarroSemVisitor(String marca, String nome){
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
