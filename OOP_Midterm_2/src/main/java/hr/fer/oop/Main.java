package hr.fer.oop;

public class Main {
    public static void main(String[] args) {
        MotorVehicle car = new Car("Opel", "Astra", 2007, FuelType.DIESEL, 113);
        System.out.println(car.getHorsePower());
        System.out.println(car.getFuelType());
        System.out.println(car.toString());

        Trailer camper = new Camper();
        System.out.println(camper.toString());
        camper.attachTo(car);
        System.out.println(camper.toString());

        MotorVehicle limousine = new Limousine("Lincoln", "Towncar", 2003, FuelType.GASOLINE, 205, 8);
        System.out.println(limousine.getHorsePower());
        System.out.println(limousine.getFuelType());
        System.out.println(limousine.toString());

        System.out.println("car instanceof Car: " + (car instanceof Car));
        System.out.println("car instanceof MotorVehicle: " + (car instanceof MotorVehicle));
        System.out.println("camper instanceof Camper: " + (camper instanceof Camper));
        System.out.println("camper instanceof Trailer: " + (camper instanceof Trailer));
        System.out.println("limousine instanceof Limousine: " + (limousine instanceof Limousine));
        System.out.println("limousine instanceof Car: " + (limousine instanceof Car));
        System.out.println("limousine instanceof MotorVehicle: " + (limousine instanceof MotorVehicle));
    }
}
