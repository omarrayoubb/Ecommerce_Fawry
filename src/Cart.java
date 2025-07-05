import java.sql.Array;
import java.util.*;
public class Cart {
    List<CartProducts> Products;

    public Cart() {
        Products = new ArrayList<CartProducts>();
    }

    boolean AddToCart(Products product, int Quantity) {
        try {
            product.checkProduct();
            product.ReduceQuantity(Quantity);
            CartProducts cartItem = new CartProducts(product, Quantity);
            Products.add(cartItem);
            return true;
        } catch (Error e) {
            System.out.println(e);
            return false;
        }
    }

    public void RemoveFromCart(Products Product)
    {
        for (CartProducts c: Products)
        {
            if (c.getName().equalsIgnoreCase(Product.getName()))
            {
                Products.remove(c);
            }
        }
    }
    public double getCartPrice()
    {
        double CartPrice = 0.0;
        for (CartProducts c: Products)
        {
            CartPrice += c.getPrice();
        }
        return CartPrice;
    }
    public boolean isEmpty()
    {
        return Products.isEmpty();
    }
    public void PrintAllCart()
    {
        for (CartProducts p: Products)
        {
            p.PrintCartItems();
        }
    }

}

