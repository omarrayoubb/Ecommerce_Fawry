public class CartProducts {
    Products Product;
    int Quantity;

    public CartProducts(Products product, int quantity) {
        Product = product;
        Quantity = quantity;
    }
    public double getPrice()
    {
        return this.Product.getPrice();
    }
    public double getQuantity()
    {
        return this.Quantity;
    }

    public String getName()
    {
        return Product.getName();
    }
    public double subTotal()
    {
        return this.Quantity * getPrice();
    }


}
