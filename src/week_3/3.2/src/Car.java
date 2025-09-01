public class Car implements Vehicle{
    private int wheels;
    public Car(int wheels){
        this.wheels = wheels;
    }
    @Override
    public String getInfo(){
        return ("number of wheels on a car: "+wheels);
    }
}
