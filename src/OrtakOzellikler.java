public class OrtakOzellikler {

    private String isim;
    private String soyisim;
    private int yas;
    private int telno;

    public OrtakOzellikler(String isim, String soyisim, int yas, int telno) {  // constrctor
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.telno = telno;
    }

    public void yazdır(){  // metod ekledik
        System.out.println("isim : " + this.isim);
        System.out.println("soyisim: " + this.soyisim);
        System.out.println("yas: " + this.yas);
        System.out.println("telno: " + this.telno);
    }
}
