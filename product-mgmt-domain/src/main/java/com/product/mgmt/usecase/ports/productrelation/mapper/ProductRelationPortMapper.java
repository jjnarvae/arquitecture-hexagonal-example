package com.product.mgmt.usecase.ports.productrelation.mapper;

import com.product.mgmt.kernel.command.createproduct.CreateProductCommand;
import com.product.mgmt.kernel.domain.productrelation.ProductRelationDto;


public interface ProductRelationPortMapper {


     static ProductRelationDto createProductCommandToDto (CreateProductCommand command){

        return ProductRelationDto
                .builder()
                .code(command.getCode())
                .name(command.getName())
                .build();


    }

}
