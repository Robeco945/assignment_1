abstract class AbstractClass implements Vehicle{
    protected String color;
    public AbstractClass(String color){
        this.color= color;
    }
    abstract int moreWheels();
}
