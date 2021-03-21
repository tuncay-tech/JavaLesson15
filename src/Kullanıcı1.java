public class Kullanıcı1 {

        private String isim;
        private int yas;
        private boolean üniversite_okudu_mu;

        // konsraktır oluşturulaım
    public Kullanıcı1(String isim, int yas, boolean üniversite_okudu_mu) {
        this.isim = isim;
        this.yas = yas;
        this.üniversite_okudu_mu = üniversite_okudu_mu;
    }

    public String getIsim() {    // GETTER BİZ YAPTIK OTOMATİK
        return isim;
    }

    public int getYas() {
        return yas;
    }

    public boolean isÜniversite_okudu_mu() {
        return üniversite_okudu_mu;
    }
}
