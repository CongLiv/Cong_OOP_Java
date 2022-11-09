package myPack;

import java.util.Scanner;

public class Student {
    
    private String name;
    private int age;
    private String _class;
    private double math, chemistry, physics;
    
    //final public double test;
    public Student() {
        //this.test = 9;
    }
    public Student(String name, int age, String _class, double math, double chemistry, double physics) {
        this.name = name;
        this.age = age;
        this._class = _class;
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
        //this.test = 10;
    }

    public void printName()
    {
        System.out.println(this.name);
    }

    public double averageScore()
    {
        this.printName();
        return (math + chemistry + physics) / 3;
    }

    public Student increaseScore()
    {
        this.math++;
        return this;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String get_class() {
        return _class;
    }
    public void set_class(String _class) {
        this._class = _class;
    }
    public double getMath() {
        return math;
    }
    public void setMath(double math) {
        this.math = math;
    }
    public double getChemistry() {
        return chemistry;
    }
    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    public double getPhysics() {
        return physics;
    }
    public void setPhysics(double physics) {
        this.physics = physics;
    }


    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten sv: ");
        setName(scan.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(Integer.parseInt(scan.nextLine()));
        System.out.println("Nhap lop: ");
        set_class(scan.nextLine());
        System.out.println("Nhap diem Toan: ");
        setMath(Double.parseDouble(scan.nextLine()));
        System.out.println("Nhap diem Hoa: ");
        setChemistry(Double.parseDouble(scan.nextLine()));
        System.out.println("Nhap diem The chat: ");
        setPhysics(Double.parseDouble(scan.nextLine()));

    }

    public void output()
    {
        System.out.println("Ten SV: " + getName() + "\nTuoi: " + getAge() + "\nLop: " + get_class() + "\nDiem 3 mon: " + getMath() + ' ' + getChemistry() + ' ' + getPhysics() + "\nDiem TB: " + averageScore());
    }
    
}
