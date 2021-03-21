public class Kullanıcı0 {

    private String isim;
    private String mail;
    private String şifre;

    public Kullanıcı0(String isim, String mail, String şifre) {   // cont. ismi le class ismi aynı olacak
        this.isim = isim;
        this.mail = mail;
        this.şifre = şifre;
    }

    public String getIsim() {
        return isim;
    }

    public String getMail() {
        return mail;
    }

    public String getŞifre() {
        return şifre;
    }
}
