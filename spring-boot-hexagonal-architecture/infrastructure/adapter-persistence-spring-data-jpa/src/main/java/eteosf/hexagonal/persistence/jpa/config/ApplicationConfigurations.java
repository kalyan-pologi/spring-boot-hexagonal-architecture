package eteosf.hexagonal.persistence.jpa.config;

//import eteosf.hexagonal.application.service.adapter.ProductServiceAdapter;
//import eteosf.hexagonal.application.service.api.ProductService;
import eteosf.hexagonal.domain.spi.ProductPersistencePort;
import eteosf.hexagonal.persistence.jpa.adapter.ProductSpringJpaAdapter;
import eteosf.hexagonal.persistence.jpa.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigurations {

    @Bean
    public ProductPersistencePort getProductRepo(ProductRepository ProductRepository) {
        return new ProductSpringJpaAdapter(ProductRepository);
    }
}
