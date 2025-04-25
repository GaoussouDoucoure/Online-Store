import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class store {
    // Store Home Screen and Options
    public static void storeHomeScreen(){
        System.out.println("""
        Welcome to our store!
        Please enter a number to proceed:
        1 - Display Products
        2 - Display Cart
        0 - Exit - closes out of the application
        """);
    }

    //Products Screen
    public static void products(){
        System.out.println("""
                1 - Search or Filter the list of Products
                2 - Add a product to Cart
                0 - Go back to Home Screen
                """);
    }
    //Cart Screen
    public static void cart(){
        System.out.println("""
                1 - Check out
                2 - Remove Product from the Cart
                0 - Go back to the Home Screen
                """);
    }
    //Display all products in the inventory
    public static void displayInventory(ArrayList<Product> inventory){
        for(Product product : inventory){
            System.out.println(product.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();
        try{
            //Create a File object for the file to be read
            File file = new File("products.txt");
            //Create a scanner object to read the file
            Scanner scanner = new Scanner(file);

            if (scanner.hasNextLine()){
                String header = scanner.nextLine();
                header.split("\\|");
//                System.out.println(header);
            }

            //Read and process each line from the file
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
//                System.out.println(line);
                String[] arr = line.split("\\|");
                String sku = arr[0].trim();
                String productName = arr[1].trim();
                double price = Double.parseDouble(arr[2].trim());
                String department = arr[3].trim();
//                System.out.println(Arrays.toString(arr));

                inventory.add(new Product(sku, productName, price, department));
            }

            storeHomeScreen();
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            if (userInput == 0){
                System.out.println("Application Closed!");
            }else if(userInput == 1){
                displayInventory(inventory);
            }

        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }



    }
}
