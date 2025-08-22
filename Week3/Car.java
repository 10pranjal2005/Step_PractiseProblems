public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
    }

    public void startEngine() {
        isRunning = true;
        System.out.println(brand + " " + model + " engine started.");
    }

    public void stopEngine() {
        isRunning = false;
        System.out.println(brand + " " + model + " engine stopped.");
    }

    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model + " (" + color + ")");
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2018, "White");
        Car car2 = new Car("Honda", "Civic", 2020, "Black");
        Car car3 = new Car("Ford", "Mustang", 2016, "Red");

        car1.startEngine();
        car1.displayInfo();
        System.out.println("Age: " + car1.getAge(2025) + " years");

        car2.displayInfo();
        car2.startEngine();
        car2.stopEngine();

        car3.displayInfo();
        System.out.println("Age: " + car3.getAge(2025) + " years");
    }
}
