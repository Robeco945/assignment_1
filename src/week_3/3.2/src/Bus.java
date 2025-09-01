public class Bus implements Vehicle{
    private int wheels;
    public Bus (int wheels){
        this.wheels = wheels;
    }
    @Override
    public String getInfo(){
        return("Number of wheels on a bus:"+ wheels);
    }
}
