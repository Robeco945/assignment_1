public class Circle extends Shape{
    public double pi = 3.14;
    private double radius;
    private double area;
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
        this.area = area;
    }
    @Override
    public double calculateArea(){
        area = pi*radius*radius;
        return area;
    }
}
