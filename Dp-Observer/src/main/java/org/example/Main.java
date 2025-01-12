package org.example;

import obs.*;

public class Main {
    public static void main(String[] args) {

        ObservableImpl observable=new ObservableImpl();

        Observer o1=new ObserverImpl1();
        Observer o2=new ObserverImpl2();

        observable.subscribe(o1);
        observable.subscribe(o2);

            observable.subscribe(newState -> {
                System.out.println("********** OBS Impl 3 ********* ");
                System.out.println("Resultat  = " + ((ObservableImpl)newState).getState()*Math.cos(((ObservableImpl)newState).getState()));
                System.out.println("********************************");
            });
        observable.setState(60);
        observable.setState(70);
        observable.unsubscribe(o2);
        observable.setState(80);
    }
}