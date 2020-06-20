package LeapYearCalculator;

public class LeapYearChecker {
    boolean isLeapYear(Year year) {
        return (year.getYear() % 4 == 0 && year.getYear() % 100 != 0) || year.getYear() % 400 == 0;
    }
}