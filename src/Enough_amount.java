import java.util.*;
public class Enough_amount {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water_available = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk_available = scan.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans_available = scan.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int n = scan.nextInt();

        int beans_Needed = n * (15);
        int water_Needed = n * (200);
        int milk_Needed = n * (50);
        if (beans_Needed == beans_available && water_Needed == water_available && milk_available == milk_Needed) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (beans_Needed < beans_available && water_Needed < water_available && milk_available > milk_Needed) {
            if (beans_available - beans_Needed < 15 || water_available - water_Needed < 200 || milk_available - milk_Needed < 50) {
                System.out.println("Yes, I can make that amount of coffee");
            } else {
                int rem1 = Math.min((beans_available - beans_Needed) / 15, (water_available - water_Needed) / 200);
                rem1 = Math.min(rem1, (milk_available - milk_Needed) / 50);
                System.out.println("Yes, I can make that amount of coffee (and even " + rem1 + " more than that)");
            }
        } else {
            int rem1 = Math.min(beans_available / 15, water_available / 200);
            rem1 = Math.min(rem1, milk_available / 50);
            System.out.println("No, I can make only " + rem1 + " cup(s) of coffee");
        }
    }
}
