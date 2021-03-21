public class MainClass7 {
    public static void main(String[] args) {

        Müdür2 personel_mudur = new Müdür2();
        personel_mudur.setDeneyimYılı(3);
        personel_mudur.setIsim("mehmet");
        int Mudur_tazminat = personel_mudur.TazminatHesapla();

        İşçi2 personel_işci = new İşçi2();
        personel_işci.setIsim("kamuran");
        personel_işci.setDeneyimYılı(3);
        int İşci_tazminat = personel_işci.TazminatHesapla();

        Taşeron personel_taşeron = new Taşeron();
        personel_taşeron.setIsim("cahit");
        personel_taşeron.setDeneyimYılı(3);
        int taşeron_tazminat = personel_taşeron.TazminatHesapla();

        System.out.println("Mudur_tazminat: " + Mudur_tazminat);
        System.out.println("İşci_tazminat: " + İşci_tazminat);
        System.out.println("taşeron_tazminat: " + taşeron_tazminat);

    }
}
