package Barman;

public class Barman {
    boolean order(Person person, Drink drink) {
        return person.getAge() >= 18 || person.getAge() < 18 && !drink.isAlko();
    }
}
