public class Yonetici extends OrtakOzellikler {

    private String spor ;
    public Yonetici(String isim, String soyisim, int yas, int telno, String spor) {
        super(isim, soyisim, yas, telno);
        this.spor = spor;
    }
    public void projeyibaşlat(String projeismi){
        System.out.println("yeni proje durumu : " + projeismi);
    }
    @Override   // üniversitesini yazdırmak için yaptık
    public void yazdır() {
        super.yazdır();
        System.out.println("spor : " + spor);
}
}