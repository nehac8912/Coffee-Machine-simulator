import java.util.Scanner;
public class Machines_need {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int n = scan.nextInt();
        int beansNeeded = n * (15);
        int waterNeeded = n * (200);
        int milkNeeded = n * (50);
        System.out.println("For "+n+" cups of coffee you will need:");
        System.out.println(waterNeeded + " ml of water");
        System.out.println(milkNeeded + " ml of milk");
        System.out.println(beansNeeded + " g of coffee beans");
    }
}