class MountainBike extends Bicycle{

    public int seatHeight;   // ekstra bir özellikl ekledik

    public MountainBike(int gear , int speed,int startHeight)  {
        super(gear,speed);   // super ana classtan aldık
        seatHeight = startHeight;
    }
        public void setHeight(int newValue){  // metod actık
        seatHeight = newValue;
        }
   @Override
    public String toString(){
        return (super.toString() + "\nseat height is: " + seatHeight);
   }
}
