public class MainClass6 {
    public static void main(String[] args) {
        Mudur personel_mudur = new Mudur();
        personel_mudur.setDeneyimYılı(3);
        personel_mudur.setIsim("mehmet");
        int Mudur_tazminat = personel_mudur.TazminatHesapla();

        İşci personel_işci = new İşci();
        personel_işci.setIsim("kamuran");
        personel_işci.setDeneyimYılı(3);
        int İşci_tazminat = personel_işci.TazminatHesapla();

        System.out.println("Mudur_tazminat: " + Mudur_tazminat);
        System.out.println("İşci_tazminat: " + İşci_tazminat);

    }
}
