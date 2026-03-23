import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart(null, 0, 1);


        while(run){
            System.out.println("Do you want to:");
            System.out.println("1. View cart");
            System.out.println("2. Add item in cart");
            System.out.println("3. delete item in cart");
            System.out.print("Enter: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            if(userInput == 1){

                shoppingCart.viewShoppingCart();

            }

            else if (userInput == 2){
                System.out.print("Enter the name of your new product: ");
                String name = scanner.nextLine();
                System.out.println("Enter the price if the product: ");
                double price = scanner.nextInt();
                scanner.nextLine();

                shoppingCart.addItem(name, price);

            }

            else if (userInput == 3){
                System.out.print("Enter the name of your product you want to delete: ");
                String name = scanner.nextLine();

                shoppingCart.removeItem(name);
            }




        }
    }
}

