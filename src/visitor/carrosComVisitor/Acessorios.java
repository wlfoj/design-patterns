package visitor.carrosComVisitor;

//Cada classe concreta de elemento deve implementar o método
//`aceitar` de tal maneira que ele chama o método visitante que
//corresponde com a classe do elemento.

public class Acessorios implements Veiculo{

    private String roda;
    private String multimidia;

    public Acessorios(String roda,String multimidia){
        this.roda = roda;
        this.multimidia = multimidia;
    }

    public String getRoda(){
        return roda;
    }

    public String getMultimidia(){
        return multimidia;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirAcessorios(this);
    }
}
