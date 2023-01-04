package Utils;

import java.util.Scanner;

public class ScanUtils {
    public static int readInt(Scanner scan)
    {
        while (true)
        {
            try{
                int i = Integer.parseInt(scan.nextLine());
                return i;
            } catch (NumberFormatException ex){
                System.out.println("Loi dinh dang so! ");
                System.out.println("Moi ban nhap lai: ");
            }
        }
    }

    public static float readFloat(Scanner scan)
    {
        while (true)
        {
            try{
                float f = Float.parseFloat(scan.nextLine());
                return f;
            } catch (NumberFormatException ex){
                System.out.println("Loi dinh dang so! ");
                System.out.println("Moi ban nhap lai: ");
            }
        }
    }

    public static String readString(Scanner scan)
    {
        while (true)
        {
            try{
                String s = scan.nextLine();
                return s;
            } catch (NumberFormatException ex){
                System.out.println("Loi dinh dang du lieu! ");
                System.out.println("Moi ban nhap lai: ");
            }
        }
    }
}
