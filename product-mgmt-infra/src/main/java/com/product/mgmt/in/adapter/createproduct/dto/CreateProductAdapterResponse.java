package com.product.mgmt.in.adapter.createproduct.dto;

import com.product.mgmt.in.util.GenericResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class CreateProductAdapterResponse implements GenericResponse, Serializable {

    private long id;
    private String code;
    private String name;
}
