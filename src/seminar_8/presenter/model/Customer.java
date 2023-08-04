package seminar_8.presenter.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long id;
    private String name;
    private String address;
    private long card;
    private List<Order> orders;

    public Customer(String name, String address, long card) {
        this.name = name;
        this.address = address;
        this.card = card;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
