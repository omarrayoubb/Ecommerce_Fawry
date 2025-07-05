public class ShipmentProducts extends Products implements Shippable{
    private double weight;
    public ShipmentProducts(int quantity, String name, double price, double weight) {
        super(quantity, name, price);
        if (weight < 0) {
            throw new Error("Weight must be >= 0");
        }

        this.weight = weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            throw new Error("Weight must be >= 0");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isShipable(Products product) {
        if (product instanceof ShipmentProducts) return true;
        else return false;
    }

}
