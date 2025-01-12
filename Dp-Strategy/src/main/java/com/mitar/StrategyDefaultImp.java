package com.mitar;

import com.mitar.Strategy;

public class StrategyDefaultImp implements Strategy {
    @Override
    public void apply() {
        System.out.println(".......... Noyau de l'opération en utilisant la stratégie défaut ..........");
    }
}
