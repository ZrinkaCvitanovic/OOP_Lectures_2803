package hr.fer.oop;

public abstract class Building implements EnergyEfficiency {
    protected final String address;
    protected final int numberOfApartments;
    protected final int energyConsumption;
    // Protected since they must only be seen by classes in this packet or by subclasses
    // final since once the value is declared either here or in the constructor it can't be changed. Similar to const in
    // other languages

    public Building(String address, int numberOfApartments, int energyConsumption) {
        this.address = address;
        this.numberOfApartments = numberOfApartments;
        this.energyConsumption = energyConsumption;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumberOfApartments() {
        return this.numberOfApartments;
    }

    public int getEnergyConsumption() {
        return this.energyConsumption;
    }

    // Marking a method as abstract signifies that we don't know the implementation yet, but it needs to be here
    // The classes that will extend this class must offer their implementation of this method. A.k.a. override it.
    public abstract String calculateEnergyClass();
}
