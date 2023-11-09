import Transportasi.*;
public class TransportasiDemo2 {
    public static void main(String[] args){
        //membuat objek
        Bicycle bike = new Bicycle();

        // memanggil atribut dan memberi nilai
        bike.speed=10;
        bike.gear=2;

        // memanggil method dan menunjuk nilai parameter
        bike.speedUp(10);
        bike.changeGear(2);

        Mobil avanza = new Mobil();
        Mobil.maju();
        Mobil.mundur();
        Mobil.belok();
        System.out.println("Roda  : "+avanza.roda);
        System.out.println("Mesin : "+Mobil.mesin);
    }
}