import java.util.Scanner;

public class PizzaParlorPart2 {
    enum Flavors {
        PLAIN(7),
        VEGGIE(34),
        MEDITERRANEAN(56),
        GREEK(0),
        MEATLOVERS(1);
        final int pizzaNum;
        Flavors(int pizzaNum) { //"Modifier 'private' is redundant for enum constructors"
            this.pizzaNum = pizzaNum;
        }
        public int getPizzaNum() {
                return pizzaNum;
            }
    }
    public static void main(String[] args) {
        printMenu();
        takeOrder();
    }
    private static void printMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < Flavors.values().length; i++) {
            Flavors pizzaFlavor = Flavors.values()[i];
            System.out.println(pizzaFlavor.getPizzaNum() + " - " + pizzaFlavor);
        }
    }
    private static void takeOrder() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Pick a menu item by entering it's number:");
            int input = scan.nextInt();
            boolean invalidInput = true; //user input is invalid until proven otherwise
            for (int i = 0; i < Flavors.values().length; i++) {
                Flavors pizzaFlavor = Flavors.values()[i];
                if (input == pizzaFlavor.getPizzaNum()) {
                    System.out.println("You picked " + pizzaFlavor + " pizza");
                    invalidInput = false; //user input is proven valid
                    break;
                }
            }
            if (invalidInput) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid input, please try again");
            System.out.println();
            takeOrder();
        }
    }
}
