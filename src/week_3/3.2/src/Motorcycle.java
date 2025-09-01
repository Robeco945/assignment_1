public class Motorcycle extends AbstractVehicle {
    private int wheels;
    public Motorcycle (int wheels, String color){
        super(color);
        this.wheels = wheels;
    }
    @Override
    public String getInfo(){
        return("Number of wheels on a motorcycle: "+ wheels+
                "\nMotorcycle color: "+color);
    }
    @Override
    public int moreWheels(){
        wheels += 2;
        return wheels;
    }


}
