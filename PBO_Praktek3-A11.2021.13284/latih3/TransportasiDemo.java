import Transportasi.*;
public class TransportasiDemo {
    public static void main(String[] args){
        // Membuat object
        Bicycle bike = new Bicycle();

        // memanggil atribut dan memberi nilai
        bike.speed=10;
        bike.gear=2;

        // Memanggil method dan menunjukak nilai parameter
        bike.speedUp(10);
        bike.changeGear(2);

        Mobil avanza = new Mobil();
        Mobil.maju();
        Mobil.mundur();
        Mobil.belok();
        System.out.println("Roda  : "+avanza.roda);
        System.out.println("Mesin : "+Mobil.mesin);

        //Instance obj MobilEncap
        MobilEncap mobilBaru = new MobilEncap("Toyota", 2021);
        mobilBaru.jalan();

        mobilBaru.setMerek("Honda");
        mobilBaru.settahunProduksi(2022);

        System.out.println("Merek mobil" + mobilBaru.getmerek());
        System.out.println("Tahun Produksi mobil: "+ mobilBaru.getTahunProduksi());
    }
}
