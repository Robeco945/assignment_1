abstract class AbstractClass implements Vehicle{
    protected String color;
    public AbstractClass(String color){
        this.color= color;
    }
    public abstract int moreWheels();
}
