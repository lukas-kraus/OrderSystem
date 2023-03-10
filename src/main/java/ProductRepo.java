import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private int id;
    private String name;
    private static List<ProductRepo> products = new ArrayList<>();


    public ProductRepo() {
    }

    public ProductRepo(int id, String name) {
        this.id = id;
        this.name = name;
        products.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<ProductRepo> getProducts() {
        return products;
    }

    public static void getAllProducts() {
        List<ProductRepo> allProducts = ProductRepo.getProducts();
        for (ProductRepo product : allProducts) {
            System.out.println(product);
        }
    }

    public static void setProducts(List<ProductRepo> products) {
        ProductRepo.products = products;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
