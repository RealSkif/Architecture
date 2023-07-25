package seminar_5;

import java.util.ArrayList;
import java.util.List;

/*
 * Класс DTO, в которой описывает продукт, который будет показан пользователю
 * Он может в той или иной мере отличаться от класса Product.
 * Например, для смартфона польователю не нужно знать id из базы данных, EMEI,
 * или еще какую-либо тезничскую информацию
 * */
public class ProductDTO {
    /*
     * Различные поля класса DTO
     * */
    private final ProductService productService;

    public ProductDTO(ProductService productService) {
        this.productService = productService;
    }

    public List<ProductDTO> findAll() {
        /*
         * логика трасформации класса Product в ProductDTO
         * */
        productService.findAll();
        List<ProductDTO> list = new ArrayList<>();
        return list;
    }

    public List<ProductDTO> findBySomeProperties(int value1, String value2) {
        /*
         * логика трасформации класса Product в ProductDTO
         * */
        productService.findAll();
        List<ProductDTO> list = new ArrayList<>();
        return list;

    }
}
