package hr.fer.oop;

public class Main {
    public static void main(String[] args) {
        ResidentialBuilding rBuilding = new ResidentialBuilding("Address 1", 20, 500, 30);

        System.out.println("RESIDENTIAL BUILDING");
        System.out.println("Address: " + rBuilding.getAddress());
        System.out.println("Number of apartments: " + rBuilding.getNumberOfApartments());
        System.out.println("Number of parking spots: " + rBuilding.getNumberOfParkingSpots());
        System.out.println("Energy consumption: " + rBuilding.getEnergyConsumption());
        System.out.println("Energy class: " + rBuilding.calculateEnergyClass());
        System.out.println("Is energy efficient: " + rBuilding.investigateEnergyEfficiency());
        System.out.println("Has free parking spots: " + rBuilding.hasFreeParkingSpots());
    }
}
