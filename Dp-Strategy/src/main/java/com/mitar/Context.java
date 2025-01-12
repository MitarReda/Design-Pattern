package com.mitar;

public class Context {
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    private Strategy strategy=new StrategyDefaultImp();
    public void perform(){
        System.out.println("######## Début de l'opération ########");
        System.out.println("********  Initialisation **********");
        strategy.apply();
        System.out.println("========== Netoyage ==========");
    }
}
