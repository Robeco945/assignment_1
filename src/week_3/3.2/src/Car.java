public class Car extends AbstractVehicle {
    private int wheels;
    public Car(int wheels, String color){
        super(color);
        this.wheels = wheels;
    }
    @Override
    public String getInfo(){
        return ("number of wheels on a car: "+wheels+
                "\nCar color: " + color);
    }
    @Override
    public int moreWheels(){
        wheels += 2;
        return wheels;
    }
}
