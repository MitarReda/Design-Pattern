package decorator;

import boissons.Boisson;

public class Caramel extends DecorateurBoisson{

    public Caramel(Boisson boisson) {
        super(boisson);
    }


    @Override
    public String getDescreption() {
        return boisson.getDescreption() + "Caramel";
    }

    @Override
    public double cou() {
        return 1.6 + boisson.cou();
    }
}
