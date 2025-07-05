import java.time.LocalDate;
import java.util.Date;

public abstract class ExpirableProducts extends Products implements Expriable{
    LocalDate expired_date;
    public ExpirableProducts(int quantity, String name, double price, LocalDate expired_date) {
        super(quantity, name, price);
        this.expired_date = expired_date;
    }
    public boolean isExpired(LocalDate date)
    {
        return date.isBefore(this.expired_date);
    }

    public void setExpired_date(LocalDate expired_date) {
        this.expired_date = expired_date;
    }

    public LocalDate getExpired_date() {
        return expired_date;
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
