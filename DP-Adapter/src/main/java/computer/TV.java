package computer;

import java.util.Arrays;

public class TV implements Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("////////// TV \\\\\\\\\\\\");
        String message =new String(data);
        System.out.println("message = " + message);
        System.out.println("/////////////\\\\\\\\\\\\\\");
    }
}
