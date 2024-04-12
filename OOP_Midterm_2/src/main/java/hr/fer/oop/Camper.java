package hr.fer.oop;

public class Camper implements Trailer{
    private MotorVehicle attachedTo;

    public Camper() {
    }

    @Override
    public void attachTo(MotorVehicle vehicle) {
        this.attachedTo = vehicle;
    }

    public String toString() {
        // null signifies the absence of a value, in this case this means that this camper isn't attached to any vehicle
        if (attachedTo == null) {
            return "Camper not attached to any motor vehicle";
        } else {
            return "Camper attached to '" + attachedTo.getModel() + "'";
        }
    }
}
