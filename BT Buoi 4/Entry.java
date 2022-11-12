import java.util.ArrayList;
import java.util.Scanner;


import myPack.*;
public class Entry {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Computer> computers = new ArrayList<Computer>();
    static ArrayList<CPU> cpus = new ArrayList<>();
    static ArrayList<RAM> rams = new ArrayList<>();
    static ArrayList<Mainboard> mainboards = new ArrayList<>();
    static public void buildComputer()
    {
        int nameComputer = 1;

        for (CPU x : cpus)
        {
            for (RAM y : rams)
            {
                if (x.getId().equals(y.getId()))
                {
                    for (Mainboard z : mainboards)
                    {
                        if (x.getId().equals(z.getId())) {
                            
                            Computer tmpComputer = new Computer("May tinh " + nameComputer, x, z, y);
                            computers.add(tmpComputer);
        
                            nameComputer++;
                        }
                    }
                }
            }
        }

    }

    public static void main(String args[])
    {
        // Example example = new Example("Hello");
        // example.setString("hi");
        // System.out.println(example.getString());

        // Integer a = 127;
        // Integer b = 127;

        // System.out.println(a == b);


        // StringBuilder sbd = new StringBuilder("Hi");
        // sbd.append("Hello");
        // String s = sbd.toString();
        // System.out.println(s);

        

        System.out.println("Nhap so luong linh kien");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap thong tin RAM: ");
            RAM ram = new RAM();
            ram.input();
            rams.add(ram);

            System.out.println("Nhap thong tin CPU: ");
            CPU cpu = new CPU();
            cpu.input();
            cpus.add(cpu);

            System.out.println("Nhap thong tin Mainboard: ");
            Mainboard mainboard = new Mainboard();
            mainboard.input();
            mainboards.add(mainboard);
        }
    
        buildComputer();

        for (Computer x : computers)
        {
            x.output();
        }
        
        System.out.println("So linh kien thua la: " + (n * 3 - computers.size()));



    }
    
}
