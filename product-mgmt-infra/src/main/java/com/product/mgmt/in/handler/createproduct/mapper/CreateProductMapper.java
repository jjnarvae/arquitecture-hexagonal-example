package com.product.mgmt.in.handler.createproduct.mapper;
import com.product.mgmt.in.adapter.createproduct.dto.CreateProductAdapterRequest;
import com.product.mgmt.in.adapter.createproduct.dto.CreateProductAdapterResponse;
import com.product.mgmt.kernel.command.createproduct.CreateProductCommand;
import com.product.mgmt.kernel.domain.createproduct.CreateProductInformation;



public class CreateProductMapper {


   public static CreateProductCommand requestToCommand(CreateProductAdapterRequest createProductAdapterRequest){

      return  CreateProductCommand.builder()
                .name(createProductAdapterRequest.getName())
                .code(createProductAdapterRequest.getCode()).build();
   }
  public static  CreateProductAdapterResponse informationToResponse (CreateProductInformation createProductInformation){

      return CreateProductAdapterResponse.builder()
                .id(createProductInformation.getData().getId())
                .code(createProductInformation.getData().getCode())
                .name(createProductInformation.getData().getName())
                .build();
    }


}
