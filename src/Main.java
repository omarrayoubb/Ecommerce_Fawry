import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        ShipmentExpirableProducts cheese = new ShipmentExpirableProducts(10, "Cheese", -15.0, LocalDate.now(), 30);
        Cart c = new Cart();
        c.AddToCart(cheese, 2);

    }
}