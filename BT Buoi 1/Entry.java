import java.util.Scanner;

import myPack.*;

public class Entry {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[])
    {
          Triangle triangle = new Triangle();
          
          triangle.a = scan.nextFloat();
          triangle.b = scan.nextFloat();
          triangle.c = scan.nextFloat();

          System.out.println(triangle.Area());
    }
}
