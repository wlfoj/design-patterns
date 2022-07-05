package visitor.carrosComVisitor;

public class VeiculoVisitor implements Visitor{

    public String exibir(Veiculo veiculo){
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro){
        return "Veiculo: " +  carro.getMarca() +" "+ carro.getNome();
    }

    @Override
    public String exibirAcessorios(Acessorios acessorios){
        return "Acessorios: " +  acessorios.getRoda() +" "+ acessorios.getMultimidia();
    }

}
