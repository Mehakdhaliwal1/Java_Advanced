package mar8;

public class Computer {

    String brand;
    String color;
    double capacity;

    public Computer() {
    }

    public Computer(String brand, double capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    public void showComputerFeatures(){
        System.out.println("Computer features");
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Capacity: " + capacity );
    }
}
