package seminar_8.view;

import seminar_8.presenter.model.Hall;
import seminar_8.presenter.model.Table;

import java.util.Date;

public class CustomerRequest {
    private Hall hall;
    private Table table;
    Date date;

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
