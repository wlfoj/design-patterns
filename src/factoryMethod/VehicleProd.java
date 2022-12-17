package factoryMethod;

public abstract class VehicleProd {
    protected char color;
    protected String vin;

    public abstract void buzinar();

    public abstract void rodar(int km);

    public abstract String detail();
}
