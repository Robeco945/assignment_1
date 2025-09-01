public class Triangle extends Shape {
    private double height;
    private double base;
    private double area;
    public Triangle(double height, double base, String color){
        super(color);
        this.height = height;
        this.base = base;
        this.area = area;
    }
    @Override
    public double calculateArea(){
        area = base*0.5*height;
        return area;
    }
}
