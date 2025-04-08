package mar15;

public class Circle extends Shape{
    double r = 5;
    @Override
    double area() {
        double area = Math.PI * r * r ;
        return area ;
    }
}
