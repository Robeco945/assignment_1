public class Rectangle extends Shape{
    private double length;
    private double width;
    private double area;
    public Rectangle(double length, double width, String color){
        super(color);
        this.width = width;
        this.length = length;
        this.area = area;

    }
    @Override
    public double calculateArea(){
        area = width*length;
        return area;
    }
}
