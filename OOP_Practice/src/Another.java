import pack1.FoodType;
//without the import, this class would not know what FoodType is -> try to comment the import and see what happens

public class Another {
    public static void main(String[] args) {
    FoodType ft1 = new FoodType("ft1", 23, 34, 45);
    System.out.println(ft1.getName());
    ft1.setName("ft2");
    System.out.println(ft1.getName());

    }
}
