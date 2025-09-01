abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
    protected String color;
    public AbstractVehicle(String color){
        this.color= color;
    }
    public abstract int moreWheels();
    @Override
    public void charge(){
        System.out.println("this vehicle can not be charged");
    }
    @Override
    public String punctureBattery(){
        return("vehicle damage is minimal, replace your battery");
    }
}
