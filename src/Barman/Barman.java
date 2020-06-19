package Barman;

public class Barman {
    boolean order(Person person) {
        return person.getAge() >= 18 || person.getAge() < 18 && !person.getDrink().isAlko();
    }
}
