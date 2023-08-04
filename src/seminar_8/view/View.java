package seminar_8.view;

import seminar_8.presenter.model.CafeAssets;
import seminar_8.presenter.interfaces.IDraw;

import java.util.Date;

public class View implements IDraw {
    private CustomerRequest request;

    public View() {
        this.request = new CustomerRequest();
    }

    @Override
    public void getCustomerInfo(CafeAssets cafeAssets) {
        System.out.println("Выберите зал из списка: ");
        cafeAssets.getHalls().forEach(System.out::println);
        int random = (int) (Math.random() * cafeAssets.getHalls().size());
        request.setHall(cafeAssets.getHalls().get(random));
        System.out.println("Выберите столик из списка: ");
        cafeAssets.getTables().forEach(System.out::println);
        request.setTable(cafeAssets.getTables().get(random));
    }

    @Override
    public CustomerRequest placeOrder() {
        request.setDate(new Date());
        return request;
    }

}
