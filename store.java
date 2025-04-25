import java.util.ArrayList;

public class store {

    public static void displayProducts(ArrayList<Product> products){
        for(Product product : products){
            System.out.println(product.toString());
        }
    }

    public void cart(){


        System.out.println("""
                1 - Check Out
                2 - Remove Product from the cart
                0 - Go back to the home screen
                """);
    }
    public static void main(String[] args) {

        Product p = new Product("a11", "nail", 8.50, "hardware");
        System.out.println(p);
        System.out.println("Welcome to the store\nHow can we assist you today?");
        System.out.println("1.  ");

    }
}
