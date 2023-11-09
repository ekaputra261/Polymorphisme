class Sepeda{
    int kecepatan = 0;
    int gir = 0;

    void ubahGir(int pertambahanGir){
        gir = gir + pertambahanGir;
        System.out.println("Gir : "+gir);
    }

    void tambahKecepatan(int pertambahanKecepatan){
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan : "+kecepatan);
    }
}

class SepedaGunung extends Sepeda{
    int setSadel;

    void setSadel(int pertambahanGir){
        gir = 2*(gir+pertambahanGir);
        System.out.println("Gir : "+gir);
    }
}


public class Overriding {
    public static void main(String[] args){
        SepedaGunung sepedaku = new SepedaGunung();

        sepedaku.tambahKecepatan(10);
        sepedaku.ubahGir(2);
        sepedaku.setSadel(20);
    }
}
