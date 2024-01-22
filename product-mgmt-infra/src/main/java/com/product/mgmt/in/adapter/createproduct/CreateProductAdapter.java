package com.product.mgmt.in.adapter.createproduct;

import com.product.mgmt.in.adapter.createproduct.dto.CreateProductAdapterRequest;
import com.product.mgmt.in.handler.createproduct.CreateProductHandler;
import com.product.mgmt.in.util.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/product")
@Validated
@RequiredArgsConstructor

public class CreateProductAdapter {

    private final CreateProductHandler handler;


    @PostMapping
    public Mono<ResponseEntity<GenericResponse>> createProduct(@Valid @RequestBody CreateProductAdapterRequest request){
        return handler.execute(request);
    }



}
