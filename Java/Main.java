package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("AMQ123", new Account("charles", "75867760"), "a", "b");
        // car.passenger = 4; 
        uberX.setPassenger(4);
        uberX.printDataCar();

        Car car2 = new Car("QWE567",new Account("Luis", "12345678"));
        // car2.passenger = 3;
        car2.printDataCar();
    }
}
