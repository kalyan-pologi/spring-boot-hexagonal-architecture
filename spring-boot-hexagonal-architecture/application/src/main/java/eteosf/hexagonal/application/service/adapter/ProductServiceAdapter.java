package eteosf.hexagonal.application.service.adapter;

import eteosf.hexagonal.application.service.api.ProductService;
import eteosf.hexagonal.domain.model.Product;
import eteosf.hexagonal.domain.spi.ProductPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceAdapter implements ProductService {
    @Autowired
    private ProductPersistencePort productPersistencePort;

    @Autowired
    public ProductServiceAdapter(ProductPersistencePort productPersistencePort) {
        this.productPersistencePort = productPersistencePort;
    }

    public void addProduct(Product product) {
        productPersistencePort.addProduct(product);
    }

    public void removeProduct(Product product) {
        productPersistencePort.removeProduct(product);
    }

    public List<Product> getProducts() {
        return productPersistencePort.getProducts();
    }

    public Product getProductById(Integer productId) {
        return productPersistencePort.getProductById(productId);
    }
}