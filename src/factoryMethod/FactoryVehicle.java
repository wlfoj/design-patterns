package factoryMethod;

public class FactoryVehicle {
    public VehicleProd getVehicle(char color, String vin, TypeVehicle type){
        if (type == TypeVehicle.CAR){
            return new Car(color, vin);
        }
        else if (type == TypeVehicle.TRUCK){
            return new Truck(color, vin);
        }
        else{
            return null;
        }
    }
}


