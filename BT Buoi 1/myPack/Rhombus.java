package myPack;

public class Rhombus {
    
    public float a, b;

    public double perimeter() {
        return 4 * Math.sqrt(a * a / 4 + b * b / 4);
    }
    public double area() {
        return 0.5 * a * b;
    }
}
