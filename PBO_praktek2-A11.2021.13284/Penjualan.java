import java.util.Scanner;
public class Penjualan {
  String nama_barang;
  int jumlah, kode;
  float harga;
  float total_bayar;

  public Scanner str=new Scanner(System.in);
  public Scanner in=new Scanner(System.in);

  public void setData(){
    System.out.println("========================================");
    System.out.println("         INPUT DATA PENJUALAN           ");
    System.out.println("========================================");
    System.out.print("\nKODE BARANG : ");
    kode = in.nextInt();
    System.out.print("\nNAMA BARANG : ");
    nama_barang = str.nextLine();
    System.out.print("\nJUMLAH BARANG : ");
    jumlah = in.nextInt();
    System.out.print("\nHARGA BARANG : ");
    harga = in.nextFloat();
  }
  public void cetakNota(){
    System.out.println("========================================");
    System.out.println("             NOTA PENJUALAN             ");
    System.out.println("========================================");
    System.out.print("\nKODE BARANG : "+kode);
    System.out.print("\nNAMA BARANG : "+nama_barang);
    System.out.print("\nJUMLAH BARANG : "+jumlah); 
    System.out.print("\nHARGA BARANG : "+harga);    
  }
  public void getTotalBayar(){
    total_bayar = harga * jumlah;
  }
  public void getBonus(){
    if(total_bayar >= 500000 && jumlah > 5 ){
        System.out.println("\nTotal Bayar : "+total_bayar);
        System.out.println("Bonus : Setrika");

    }else if(total_bayar >= 100000 && jumlah > 3 ){
        System.out.println("\nTotal Bayar : "+total_bayar);
        System.out.println("Bonus : Payung");

    }else if(total_bayar >= 50000 && jumlah > 2 ){
        System.out.println("\nTotal Bayar : "+total_bayar);
        System.out.println("Bonus : Ballpoint");
    }
  }
}