import java.time.LocalDate;

public class ShipmentExpirableProducts extends Products implements Expriable, Shippable
{
    LocalDate ExpireDate;
    double weight;

    public ShipmentExpirableProducts(int quantity, String name, double price) {
        super(quantity, name, price);
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


}
