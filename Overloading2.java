class buatLingkaran{
    int diameter,x,y;
    String warna,nama;

    public buatLingkaran(int diameter){
        this.diameter = diameter;
    }
    public buatLingkaran(int diameter,int x,int y){
        this.diameter = diameter;
        this.x = x;
        this.y = y;
    }
    public buatLingkaran(int diameter,int x,int y,String warna,String nama){
        this.diameter = diameter;
        this.x = x;
        this.y = y;
        this.warna = warna;
        this.nama = nama;
    }
    void info(){
        System.out.println("Diameter Lingkaran  : "+this.diameter);
        System.out.println("Panjang x Lingkaran : "+this.x);
        System.out.println("Panjang y Lingkaran : "+this.y);
        System.out.println("Warna Lingkaran     : "+this.warna);
        System.out.println("Nama Lingkaran      : "+this.nama);
    }
}


public class Overloading2 {
    public static void main(String[] args){
        buatLingkaran lkr = new buatLingkaran(12);
        lkr.info();

        buatLingkaran lkr2 = new buatLingkaran(15,5,7);
        lkr2.info();

        buatLingkaran lkr3 = new buatLingkaran(19,2,3,"Hijau","APA");
        lkr3.info();
    }
}