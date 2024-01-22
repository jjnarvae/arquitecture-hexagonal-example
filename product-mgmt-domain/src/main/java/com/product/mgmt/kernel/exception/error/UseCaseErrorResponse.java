package com.product.mgmt.kernel.exception.error;

import com.product.mgmt.kernel.domain.util.MessageObjectInformationResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Builder
@AllArgsConstructor
@Getter
public class UseCaseErrorResponse extends Exception {


    private MessageObjectInformationResponse messageResponse;
    private Integer statusCode;
    private String statusDesc;
    private List<UseCaseErrorResponseError> errors;


    public UseCaseErrorResponse(Integer statusCode, String statusDesc, UseCaseErrorResponseError error) {

        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        errors = getErrors();
        errors.add(error);

    }


    public List<UseCaseErrorResponseError> getErrors() {
        if (this.errors == null)
            return new ArrayList<UseCaseErrorResponseError>();
        return errors;
    }
}
