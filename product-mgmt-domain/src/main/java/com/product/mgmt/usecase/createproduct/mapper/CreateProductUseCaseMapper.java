package com.product.mgmt.usecase.createproduct.mapper;

import com.product.mgmt.kernel.command.createproduct.CreateProductCommand;
import com.product.mgmt.kernel.domain.createproduct.CreateProductInformation;
import com.product.mgmt.kernel.domain.createproduct.CreateProductInformationPayload;
import com.product.mgmt.kernel.domain.productrelation.ProductRelationDto;
import com.product.mgmt.kernel.domain.util.MessageObjectInformationResponse;

public class CreateProductUseCaseMapper {

    public static CreateProductInformation buildSuccessResponse(ProductRelationDto dto){

        return new CreateProductInformation(
                   MessageObjectInformationResponse.builder()
                           .responseCode("")
                           .responseDetail("")
                           .responseMessage("")
                           .build(),
                    CreateProductInformationPayload.builder()
                            .id(dto.getId())
                            .code(dto.getCode())
                            .name(dto.getName())
                            .build()


        );
    }
}
