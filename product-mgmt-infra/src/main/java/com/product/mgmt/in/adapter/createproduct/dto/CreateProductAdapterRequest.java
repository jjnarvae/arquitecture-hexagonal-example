package com.product.mgmt.in.adapter.createproduct.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CreateProductAdapterRequest {
    private String code;
    private String name;
}
