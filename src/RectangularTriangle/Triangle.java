package RectangularTriangle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private char topD;
    private char topE;
    private char topF;
    private double angleG;
    private double angleH;
    private double angleI;

    public Triangle(double sideA, double sideB, double sideC, char topD, char topE, char topF, double angleG, double angleH, double angleI) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.topD = topD;
        this.topE = topE;
        this.topF = topF;
        this.angleG = angleG;
        this.angleH = angleH;
        this.angleI = angleI;
    }

    public Triangle(double sideA, double sideB, double sideC, char topD, char topE, char topF, double angleG, double angleH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.topD = topD;
        this.topE = topE;
        this.topF = topF;
        this.angleG = angleG;
        this.angleH = angleH;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public char getTopD() {
        return topD;
    }

    public void setTopD(char topD) {
        this.topD = topD;
    }

    public char getTopE() {
        return topE;
    }

    public void setTopE(char topE) {
        this.topE = topE;
    }

    public char getTopF() {
        return topF;
    }

    public void setTopF(char topF) {
        this.topF = topF;
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
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", topD=" + topD +
                ", topE=" + topE +
                ", topF=" + topF +
                ", angleG=" + angleG +
                ", angleH=" + angleH +
                ", angleI=" + angleI +
                '}';
    }
}
