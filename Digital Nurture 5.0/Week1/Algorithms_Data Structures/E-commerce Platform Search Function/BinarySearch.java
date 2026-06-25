import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static Product binarySearch(Product[] products, int key) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == key)
                return products[mid];
            else if (products[mid].productId < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Shoes", "Fashion"),
            new Product(5, "Phone", "Electronics"),
            new Product(2, "Watch", "Accessories"),
            new Product(4, "Bag", "Fashion")
        };

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product result = binarySearch(products, 5);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");
    }
}