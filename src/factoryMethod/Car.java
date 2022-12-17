package factoryMethod;

public class Car extends VehicleProd{
    public Car(char color, String vin){
        this.color = color;
        this.vin = vin;
    }

    @Override
    public void buzinar() {
        System.out.println("Pim Pimmm");
    }


    @Override
    public void rodar(int km){
        System.out.println("Andei de carro "+km+"km");
    }

    @Override
    public String detail() {
        return new String("Meu vin:"+this.vin+"/Minha cor:"+this.color);
    }
}
