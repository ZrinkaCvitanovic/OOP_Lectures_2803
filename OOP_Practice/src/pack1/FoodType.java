package pack1; //this is necessary because it specifies the path to this class in case other classes need to import it

public class FoodType {

    private String name;
    private int protein;
    private int carbs;
    private int fat;

     public FoodType(String name, int protein, int carbs, int fat) {
     //FoodType(String name, int protein, int carbs, int fat) {
        this.name = name;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }
    //comment line 10 and uncomment line 11 (remove the "public" modifier) and visit Another class -> can you create a FoodType object?
    //after that, move Another to the same package and see what happens -> can you create it now?
    //the default value for visibility is package private -> only classes from the same package can see that attribute/method
    //no need for importing FoodType class if Another is in the same package

    public String getName() {
        return this.name;
    }


    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return this.name + ": p - " + this.protein + "%, c - " + this.carbs + "%, f - " + this.fat + "%.";
    }


    public static void main (String[] args) {
        FoodType ft1 = new FoodType("name", 21, 45, 2);
        System.out.println(ft1.getClass());
        System.out.println(ft1);
        //Person p = new Person("n", "s", 23);
        //System.out.println(p.getClass());

    }
}


