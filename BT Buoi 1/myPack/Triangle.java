package myPack;

public class Triangle {
    public float a, b, c;

    public boolean checkTriangle() {
        if (a + b > c && a + c > b && b + c > a) return true;
        return false;
    }

    public float Perimeter(){
        if (checkTriangle()) return a + b + c;
        return -1;
    }

    public float Area(){
        float p = (a + b + c) / 2;
        if (checkTriangle()) return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return -1;
    }
}
