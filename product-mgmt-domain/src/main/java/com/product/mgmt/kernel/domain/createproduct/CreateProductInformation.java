package com.product.mgmt.kernel.domain.createproduct;


import com.product.mgmt.kernel.domain.util.AbstractInformationResponse;
import com.product.mgmt.kernel.domain.util.MessageObjectInformationResponse;
import lombok.Builder;

public class CreateProductInformation extends AbstractInformationResponse<CreateProductInformationPayload> {


    public CreateProductInformation(MessageObjectInformationResponse messageResponse, CreateProductInformationPayload data) {
        super(messageResponse, data);
    }
    public CreateProductInformation instantiate(){
        return this;
    }

}
