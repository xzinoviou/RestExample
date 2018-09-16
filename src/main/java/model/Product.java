package model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author xzinoviou
 */
@XmlRootElement
public class Product {

    private Integer id;
    private String key;
    private String brand;
    private String name;
    private Double price;

    public Product(){}

    public Product(Integer id, String key, String brand, String name, Double price) {
        this.id = id;
        this.key = key;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
