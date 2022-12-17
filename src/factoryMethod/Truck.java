package factoryMethod;

public class Truck extends VehicleProd{
    public Truck(char color, String vin){
        this.color = color;
        this.vin = vin;
    }

    @Override
    public void buzinar() {
        System.out.println("Pom Pommm");
    }

    @Override
    public void rodar(int km){
        System.out.println("Andei de caminhão "+km+"km");
    }

    @Override
    public String detail() {
        return new String("Meu vin:"+this.vin+"/Minha cor:"+this.color);
    }
}
