public class ElectricCar extends AbstractVehicle{
    private int wheels;
    private int batteryCapacity;
    public ElectricCar (int wheels ,int batteryCapacity, String color) {
        super(color);
        this.batteryCapacity = batteryCapacity;
        this.wheels = wheels;
    }
    @Override
    public void charge(){
        System.out.println("Vehicle is fully charged");
    }
    @Override
    public int moreWheels(){
        wheels += 2;
        return wheels;
    }
    @Override
    public String getInfo(){
        return("Number of wheels on e-car: "+wheels+
                "\nCar battery capacity: "+batteryCapacity);
    }
    @Override
    public String punctureBattery(){
        return("Your battery has been puntured and will explode soon");
    }
}
