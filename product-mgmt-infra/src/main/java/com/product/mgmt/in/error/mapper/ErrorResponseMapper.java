package com.product.mgmt.in.error.mapper;


import com.product.mgmt.in.error.ErrorResponse;
import com.product.mgmt.in.error.ErrorResponseError;
import com.product.mgmt.in.util.MessageObjectResponse;
import com.product.mgmt.kernel.exception.error.UseCaseErrorResponse;
import lombok.experimental.UtilityClass;

import java.util.stream.Collectors;

@UtilityClass
public class ErrorResponseMapper {


    public static ErrorResponse useCaseErrorToResponse(UseCaseErrorResponse error) {
        return ErrorResponse
                .builder()
                .messageResponse(
                        MessageObjectResponse
                                .builder()
                                .responseCode(error.getMessageResponse().getResponseCode())
                                .responseMessage(error.getMessageResponse().getResponseMessage())
                                .responseDetails(error.getMessageResponse().getResponseDetail())
                                .build()
                )
                .errors(
                        error.getErrors()
                                .stream()
                                .map(object ->
                                        ErrorResponseError
                                                .builder()
                                                .errorCode(object.getCode())
                                                .errorDetail(object.getDetail())
                                                .build()
                                )
                                .collect(Collectors.toList())

                )
                .build();

    }

}
