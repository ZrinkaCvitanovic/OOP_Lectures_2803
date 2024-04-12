package hr.fer.oop;

public class Limousine extends Car {
    public int passengerCapacity;

    public Limousine(String manufacturer, String model, int yearOfManufacture, FuelType fuelType, int horsePower, int passengerCapacity) {
        // When extending a class the first line in the constructor must call the parent's class constructor using the
        // super keyword
        // Here we're calling the Car constructor using the super keyword.
        super(manufacturer, model, yearOfManufacture, fuelType, horsePower);
        this.passengerCapacity = passengerCapacity;
    }

    public String toString() {
        // Here we're using the supers to string method to get its string representation. In this case super refers
        // to the class Car that we're extending
        return super.toString() + " and with the passenger capacity of " + passengerCapacity;
    }
}
