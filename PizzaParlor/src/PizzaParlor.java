/*import java.util.Scanner;

public class PizzaParlor {
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
            System.out.println((i+1) + " - " + Flavors.values()[i]);
        }
    }
    private static void takeOrder() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Pick a menu item by entering it's number:");
            int input = scan.nextInt()-1;
            if (input < Flavors.values().length) {
                Flavors pizzaFlavor = Flavors.values()[input];
                System.out.println("You picked " + pizzaFlavor + " pizza [" + pizzaFlavor.getPizzaNum() + "]");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid input, please try again");
            System.out.println();
            takeOrder();
        }
    }
}*/