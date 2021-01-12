package devices;

import com.company.Human;

import java.util.Date;

public class TransactionsList {
    public Human seller;
    public Human buyer;
    public double price;
    public Date date;

    public TransactionsList (Human seller, Human buyer, Double price)
    {
        Date nowDate = new Date();
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.date = nowDate;
    }
}
