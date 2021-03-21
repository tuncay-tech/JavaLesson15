public class Bicycle {  // temel class ımız
    // iki tane özelliklleri olsun
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {  // consructor  açtık
        this.gear = gear;
        this.speed = speed;
    }

    // bu Bicycle clasının 3 tane metodu var
    public void applyBrake(int decrement) {  // metod açtık
        speed -= decrement;   // fren uygulama
    }

    public void speedUp(int increment) {  // metod açtık
        speed += increment;    // hızlanma
    }
    // string bir metod açtık

    public String toString() {

        return ("no of gears are: " + gear + "\n" + "speed of bicycle is: " + speed);
    }
}


