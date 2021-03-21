public class Telefon {   // telefon adlı bir sınıf yaptık
    public Telefon() {
        System.out.println("telefon sınıfının yapıcısı");
    }
}
    class AkıllıTelefon extends Telefon {   // sınıfı
        public AkıllıTelefon() {            // ve cosractoru
            System.out.println("AkıllıTelefon");
        }
    }

    class CepTelefonu extends AkıllıTelefon{    // Not: sınıflarda () olmaz consractorlada olur
        public CepTelefonu(){                       // ama süslü parantez ikisindede olur
        System.out.println("CepTelefonu");
    }
    }
    class Samsung extends CepTelefonu{
        public Samsung() {
        System.out.println("Samsung");
    }
    }

