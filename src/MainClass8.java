public class MainClass8 {
    public static void main(String[] args) {
        Calısan num1 = new Calısan("MEHMET", "MARMELAT",23,123456,"ODTÜ");
        num1.yazdır();
        System.out.println(" --------------------- ");

        Yonetici num2 = new Yonetici("MURAT","KAZIM",24,23456,"Atletizm");
        num2.yazdır();
        num2.projeyibaşlat("JAVA PROJESİ");
    }
}
