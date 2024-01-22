package com.product.mgmt.in.handler.createproduct;
import com.product.mgmt.in.adapter.createproduct.dto.CreateProductAdapterRequest;
import com.product.mgmt.in.error.mapper.ErrorResponseMapper;
import com.product.mgmt.in.handler.ResponseBuilder;
import com.product.mgmt.in.handler.createproduct.mapper.CreateProductMapper;
import com.product.mgmt.in.handler.error.ErrorHandler;
import com.product.mgmt.in.util.GenericResponse;
import com.product.mgmt.kernel.command.createproduct.CreateProductCommand;
import com.product.mgmt.usecase.createproduct.CreateProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreateProductHandler {

    private final CreateProductUseCase useCase;
    public Mono<ResponseEntity<GenericResponse>> execute(CreateProductAdapterRequest request) {

        return Mono.just(
                useCase.execute(buildRequest(request))
                        .fold(
                                ErrorResponseMapper::useCaseErrorToResponse,
                                CreateProductMapper::informationToResponse
                        )
               ).map(genericResponse -> new ResponseBuilder().mapResponseBuilder( genericResponse))
                .switchIfEmpty(Mono.just(ResponseEntity.noContent().build()))
                .onErrorResume(ErrorHandler::handlerError);

    }

    private CreateProductCommand buildRequest(CreateProductAdapterRequest request) {
        return CreateProductMapper.requestToCommand(request);
    }
}
