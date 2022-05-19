import java.util.List;

public class User {

    private int id; // mai mare egal cu 1
    private String username;// min 5 6
    private String name; //minim 10
    private List<Order> orderHistory;
    private Cart shoppingCart;

    public User(int id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }

    //implementam pt order si pt cart
    // addOrderToHistory(Order order)
    //addProductToCart(Product product)
}
