package com.product.mgmt.config;

import com.product.mgmt.in.handler.createproduct.CreateProductHandler;
import com.product.mgmt.usecase.createproduct.CreateProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfig {

    @Bean
    public CreateProductHandler createProductHandler(final CreateProductUseCase useCase) {
        return new CreateProductHandler(useCase);
    }
}
