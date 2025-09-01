public class Bus extends AbstractClass{
    private int wheels;
    public Bus (int wheels, String color){
        super(color);
        this.wheels = wheels;
    }
    @Override
    public String getInfo(){
        return("Number of wheels on a bus:"+ wheels+
                "\nBus color: "+color);
    }
    @Override
    public int moreWheels(){
        wheels += 2;
        return wheels;
    }
}
