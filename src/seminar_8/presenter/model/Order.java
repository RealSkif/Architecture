package seminar_8.presenter.model;

import java.util.Date;

public class Order {
    private long id;
    private Customer customer;
    private Hall hall;
    private Table table;
    private Date date;

    public Order() {
    }

    public Order(Customer customer, Hall hall, Table table, Date date) {
        this.customer = customer;
        this.hall = hall;
        this.table = table;
        this.date = date;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
