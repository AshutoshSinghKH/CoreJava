import java.util.*;

class ProductOutOfStockException extends Exception {
    public ProductOutOfStockException(String message) {
        super(message);
    }
}

class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}


class Product {
    String productId;
    String name;
    double price;
    String category;
    int stockQuantity;

    // Constructor Chaining hai
    Product(String productId, String name, double price) {
        this(productId, name, price, "General", 0);
    }

    Product(String productId, String name, double price, String category, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
    }

    void addToCart() {
        System.out.println("Product added to cart: " + name);
    }

    void checkout() throws ProductOutOfStockException {
        if (stockQuantity <= 0) {
            throw new ProductOutOfStockException("Product " + name + " is out of stock.");
        }
        System.out.println("Product checked out: " + name);
        stockQuantity--;
    }
}


class Electronics extends Product {
    Electronics(String productId, String name, double price, int stockQuantity) {
        super(productId, name, price, "Electronics", stockQuantity);
    }

    @Override
    void addToCart() {
        System.out.println("Electronics product added to cart: " + name);
    }
}

class Clothing extends Product {
    Clothing(String productId, String name, double price, int stockQuantity) {
        super(productId, name, price, "Clothing", stockQuantity);
    }

    @Override
    void addToCart() {
        System.out.println("Clothing product added to cart: " + name);
    }
}

class Grocery extends Product {
    Grocery(String productId, String name, double price, int stockQuantity) {
        super(productId, name, price, "Grocery", stockQuantity);
    }

    @Override
    void addToCart() {
        System.out.println("Grocery product added to cart: " + name);
    }
}


class User {
    String userId;
    String name;
    List<Product> orderHistory = new ArrayList<>();
    List<Product> shoppingCart = new ArrayList<>();

    User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void addToCart(Product product) {
        shoppingCart.add(product);
        product.addToCart();
    }

    void checkout() throws ProductOutOfStockException, InvalidOrderException {
        if (shoppingCart.isEmpty()) {
            throw new InvalidOrderException("No products in the cart to checkout.");
        }
        for (Product product : shoppingCart) {
            product.checkout();
            orderHistory.add(product);
        }
        shoppingCart.clear();
        System.out.println("Checkout completed for user: " + name);
    }
}

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E1", "Laptop", 999.99, 10));
        products.add(new Clothing("C1", "T-Shirt", 19.99, 50));
        products.add(new Grocery("G1", "Apple", 0.99, 100));

        Map<User, List<Product>> shoppingCarts = new HashMap<>();

        User user1 = new User("U1", "John Doe");
        user1.addToCart(products.get(0));
        user1.addToCart(products.get(1));

        shoppingCarts.put(user1, user1.shoppingCart);

        try {
            user1.checkout();
        } catch (ProductOutOfStockException | InvalidOrderException e) {
            System.out.println(e.getMessage());
        }

        
        System.out.println("Order History for " + user1.name + ":");
        for (Product product : user1.orderHistory) {
            System.out.println(product.name);
        }
    }
}