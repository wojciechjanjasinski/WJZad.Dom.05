package RectangularTriangle;

public class IsRightTriangle {
    public static void main(String[] args) {
        TriangleCheck triangleCheck = new TriangleCheck();
        Triangle triangle = new Triangle(8, 8, 8, 'x', 'y', 'z', 220, 60, 60);
        if (triangle.getAngleG() + triangle.getAngleH() + triangle.getAngleI() != 180) {
            System.out.println("Suma wszystkich kątów trójkąta wynosi 180°. Wprowadź proszę poprawne wartości.");
        } else if (triangleCheck.checkG(triangle)) {
            System.out.println("Ten trójkąt jest prostokątny");
        } else if (triangleCheck.checkH(triangle)) {
            System.out.println("Ten trójkąt jest prostokątny");
        } else if (triangleCheck.checkI(triangle)) {
            System.out.println("Ten trójkąt jest prostokątny");
        } else
            System.out.println("To nie jest trójkąt prostokątny");
    }
}
