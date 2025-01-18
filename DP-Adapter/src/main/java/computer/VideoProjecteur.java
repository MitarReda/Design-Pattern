package computer;

public class VideoProjecteur implements Vga{
    @java.lang.Override
    public void print(java.lang.String message) {
        System.out.println("**************------*****************");
        System.out.println("message = " + message);
        System.out.println("**************-------***************");
    }

}
