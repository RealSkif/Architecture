package seminar_8.presenter;

import seminar_8.presenter.interfaces.IDraw;
import seminar_8.presenter.interfaces.IRepo;
import seminar_8.presenter.model.CafeAssets;
import seminar_8.presenter.model.Order;
import seminar_8.view.CustomerRequest;



public class Presenter {
    private Order order;
    private IDraw iDraw;
    private IRepo iRepo;

    public Presenter(IDraw iDraw, IRepo iRepo) {
        this.order = new Order();
        this.iDraw = iDraw;
        this.iRepo = iRepo;
    }

    public void customerRequest() {
        CafeAssets cafeAssets = iRepo.getData();
        iDraw.getCustomerInfo(cafeAssets);
    }

    public void placeOrder() {
        CustomerRequest customerRequest = iDraw.placeOrder();
        Order order = new Order();
        order.setHall(customerRequest.getHall());
        order.setTable(customerRequest.getTable());
        order.setDate(customerRequest.getDate());
        iRepo.doOrder(order);
    }
}
