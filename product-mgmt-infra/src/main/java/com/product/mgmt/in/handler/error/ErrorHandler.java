package com.product.mgmt.in.handler.error;


import com.product.mgmt.in.error.ErrorResponse;
import com.product.mgmt.in.error.ErrorResponseError;
import com.product.mgmt.in.util.GenericResponse;
import com.product.mgmt.in.util.MessageObjectResponse;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@NoArgsConstructor
public class ErrorHandler {

    public static Mono<ResponseEntity<GenericResponse>> handlerError(final Throwable error) {
        return Mono.just(ResponseEntity.status(INTERNAL_SERVER_ERROR).body(unExpectedError()));
    }

    private static ErrorResponse unExpectedError() {
        return
                ErrorResponse
                        .builder()
                        .messageResponse(
                                MessageObjectResponse
                                        .builder()
                                        .responseCode(String.valueOf(INTERNAL_SERVER_ERROR.value()))
                                        .responseMessage(INTERNAL_SERVER_ERROR.name())
                                        .responseDetails(INTERNAL_SERVER_ERROR.getReasonPhrase())
                                        .build()
                        )
                        .errors(

                                getNullError(INTERNAL_SERVER_ERROR.name(), "Unknown Error")
                        )
                        .build();
    }

    private static List<ErrorResponseError> getNullError(String code, String detail) {
        List<ErrorResponseError> responseErrorsList = new ArrayList<>();
        responseErrorsList.add(ErrorResponseError
                .builder()
                .errorCode(code)
                .errorDetail(detail)
                .build());
        return responseErrorsList;
    }

}
