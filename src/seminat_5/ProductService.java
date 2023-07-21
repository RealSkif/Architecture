package seminat_5;

import java.util.List;

public class ProductService {

    private final IProductRepository iProductRepository;

    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    /*
     * методы поиска продукта в бд. После получения результата можно добавить какую-либо логику
     * обработки этих данных, например, сортировку
     * */
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    public List<Product> findBySomeProperties(int value1, String value2) {
        return iProductRepository.findBySomeProperties(value1, value2);
    }
}
