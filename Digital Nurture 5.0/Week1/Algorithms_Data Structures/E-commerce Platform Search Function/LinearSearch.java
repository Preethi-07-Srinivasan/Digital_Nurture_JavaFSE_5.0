public class LinearSearch {

    public static Product linearSearch(Product[] products, int key) {
        for (Product p : products) {
            if (p.productId == key) {
                return p;
            }
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

        Product result = linearSearch(products, 5);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");
    }
}