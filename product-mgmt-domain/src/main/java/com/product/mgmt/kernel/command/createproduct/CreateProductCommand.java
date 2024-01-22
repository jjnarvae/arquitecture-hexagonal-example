package com.product.mgmt.kernel.command.createproduct;

import com.product.mgmt.kernel.command.Command;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateProductCommand implements Command {
    private String name;
    private String code;
}
