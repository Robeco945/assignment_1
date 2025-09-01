public class Motorcycle implements Vehicle{
    private int wheels;
    public Motorcycle (int wheels){
        this.wheels = wheels;
    }
    @Override
    public String getInfo(){
        return("Number of wheels on a motorcycle: "+ wheels);
    }
}
