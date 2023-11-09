import java.util.Scanner;
public class PenjualanDemo {
    public static void main(String[] args){
        String ulangi;
        Penjualan barangku = new Penjualan();

        do{
            Scanner str = new Scanner(System.in);
            Scanner ulang = new Scanner(System.in);
            barangku.setData();
            barangku.cetakNota();
            barangku.getTotalBayar();
            barangku.getBonus();
            System.out.println();
            System.out.println("Input Data Lagi? (Ya/No)");
            ulangi = ulang.nextLine();
        } while(ulangi.equalsIgnoreCase("Ya"));
    }
    
}