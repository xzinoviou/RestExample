package dao;

import DummyData.ProductDummyData;
import model.Product;

import java.util.List;

/**
 * @author xzinoviou
 */
public class ProductDao {

    private ProductDummyData productDummyData;

    public ProductDao(){
        productDummyData = new ProductDummyData();
    }

    public Product getProductById(Integer id){

        for(Product product : productDummyData.getProducts())
        {
            if(product.getId()==id)
                return product;
        }
        return null;
    }

    public List<Product> getAllProducts(){

        return productDummyData.getProducts();
    }


}
