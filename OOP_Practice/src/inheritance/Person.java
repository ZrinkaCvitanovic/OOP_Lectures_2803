package inheritance;

public class Person {
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getNameSurname()  {
        return this.name + " " + this.surname;
    }
    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return this.surname + ", " + this.name + ", " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Person p = (Person) o;
        return this.getNameSurname().equals(p.getNameSurname()) && this.getAge() == (p.getAge());
        //int is a primitive type (not an Object) so it does not have equals() function implemented

    }

    public static void main(String[] args) {
        Person p1 = new Person("p1", "s1", 23);
        Person p2 = new Person("p1", "s1", 23);
        System.out.println(p1.equals(p2));
    }

}
