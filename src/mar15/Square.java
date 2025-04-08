package mar15;

public class Square extends Shape{
    double side =10.0;
    @Override
    double area() {
        double area = side * side;
        return area;
    }
}
