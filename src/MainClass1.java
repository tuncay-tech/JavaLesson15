import java.util.ArrayList;

public class MainClass1 {
    public static void main(String[] args) {

        ArrayList<Kullanıcı1> kullanıcılar = new ArrayList<>();

        kullanıcılar.add(new Kullanıcı1("salih", 40, false));
        kullanıcılar.add(new Kullanıcı1("murat", 27, true));
        kullanıcılar.add(new Kullanıcı1("selim", 34, false));
        kullanıcılar.add(new Kullanıcı1("kamil", 67, true));
        kullanıcılar.add(new Kullanıcı1("adil", 19, true));
        for (int i = 0; i < kullanıcılar.size(); i++) {
            if (kullanıcılar.get(i).isÜniversite_okudu_mu() == true) {   // == true yazmaya gerek yok
                System.out.println(kullanıcılar.get(i).getIsim() + ": üniversite mezunudur," + " yaşı: " + kullanıcılar.get(i).getYas());
            } else {
                System.out.println(kullanıcılar.get(i).getIsim() + ": üniversite mezunu değildir," + " yaşı: " + kullanıcılar.get(i).getYas());
            }

        }

    }
}
