package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car("AMQ123", new Account("charles", "75867760"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567",new Account("Luis", "12345678"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}
