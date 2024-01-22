package com.product.mgmt.config;

import com.product.mgmt.usecase.ports.productrelation.ProductRelationPort;
import com.product.mgmt.usecase.service.productrelation.ProductRelationManagerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ProductRelationManagerService getProductRelationManagerService(final ProductRelationPort productRelationPort){
        return new ProductRelationManagerService(productRelationPort);
    }
}
