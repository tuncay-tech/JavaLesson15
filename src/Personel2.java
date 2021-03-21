public class Personel2 {
    String isim;
    int deneyimYılı;

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setDeneyimYılı(int deneyimYılı) {
        this.deneyimYılı = deneyimYılı;
    }

    public int TazminatHesapla() {
        int tazminat = deneyimYılı * 5;
        return tazminat;
    }
}