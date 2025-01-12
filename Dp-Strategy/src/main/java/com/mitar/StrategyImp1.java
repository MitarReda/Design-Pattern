package com.mitar;

public class StrategyImp1 implements Strategy{
    @Override
    public void apply() {
        System.out.println("------ Noyau de l'opération en utilisant la stratégie N° 1 -------");
    }
}
