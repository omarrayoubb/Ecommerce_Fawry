import java.time.LocalDate;

public abstract class Products {
    private int quantity;
    private String name;
    private double price;

    public Products(int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new Error("quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    public void setName(String name) {
        if (name.isEmpty())
        {
            throw new Error("Empty Name");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new Error("Price must be >= 0");
        }
        this.price = price;
    }

    public void ReduceQuantity(int Quantity) {
        if (this.quantity == 0)
        {
            throw new Error("Out of Stock");
        }
        else if (Quantity > this.quantity)
        {
            throw new Error("you requested Quantity is > Product Quantity");
        }
        setQuantity(this.quantity - Quantity);
    }
    public boolean checkProduct()
    {
        if (this.getQuantity() == 0) throw new Error("Out Of Stock");
        return true;
    }
}
