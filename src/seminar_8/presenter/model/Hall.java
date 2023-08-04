package seminar_8.presenter.model;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private short id;
    private List<Table> tables;
    private List<Waiter> waiters;
    private boolean vip;

    public Hall(boolean vip) {
        this.tables = new ArrayList<>();
        this.waiters = new ArrayList<>();
        this.vip = vip;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Waiter> getWaiters() {
        return waiters;
    }

    public void setWaiters(List<Waiter> waiters) {
        this.waiters = waiters;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Зал: " +
                "номер зала = " + id +
                ", vip = " + vip;
    }
}
