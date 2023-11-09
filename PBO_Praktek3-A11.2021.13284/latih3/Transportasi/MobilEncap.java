package Transportasi;

public class MobilEncap {
    private String merek;
    private int tahunProduksi;

    public MobilEncap(String merek, int tahunProduksi){
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    public String getmerek(){
        return merek;
    }

    public int getTahunProduksi(){
        return  tahunProduksi;
    }

    public void setMerek(String merek){
        this.merek = merek;
    }

    public void settahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }

    public void jalan(){
        System.out.println(" Mobil "+ merek +" tahun "+ tahunProduksi + " sedang jalan.");;
    }
}
