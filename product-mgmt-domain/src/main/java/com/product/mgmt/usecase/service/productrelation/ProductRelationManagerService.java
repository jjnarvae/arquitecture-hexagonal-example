package com.product.mgmt.usecase.service.productrelation;

import com.product.mgmt.kernel.command.createproduct.CreateProductCommand;
import com.product.mgmt.kernel.domain.productrelation.ProductRelationDto;
import com.product.mgmt.usecase.ports.productrelation.ProductRelationPort;
import com.product.mgmt.usecase.ports.productrelation.mapper.ProductRelationPortMapper;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor

public class ProductRelationManagerService {

    private final ProductRelationPort productRelationPort;

    public Mono<ProductRelationDto> create(CreateProductCommand command){
       return productRelationPort.create(
               ProductRelationPortMapper.createProductCommandToDto(command)
       );
    }
}
