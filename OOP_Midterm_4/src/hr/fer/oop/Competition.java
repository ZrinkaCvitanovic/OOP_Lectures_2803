package hr.fer.oop;

public class Competition <T extends Vehicle> implements Duel <T, T> {
    //remove the "extends Vehicle" -> what happens with getName() function?
    public double rateA(T a) {
        return a.getName().length();
    }

    public double rateB(T b) {
        return b.getName().length();
    }
    //the methods are essentially the same, but we need to implement both
    public String battle(T a, T b) {
        int result = Double.compare(rateA(a), rateB(b));
        if (result > 0) {
            return a.toString(); //every Object has a toString() method
        } else if (result < 0) {
            return b.toString();
        }
        return "DRAW";
    }
}
