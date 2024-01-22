package com.product.mgmt.kernel.domain.util;


import lombok.AllArgsConstructor;
import lombok.Builder;
import java.io.Serializable;

@Builder
@AllArgsConstructor
public class MessageObjectInformationResponse implements Serializable {

    private String responseCode;
    private String responseMessage;
    private String responseDetail;

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public String getResponseDetail() {
        return responseDetail;
    }
}
