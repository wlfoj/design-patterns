package visitor;

//Cada classe concreta de elemento deve implementar o método
//`aceitar` de tal maneira que ele chama o método visitante que
//corresponde com a classe do elemento.

public class CarroComVisitor implements VeiculoComVisitor{

    private String marca;
    private String nome;

    public CarroComVisitor(String marca, String nome){
        this.marca = marca;
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }

    public String getNome(){
        return nome;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirCarro(this);
    }
}
