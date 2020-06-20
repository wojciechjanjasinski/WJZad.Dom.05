package Barman;

public class OrderADrink {
    public static void main(String[] args) {
        Barman barman = new Barman();

        Person personOne = new Person("Jan", "Kazimierski", 17);
        Drink drinkOne = new Drink("Radosna noc", true, 21.99);
        order(barman, personOne, drinkOne);

        Person personTwo = new Person("Anna", "Lemańska", 15);
        Drink drinkTwo = new Drink("Malinowa radość", false, 15.99);
        order(barman, personTwo, drinkTwo);

        Person personThree = new Person("Albert", "Kumański", 20);
        Drink drinkThree = new Drink("Nocny ogień", true, 22.99);
        order(barman, personThree, drinkThree);
    }

    private static void order(Barman barman, Person personOne, Drink drinkOne) {
        if (barman.order(personOne, drinkOne)) {
            System.out.println(personOne.getFirstName() + " Twój drink " + drinkOne.getName() + " jest gotowy do odbioru. Kwota do zapłaty to " + drinkOne.getPrice() + " PLN ");
        } else {
            System.out.println("Niestety nie ukończyłeś wymaganego przepisami wieku, aby móc zamówić ten drink.");
        }
    }
}
