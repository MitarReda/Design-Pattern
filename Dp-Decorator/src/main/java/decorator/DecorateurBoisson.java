package decorator;

import boissons.Boisson;

public abstract class DecorateurBoisson extends Boisson {

    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}