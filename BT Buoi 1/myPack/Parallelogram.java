package myPack;

public class Parallelogram {
    public float a, b, h;


    public double Perimeter() {
        return a * 2 + b * 2;
    }

    public double Area() {
        return Math.max(a, b) * h;
    }
}
