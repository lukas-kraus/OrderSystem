import java.util.List;

public class Main {



    public static void main(String[] args) {
        ProductRepo product1 = new ProductRepo(1, "Kombucha Original");
        ProductRepo product2 = new ProductRepo(2, "Kombucha Limette");
        ProductRepo product3 = new ProductRepo(3, "Bier Hell");
        ProductRepo product4 = new ProductRepo(4, "Bier Dunkel");

        ProductRepo.getAllProducts();
    }

}
