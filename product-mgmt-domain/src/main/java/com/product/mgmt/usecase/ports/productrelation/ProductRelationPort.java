package com.product.mgmt.usecase.ports.productrelation;

import com.product.mgmt.kernel.domain.productrelation.ProductRelationDto;
import reactor.core.publisher.Mono;

public interface ProductRelationPort {
    Mono<ProductRelationDto> create(ProductRelationDto dto);

}
