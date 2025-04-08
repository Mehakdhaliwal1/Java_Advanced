package mar15;

public class Main {
    public static void main(String[] args) {

        Shape square  = new Square();
        System.out.println("Area of Square : " + square.area());

        Shape circle = new Circle();
        System.out.println("Area of Circle : " + circle.area());
    }
}
