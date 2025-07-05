public class Customer {
    String name;
    double balance;
    Cart userCart;

    public Customer(String name, double balance, Cart userCart) {
        this.name = name;
        this.balance = balance;
        this.userCart = userCart;
    }
    public void AddToUserCart(Products p, int quantity)
    {
        this.userCart.AddToCart(p, quantity);
    }
    public void CheckOut()
    {
        double price = userCart.getCartPrice();
        if (price > balance)
        {
            throw new Error("Balance is not Sufficient");
        }
        else if (userCart.isEmpty()) {
            throw new Error("Cart is Empty");
        }

        System.out.println("**   CheckOut  **");
        userCart.PrintAllCart();
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        System.out.println("Subtotal " + userCart.getCartPrice());
        System.out.println("Shipping Fees " + 30);
        System.out.println("Total " + userCart.getCartPrice() + 30.0);
    }

}
