public class ShapeCalculator {
    public static void main(String[] args){
        Shape[] shapes;
        shapes = new Shape[3];
        shapes[0] = new Circle(5, "blue");
        shapes[1] = new Rectangle (4,3,"dark blue");
        shapes[2] = new Triangle(7, 3, "yellow");
        for (Shape shape : shapes) {
            System.out.println("Area of "+shape.getClass().getSimpleName()+": "+shape.calculateArea()+", color: "+shape.getColor());
        }
    }
}
