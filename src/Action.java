import java.util.*;
public class Action {
    public static void main(String args[]){
        System.out.println("The coffee machine has:");
        System.out.println("400 of water");
        System.out.println("540 of milk");
        System.out.println("120 of coffee beans");
        System.out.println("9 of disposable cups");
        System.out.println("550 of money");
        Scanner scan=new Scanner(System.in);
        String action=scan.next();
        switch (action){
            case "buy":int n=scan.nextInt();
                switch (n){
                    case 1:System.out.println("The coffee machine has:");
                        System.out.println(400-250+" of water");
                        System.out.println(540+" of milk");
                        System.out.println("104 of coffee beans");
                        System.out.println("8 of disposable cups");
                        System.out.println("554 of money");
                        break;
                    case 2:System.out.println("The coffee machine has:");
                        System.out.println("50 of water");
                        System.out.println("465 of milk");
                        System.out.println("100 of coffee beans");
                        System.out.println("8 of disposable cups");
                        System.out.println("557 of money");
                        break;
                    case 3:System.out.println("The coffee machine has:");
                        System.out.println("200 of water");
                        System.out.println("440 of milk");
                        System.out.println("108 of coffee beans");
                        System.out.println("8 of disposable cups");
                        System.out.println("556 of money");
                        break;
                }
                break;
            case "fill":System.out.println("Write how many ml of water do you want to add:");
                int water=scan.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int milk=scan.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int beans=scan.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int cups=scan.nextInt();
                System.out.println("The coffee machine has:");
                System.out.println((water+400)+" of water");
                System.out.println((milk+540)+" of milk");
                System.out.println((beans+120)+" of coffee beans");
                System.out.println((cups+9)+" of disposable cups");
                System.out.println("550 of money");
                break;
            case "take":System.out.println("I gave you $550");
                System.out.println("The coffee machine has:");
                System.out.println("400 of water");
                System.out.println("540 of milk");
                System.out.println("120 of coffee beans");
                System.out.println("9 of disposable cups");
                System.out.println("0 of money");
                break;
        }
    }
    }


