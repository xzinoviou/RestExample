package DummyData;

import model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xzinoviou
 */
public class ProductDummyData {

    private List<Product> products;

    public ProductDummyData(){
        products = new ArrayList<Product>();
        fillProducts();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void fillProducts(){

        this.products.add(new Product(1,"MWIN10HE","Microsoft","Windows 10 Home Edition",199.99));
        this.products.add(new Product(2,"XI01","Xiaomi","Laptop Air 13",1200.99));
        this.products.add(new Product(3,"DSW31","Dell","SD28GB",289.50));
        this.products.add(new Product(4,"HPW89","Hewlett-Packard","Optical Mouse",13.99));
        this.products.add(new Product(5,"HW914","Huawei","Mobile 4",135.99));
    }

}
