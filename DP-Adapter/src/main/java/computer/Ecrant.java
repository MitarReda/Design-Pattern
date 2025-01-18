package computer;

public class Ecrant implements Vga{
    @java.lang.Override
    public void print(java.lang.String message) {
        System.out.println("============ Ecrant ========================");
        System.out.println(message);
        System.out.println("============================================");
    }
}
