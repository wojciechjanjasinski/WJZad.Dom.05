package Barman;

public class OrderADrink {
    public static void main(String[] args) {
        Barman barman = new Barman();

        Person personOne = new Person("Jan", "Kazimierski", 17, new Drink("Mroczna noc", true, 20.99));
        orderTwo(barman, personOne);

        Person personTwo = new Person("Anna", "Lemańska", 15, new Drink("Radość o poranku", false, 15.99));
        orderTwo(barman, personTwo);

        Person personThree = new Person("Albert", "Kumański", 20, new Drink("Jasna pani", true, 22.99));
        orderTwo(barman, personThree);
    }

    private static void orderTwo(Barman barman, Person personOne) {
        if (barman.order(personOne)) {
            System.out.println(personOne.getFirstName() + " Twój drink " + personOne.getDrink().getName() + " jest gotowy do odbioru. Kwota do zapłaty to " + personOne.getDrink().getPrice() + " PLN ");
        } else {
            System.out.println("Niestety nie ukończyłeś wymaganego przepisami wieku, aby móc zamówić ten drink.");
        }
    }
}
