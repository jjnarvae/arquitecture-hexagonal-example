package com.product.mgmt.kernel.exception.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.io.Serializable;

@Builder
@Getter
@AllArgsConstructor
public class UseCaseErrorResponseError implements Serializable {

    private String code;
    private String detail;
}
