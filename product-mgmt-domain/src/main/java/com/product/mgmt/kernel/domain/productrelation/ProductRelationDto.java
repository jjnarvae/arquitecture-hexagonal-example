package com.product.mgmt.kernel.domain.productrelation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Getter
@Setter
public class ProductRelationDto implements Serializable {

    private long id;
    private String code;
    private String name;
}
