package Barman;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Drink drink;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, Drink drink) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.drink = drink;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", drink=" + drink +
                '}';
    }
}
