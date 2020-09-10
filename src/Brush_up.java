import java.util.*;
public class Brush_up {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static Boolean exit = false;

    static Scanner scan=new Scanner(System.in);
    static boolean canMakeCoffee(int waterNeed, int milkNeed, int beansNeed) {
        if (water >= waterNeed) {
            if (milk >= milkNeed) {
                if (beans >= beansNeed) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    return true;
                } else {
                    System.out.println("Sorry, not enough beans!");
                    return false;
                }

            } else {
                System.out.println("Sorry, not enough milk!");
                return false;
            }
        } else {
            System.out.println("Sorry, not enough water!");
            return false;
        }
    }

    public static void buy(){
        System.out.println();
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scan.next();
        switch (choice) {
            case "1": {
                if (canMakeCoffee(250, 0, 16)) {
                    water -= 250;
                    beans -= 16;
                    cups--;
                    money += 4;
                    break;
                }
            }
            case "2": {
                if (canMakeCoffee(350, 75, 20)) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups--;
                    money += 7;
                    break;
                }
            }
            case "3": {
                if (canMakeCoffee(200, 100, 12)) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups--;
                    money += 6;
                    break;

                }

            }
            case "back": {
                break;
            }
            default: {
                break;
            }

        }
        cur_Status = Status.CHOOSING;
    }
    static void fill() {
        //System.out.println("fill() called");
        System.out.println();
        System.out.print("Write how many ml of water do you want to add: ");
        int waterAdd = scan.nextInt();
        System.out.println();
        System.out.print("Write how many ml of milk do you want to add: ");
        int milkAdd = scan.nextInt();
        System.out.println();
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        int beansAdd = scan.nextInt();
        System.out.println();
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        int cupsAdd = scan.nextInt();
        System.out.println();
        water += waterAdd;
        milk += milkAdd;
        beans += beansAdd;
        cups += cupsAdd;

        cur_Status = Status.CHOOSING;
    }
    static void take() {
        //System.out.println("take() called");
        System.out.println("I gave you $" + money +"\n");
        money = 0;

        cur_Status = Status.CHOOSING;
    }
    static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();

        cur_Status = Status.CHOOSING;
    }
    static void exit() {
        //System.out.println("exit() called");
        cur_Status = Status.EXITING;
    }

    enum Status {
        CHOOSING, BUYING, FILLING, TAKING, REMAINING, EXITING
    }

    static Status cur_Status = Status.CHOOSING;

    public static void main(String[] args) {
        //Scanner scan =new Scanner(System.in);

        do {
            System.out.println(cur_Status);
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String action = scan.next();
            switch (action) {
                case "buy":
                    cur_Status = Status.BUYING;
                    System.out.println(cur_Status);
                    buy();
                    break;
                case "fill":
                    cur_Status = Status.FILLING;
                    System.out.println(cur_Status);
                    fill();
                    break;
                case "take":
                    cur_Status = Status.TAKING;
                    System.out.println(cur_Status);
                    take();
                    break;
                case "remaining":
                    cur_Status = Status.REMAINING;
                    System.out.println(cur_Status);
                    remaining();
                    break;
                case "exit":
                    exit();
                    System.out.println(cur_Status);
                    break;
            }
        } while (cur_Status != Status.EXITING);


    }

}



