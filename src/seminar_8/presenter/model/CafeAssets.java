package seminar_8.presenter.model;

import java.util.List;

public class CafeAssets {
    private List<Hall> halls;
    private List<Table> tables;


    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
