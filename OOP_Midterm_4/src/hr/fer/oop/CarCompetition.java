package hr.fer.oop;

public class CarCompetition extends Competition<Car> {
    //the class is not generic since it only accepts class Car
    @Override
    //not necessary, but it makes the compiler faster if you let it know that you are overriding an existing method
    public double rateA(Car c) {
        return c.getName().length() + c.getPower() / 2.0;
    }
    @Override
    public double rateA(Car c) {
        return c.getName().length() + c.getPower() / 2.0;
    }
    //these don't need to be overriden becuase they only extend a class (they don't implement an interface)
}