package LeapYearCalculator;

public class LeapYearChecker {
    boolean isLeapOne(Year year) { return year.getYear() % 4 == 0 && year.getYear() % 100 != 0; }
    boolean isLeapTwo(Year year) {
        return year.getYear() % 400 == 0;
    }

}
