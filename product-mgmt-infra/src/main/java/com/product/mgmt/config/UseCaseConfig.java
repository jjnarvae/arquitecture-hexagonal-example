package com.product.mgmt.config;

import com.product.mgmt.usecase.createproduct.CreateProductUseCase;
import com.product.mgmt.usecase.service.productrelation.ProductRelationManagerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateProductUseCase getCreateProductUseCase(final ProductRelationManagerService productRelationManagerService) {
        return new CreateProductUseCase(productRelationManagerService);
    }
}
