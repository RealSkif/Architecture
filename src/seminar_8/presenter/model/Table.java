package seminar_8.presenter.model;

public class Table {
    private int id;
    private Hall hall;
    private Waiter waiter;
    private int seats;

    public Table(Hall hall, Waiter waiter, int seats) {
        this.hall = hall;
        this.waiter = waiter;
        this.seats = seats;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Столик: " +
                "номер = " + id +
                ", номер зала = " + hall +
                ", количество мест = " + seats;
    }
}
