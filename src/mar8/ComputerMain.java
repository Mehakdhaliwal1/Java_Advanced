package mar8;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.showComputerFeatures();

        computer.capacity = 256;
        computer.brand = "Iphone";
        computer.color = "Black";
        computer.showComputerFeatures();

        Laptop laptop = new Laptop();
        laptop.color = "Black";
        laptop.showComputerFeatures();

        Tablet tablet = new Tablet();
        tablet.color = "Black";
        tablet.showComputerFeatures();

    }
}
