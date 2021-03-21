public class Müdür2 extends Personel2 {
    @Override  // annotation -- bir üst sınıfı ezer yani bir üst sınıftaki tazmainat hesaplamayı değiştirir
    public int TazminatHesapla() {
        return deneyimYılı * 15;
    }
}
