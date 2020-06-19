package RectangularTriangle;

public class IsRightTriangleTwo {
    public static void main(String[] args) {
        TriangleCheck triangleCheck = new TriangleCheck();
        Triangle triangleTwo = new Triangle(7, 7, 7, 't', 'u', 'p', 85, 10);
        if (triangleCheck.checkAlfa(triangleTwo)) {
            System.out.println("Ten trójkąt również jest prostokątny");
        } else
            System.out.println("Ten trójkąt nistety nie jest prostokątny");
    }
}
