package models.payment;

import java.util.Date;

public class Payment {
    private String id;
    private double amount;
    private Date date;
    private String paymentMethod;
    private String personId;

    public Payment() {
        this.id = "Default";
        this.amount = 0;
        this.date = new Date();
        this.paymentMethod = "Default";
        this.personId = "Default";
    }

    public Payment(String id, double amount, Date date, String paymentMethod, String personId) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.personId = personId;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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
