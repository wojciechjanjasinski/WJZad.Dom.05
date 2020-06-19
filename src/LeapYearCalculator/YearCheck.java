package LeapYearCalculator;

public class YearCheck {
    public static void main(String[] args) {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Year year = new Year(1601);
        System.out.println(year.getYear() + " rok.");
        if (leapYearChecker.isLeapOne(year)) {
            System.out.println("To rok przestępny");
        } else if (leapYearChecker.isLeapTwo(year)) {
            System.out.println("To rok przestępny");
        } else
            System.out.println("To zwykły rok kalnedarzowy, który liczy sobie 365 dni");
    }
}
