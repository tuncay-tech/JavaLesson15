public class MainClass4 {
    public static void main(String[] args) {
        // HIERARCHICAL İNHERİTANCE  BU ÖRENEKTE İSE SINIFLARI AYNI SAYFADA YAPALIM

        B obje_B = new B();
        obje_B.print_B();
        obje_B.print_A();

        C obje_C = new C();
        obje_C.print_C();
        obje_C.print_A();

        D obje_D = new D();
        obje_D.print_D();
        obje_D.print_A();
    }
}
