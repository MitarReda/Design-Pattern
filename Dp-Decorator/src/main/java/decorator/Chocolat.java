package decorator;

import boissons.Boisson;

public class Chocolat extends DecorateurBoisson{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescreption() {
        return boisson.getDescreption() + " Au chocolat";
    }

    @Override
    public double cou() {
        return 1.2 + boisson.cou();
    }
}
