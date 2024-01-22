package com.product.mgmt.config;

import com.product.mgmt.ou.postgres.productrelation.ProductRelationAdapter;
import com.product.mgmt.ou.postgres.productrelation.repository.ProductRelationRepository;
import com.product.mgmt.usecase.ports.productrelation.ProductRelationPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortConfig {


    @Bean
    public ProductRelationPort productRelationPort(ProductRelationRepository productRelationRepository){
        return new ProductRelationAdapter(productRelationRepository);
    }
}
