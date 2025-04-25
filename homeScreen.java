import java.util.ArrayList;

public class HomeScreen {





    public static void displayProducts(ArrayList<Product> products){
       for(Product product : products){
           System.out.println(product.toString());
       }
    }
}
