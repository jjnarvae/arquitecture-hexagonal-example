package com.product.mgmt.ou.postgres.productrelation;

import com.product.mgmt.kernel.domain.productrelation.ProductRelationDto;
import com.product.mgmt.ou.postgres.productrelation.mapper.ProductRelationMapper;
import com.product.mgmt.ou.postgres.productrelation.repository.ProductRelationRepository;
import com.product.mgmt.usecase.ports.productrelation.ProductRelationPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
public class ProductRelationAdapter implements ProductRelationPort {

    private final ProductRelationRepository productRelationRepository;
    @Override
    public Mono<ProductRelationDto> create(ProductRelationDto dto) {

        return Mono.fromCallable(() -> productRelationRepository.save(ProductRelationMapper.dtoToEntity(dto)))
                .map(ProductRelationMapper::entityToDto)
                .doOnSuccess(m -> log.info("Success create product, code: {}", dto.getCode()))
                .doOnError(e -> log.error("Error create product, uuid: {}, details: {}", dto.getName(), e.getMessage()))
                .onErrorResume(error -> Mono.error(new RuntimeException(error.getMessage())));
    }
}
