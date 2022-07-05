package visitor;

public class VeiculoVisitor implements Visitor{

    public String exibir(VeiculoComVisitor veiculo){
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(CarroComVisitor carro){
        return "Veiculo: " +  carro.getMarca() +" "+ carro.getNome();
    }

    @Override
    public String exibirAcessorios(AcessoriosComVisitor acessorios){
        return "Acessorios: " +  acessorios.getRoda() +" "+ acessorios.getMultimidia();
    }

}
