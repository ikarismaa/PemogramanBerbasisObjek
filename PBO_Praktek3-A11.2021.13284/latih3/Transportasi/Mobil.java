package Transportasi;
public class Mobil {
    public int roda = 4;
    public int body = 1;
    public static int mesin = 1;//class variable
    public static void maju(){
        System.out.println("Maju...");
    }
    public static void mundur(){
        System.out.println("Mundur...");
    }
    public static void belok(){
        System.out.println("Belok...");
    }
}
