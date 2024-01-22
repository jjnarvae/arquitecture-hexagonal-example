package com.product.mgmt.kernel.domain.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class AbstractInformationResponse<T extends InformationPayload> implements Serializable {
    private MessageObjectInformationResponse messageResponse;
    private T data;
}

