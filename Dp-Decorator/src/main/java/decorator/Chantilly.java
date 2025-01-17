package decorator;

import boissons.Boisson;

public class Chantilly extends DecorateurBoisson{

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescreption() {
        return boisson.getDescreption() + " Au Chantilly";
    }

    @Override
    public double cou() {
        return 0.6 + boisson.cou();
    }
}
