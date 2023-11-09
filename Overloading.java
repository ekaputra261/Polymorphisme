class Mobil{
    String warna;
    int tahunProduksi;

    public Mobil(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public Mobil(){

    }

    void info(){
        System.out.println("Warna : "+this.warna);
        System.out.println("Tahun Produksi : "+this.tahunProduksi);
    }
}

public class Overloading{
    public static void main(String[] args){
        Mobil mobilku = new Mobil("Merah",2003);
        mobilku.info();

        Mobil mobilmu = new Mobil();
        mobilmu.info();
    }
}