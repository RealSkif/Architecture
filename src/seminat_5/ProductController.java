package seminat_5;
/*
* Класс, обрабатывающий запросы пользователя
* */
public class ProductController {
    private final ProductDTO productDTO;

    public ProductController(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }
    /*
     * методы принимают запрос от пользователя, по цепочке передают его в бд,
     * получают ответ и показывают его пользователю в ProductTemplate
     * */
    public ProductTemplate processRequest(){
        productDTO.findAll();
        return new ProductTemplate();
    }
    public ProductTemplate processRequest(int value1, String value2){
        productDTO.findBySomeProperties(value1, value2);
        return new ProductTemplate();
    }
}
