package models.payment;

import java.util.Date;

public class Payment {
    private String id;
    private double amount;
    private Date date;

    public Payment() {
        this.id = "Default";
        this.amount = 0;
        this.date = new Date();
    }

    public Payment(String id, double amount, Date date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
