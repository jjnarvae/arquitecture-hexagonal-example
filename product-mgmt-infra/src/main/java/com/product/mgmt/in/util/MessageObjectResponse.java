package com.product.mgmt.in.util;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MessageObjectResponse {
    private String responseCode;
    private String responseMessage;
    private String responseDetails;

}