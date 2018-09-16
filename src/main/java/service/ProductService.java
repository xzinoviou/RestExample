package service;

import dao.ProductDao;
import model.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author xzinoviou
 */

@Path("/products")
public class ProductService {

    private ProductDao productDao;

    public ProductService(){
        super();
        productDao = new ProductDao();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductById(@PathParam("id") String id){
        return productDao.getProductById(Integer.parseInt(id));
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProducts(){
        return productDao.getAllProducts();
    }

}
