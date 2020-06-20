package RectangularTriangle;

public class Triangle {
    private double angleG;
    private double angleH;
    private double angleI;

    public Triangle(double angleG, double angleH, double angleI) {
        this.angleG = angleG;
        this.angleH = angleH;
        this.angleI = angleI;
    }

    public Triangle(double angleG, double angleH) {
        this.angleG = angleG;
        this.angleH = angleH;
    }

    public double getAngleG() {
        return angleG;
    }

    public void setAngleG(double angleG) {
        this.angleG = angleG;
    }

    public double getAngleH() {
        return angleH;
    }

    public void setAngleH(double angleH) {
        this.angleH = angleH;
    }

    public double getAngleI() {
        return angleI;
    }

    public void setAngleI(double angleI) {
        this.angleI = angleI;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "angleG=" + angleG +
                ", angleH=" + angleH +
                ", angleI=" + angleI +
                '}';
    }
}
