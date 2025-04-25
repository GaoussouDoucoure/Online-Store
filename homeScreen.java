import java.util.ArrayList;

public class HomeScreen {

    public static void main(String[] args) {
        System.out.println("Welcome to the store\nHow can we assist you today?");
        System.out.println("1. ");
    }



    public static void displayProducts(ArrayList<Product> products){
       for(Product product : products){
           System.out.println(product.toString());
       }
    }
}
