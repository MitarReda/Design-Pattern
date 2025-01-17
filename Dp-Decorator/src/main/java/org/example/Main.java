package org.example;

import boissons.Boisson;
import boissons.Deca;
import boissons.Sumatra;
import decorator.Chantilly;
import decorator.Chocolat;
import decorator.Noisette;

public class Main {
    public static void main(String[] args) {

        Boisson boisson = new Sumatra();
        System.out.println(boisson.cou());
        System.out.println(boisson.getDescreption());
        System.out.println("---------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cou());
        System.out.println(boisson.getDescreption());
        System.out.println("---------------------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.cou());
        System.out.println(boisson.getDescreption());

        System.out.println("---------------------------");
        Boisson boisson2 = new Chocolat(new Noisette(new Chantilly(new Deca())));
        System.out.println(boisson2.cou());
        System.out.println(boisson2.getDescreption());
    }
}