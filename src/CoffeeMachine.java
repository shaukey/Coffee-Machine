package machine;
import java.util.Scanner;
public class CoffeeMachine {
    //GIVEN INFO
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            switch (input) {
                case "buy":
                    buyDrink();
                    break;
                case "fill":
                    fillMachine();
                    break;
                case "take":
                    takeOutMoney();
                    break;
                case "remaining":
                    remainingItems();
                    break;
                case "exit":
                    return;
                default:
                    break;
            }
        }
    }

    public static void remainingItems() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + "  of money");
        System.out.println();
    }

    private static void buyDrink() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        switch (choice) {
            case "1": // espresso
                if (water >= 250 && coffeeBeans >= 16 && cups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    water -= 250;
                    milk -= 0;
                    coffeeBeans -= 16;
                    cups -= 1;
                    money += 4;
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups");
                    System.out.println();
                }
                break;
            case "2": // latte
                if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    cups -= 1;
                    money += 7;
                } else if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups");
                    System.out.println();
                }
                break;
            case "3": // cappuccino
                if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    cups -= 1;
                    money += 6;
                } else if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups");
                    System.out.println();
                }
                break;
            case "back": // to main menu
                System.out.println();
                break;
            default:
                break;
        }
    }

    public static void fillMachine() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int amountOfWater = sc.nextInt();
        water += amountOfWater;
        System.out.println("Write how many ml of milk you want to add");
        int amountOfMilk = sc.nextInt();
        milk += amountOfMilk;
        System.out.println("Write how many grams of coffee beans you want to add");
        int amountOfCoffeeBeans = sc.nextInt();
        coffeeBeans += amountOfCoffeeBeans;
        System.out.println("Write how many disposable cups you want to add:");
        int amountOfCup = sc.nextInt();
        cups += amountOfCup;
        System.out.println();
    }

    public static void takeOutMoney() {
        System.out.println("I gave you $" + money );
        money -= money;
        System.out.println();
    }

}




