package decorator;

import boissons.Boisson;

public class Noisette extends DecorateurBoisson{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescreption() {
        return boisson.getDescreption() + " Au Noisette";
    }

    @Override
    public double cou() {
        return 1.6 + boisson.cou();
    }
}
