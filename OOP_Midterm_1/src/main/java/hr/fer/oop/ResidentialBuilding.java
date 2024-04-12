package hr.fer.oop;

public class ResidentialBuilding extends Building {

    public int numberOfParkingSpots;

    public ResidentialBuilding(String address, int numberOfApartments, int energyConsumption, int numberOfParkingSpots) {
        super(address, numberOfApartments, energyConsumption);
        this.numberOfParkingSpots = numberOfParkingSpots;
    }

    public int getNumberOfParkingSpots() {
        return this.numberOfParkingSpots;
    }

    public boolean hasFreeParkingSpots() {
        return this.numberOfParkingSpots > this.numberOfApartments;
        // This is a shorter way of writing an if statement, since this comparison can be either true or false
    }

    public String calculateEnergyClass() {
        if (this.energyConsumption < 50) {
            return "A";
        } else if (this.energyConsumption < 90) {
            return "B";
        } else {
            return "C";
        }
    }

    public boolean investigateEnergyEfficiency() {
        return this.calculateEnergyClass().equals("A");
    }

}
