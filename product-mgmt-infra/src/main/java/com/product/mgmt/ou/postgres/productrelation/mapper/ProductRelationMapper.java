package com.product.mgmt.ou.postgres.productrelation.mapper;

import com.product.mgmt.kernel.domain.productrelation.ProductRelationDto;
import com.product.mgmt.ou.postgres.productrelation.entity.ProductRelationEntity;



public class ProductRelationMapper {


    public static ProductRelationEntity dtoToEntity(ProductRelationDto dto) {
        return ProductRelationEntity
                .builder()
                .code(dto.getCode())
                .name(dto.getName())
                .build();
    }


    public static ProductRelationDto entityToDto(ProductRelationEntity entity) {
        return ProductRelationDto
                .builder()
                .id(entity.getId())
                .code(entity.getCode())
                .name(entity.getName())
                .build();

    }


}
