package seminar_8.presenter.interfaces;

import seminar_8.presenter.model.*;

public interface IRepo {
    CafeAssets getData();

    void doOrder(Order order);
}
