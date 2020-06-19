package RectangularTriangle;

public class TriangleCheck {
    boolean checkG (Triangle triangle) {return triangle.getAngleG() == 90;}
    boolean checkH (Triangle triangle) {return triangle.getAngleH() == 90;}
    boolean checkI (Triangle triangle) {return triangle.getAngleI() == 90;}

    boolean checkAlfa (Triangle triangle) {return triangle.getAngleG() + triangle.getAngleH() == 90;}
}
