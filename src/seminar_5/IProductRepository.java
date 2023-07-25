package seminar_5;

import java.util.List;

/*
 * Интерфейс для подключения бд
 * */
public interface IProductRepository {
    /*
     * методы поиска продукта в бд
     * */
    List<Product> findAll();

    List<Product> findBySomeProperties(int value1, String value2);
}
