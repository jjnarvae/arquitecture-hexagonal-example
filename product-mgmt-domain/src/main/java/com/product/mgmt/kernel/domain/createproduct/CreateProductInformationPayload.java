package com.product.mgmt.kernel.domain.createproduct;

import com.product.mgmt.kernel.domain.util.InformationPayload;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductInformationPayload implements InformationPayload {

    private long id;
    private String code;
    private String name;
}
