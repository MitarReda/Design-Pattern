package boissons;

public class Espresso extends Boisson{
    public Espresso(){
        descreption="Espresso";
    }
    @Override
    public double cou() {
        return 12;
    }
}
