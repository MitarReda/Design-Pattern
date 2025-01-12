package com.mitar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Context ctx= new Context();

        Scanner scanner=new Scanner(System.in);
        Map<String,Strategy> strategyMap= new HashMap<>();

        strategyMap.put("st1",new StrategyImp1());
        strategyMap.put("st2",new StrategyImp2());
        strategyMap.put("st3",new StrategyImp3());
        strategyMap.put("dfl",new StrategyDefaultImp());

        while(true){
            System.out.println("Donner votre stratégie:");
            String strategyClassName=scanner.nextLine();
            System.out.println(strategyClassName);
            Strategy strategy = strategyMap.get(strategyClassName);
                    //(Strategy) Class.forName(strategyClassName).getConstructor().newInstance();

            ctx.setStrategy(strategy);
            ctx.perform();
        }
        // ctx.perform();

        //ctx.setStrategy(new StrategyImp1());
        //ctx.perform();

        //ctx.setStrategy(new StrategyImp2());
        //ctx.perform();
    }
}
