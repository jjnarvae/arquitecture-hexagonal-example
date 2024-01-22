package com.product.mgmt.in.error;

import com.product.mgmt.in.util.GenericResponse;
import com.product.mgmt.in.util.MessageObjectResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse implements GenericResponse, Serializable {
    private MessageObjectResponse messageResponse;
    private List<ErrorResponseError> errors;
}
