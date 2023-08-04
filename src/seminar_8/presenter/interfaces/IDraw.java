package seminar_8.presenter.interfaces;

import seminar_8.presenter.model.CafeAssets;
import seminar_8.view.CustomerRequest;


public interface IDraw {
    void getCustomerInfo(CafeAssets cafeAssets);

    CustomerRequest placeOrder();
}
