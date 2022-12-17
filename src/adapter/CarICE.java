package adapter;


// Carros com motor de combutão interna
public class CarICE implements ICar{

    // Metódo para encher o tanque de combustivel
    public void abastecer(){
        System.out.println("Abrir tanque do carro");
        System.out.println("Encaixar bico da bomba de combustivel");
        System.out.println("Ligar a bomba");
        System.out.println("Desligar a bomba e fechar o tanque");
    }
}
