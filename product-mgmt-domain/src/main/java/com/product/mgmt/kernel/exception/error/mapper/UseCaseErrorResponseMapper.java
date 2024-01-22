package com.product.mgmt.kernel.exception.error.mapper;

import com.product.mgmt.kernel.exception.error.UseCaseErrorResponse;
import com.product.mgmt.kernel.exception.error.UseCaseErrorResponseError;

public class UseCaseErrorResponseMapper {

    public static UseCaseErrorResponse buildErrorResponse( Integer statusCode, String statusDesc, String code, String detail) {
        return new UseCaseErrorResponse(
                statusCode,
                statusDesc,
                UseCaseErrorResponseError
                        .builder()
                        .code(code)
                        .detail(detail)
                        .build()
        );
    }
}
