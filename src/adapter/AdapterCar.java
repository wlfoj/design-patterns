package adapter;
// Adaptador para o cliente que só sabe abastecer um carro ICE conseguir recarregar um carro BEV (Veículo Elétrico de Bateria)
public class AdapterCar extends CarICE{
    private CarEV carEv;

    public AdapterCar(CarEV carEv){
        this.carEv = carEv;
    }

    @Override
    public void abastecer(){
        this.carEv.recarregar();
    }
}
