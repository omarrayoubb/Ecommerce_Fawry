import java.time.LocalDate;

public class ShipmentExpirableProducts extends Products implements Expriable, Shippable
{
    LocalDate ExpireDate;
    double weight;

    public ShipmentExpirableProducts(int quantity, String name, double price, LocalDate expireDate, double weight) {
        super(quantity, name, price);
        this.ExpireDate = expireDate;
        this.weight = weight;
    }

    @Override
    public boolean isExpired(LocalDate date) {
        return date.isAfter(ExpireDate);
    }

    @Override
    public boolean isShipable(Products product) {
        if (product instanceof ShipmentExpirableProducts) return true;
        else return false;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public boolean checkProduct()
    {
        if (this.getQuantity() == 0) throw new Error("Out Of Stock");
        else if (!this.isExpired(LocalDate.now()))
        {
            throw new Error("Expired Product");
        }
        return true;
    }


}
