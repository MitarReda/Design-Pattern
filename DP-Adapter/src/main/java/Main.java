import adapter.HdmiVgaAdapter;
import adapter.HdmiVgaAdapterH;
import computer.*;

public class Main {

    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecrant());
        uniteCentre.print("Bonjour");

        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonjour TV");

        uniteCentre.setVga(new SuperVideoPro());
        uniteCentre.print("hello");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVideoPro());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("test ");

        HdmiVgaAdapterH hdmiVgaAdapterH=new HdmiVgaAdapterH();
        uniteCentre.setVga(hdmiVgaAdapterH);
        uniteCentre.print("test avec extends ");

    }

}
