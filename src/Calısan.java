public class Calısan extends OrtakOzellikler {

    private String universite;  // subclasss taomayan bir eleman ekleyebiliriz bu sadece bu sınıfa ait olacak

    public Calısan(String isim, String soyisim, int yas, int telno, String universite) {   // constrctor
        super(isim, soyisim, yas, telno);  // super diğer özellikleride ekledik
        this.universite = universite;  // this ile zaten üniverisiteyi de extradan ekledik
    }

    @Override   // üniversitesini yazdırmak için yaptık
    public void yazdır() {
        super.yazdır();
        System.out.println("univerite : " + universite);
    }
}
