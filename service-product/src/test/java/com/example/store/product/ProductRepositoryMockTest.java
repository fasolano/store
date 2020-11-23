package com.example.store.product;

import com.example.store.product.entity.Category;
import com.example.store.product.entity.Product;
import com.example.store.product.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_thenReturnListProduct(){
        Product product01 = Product.builder()
                .name("Computer")
                .category(Category.builder().id(1L).build())
                .description("Descripcion")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1235.99"))
                .status("Created")
                .createAt(new Date()).build();

        productRepository.save(product01);

        List<Product> founds = productRepository.findByCategory(product01.getCategory());

        Assertions.assertThat(founds.size()).isEqualTo(3);
    }

}
