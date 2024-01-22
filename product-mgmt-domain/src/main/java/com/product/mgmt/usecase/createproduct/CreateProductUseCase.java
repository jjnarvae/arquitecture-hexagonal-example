package com.product.mgmt.usecase.createproduct;

import com.product.mgmt.kernel.command.createproduct.CreateProductCommand;
import com.product.mgmt.kernel.domain.createproduct.CreateProductInformation;
import com.product.mgmt.kernel.domain.util.GenericResponseCodes;
import com.product.mgmt.kernel.exception.error.UseCaseErrorResponse;
import com.product.mgmt.kernel.exception.error.mapper.UseCaseErrorResponseMapper;
import com.product.mgmt.usecase.UseCase;
import com.product.mgmt.usecase.createproduct.mapper.CreateProductUseCaseMapper;
import com.product.mgmt.usecase.service.productrelation.ProductRelationManagerService;
import io.vavr.control.Try;
import lombok.AllArgsConstructor;
import io.vavr.control.Either;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Mono;


@AllArgsConstructor
public class CreateProductUseCase implements UseCase<CreateProductCommand, Either<UseCaseErrorResponse, CreateProductInformation>> {

    private final ProductRelationManagerService productRelationManagerService;

    @Override
    public Either<UseCaseErrorResponse, CreateProductInformation> execute(CreateProductCommand command) {
        return createUser(command);
    }
    private Either<UseCaseErrorResponse,CreateProductInformation> createUser(CreateProductCommand command) {
        Either<Throwable, CreateProductInformation> response =
                Try.of(() -> productRelationManagerService.create(command)
                    .doOnSuccess(m -> System.out.println("Success create product, name: " + command.getName()))
                    .doOnError(e -> System.err.println("Error create product, name: " + command.getCode()+ " Details:" + e.getMessage()))
                    .onErrorResume(error -> Mono.error(new RuntimeException(error.getMessage()))).block()
                ).map(CreateProductUseCaseMapper::buildSuccessResponse)
                 .onFailure(e -> new RuntimeException(e.getMessage()))
                 .toEither();

        return response.isRight() ? Either.right(response.get()) : Either.left(UseCaseErrorResponseMapper.buildErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.name(),
                GenericResponseCodes.ERROR_INTERNO_SERVIDOR.getValue(),
                GenericResponseCodes.ERROR_INTERNO_SERVIDOR.getDescription() + " " + response.getLeft().getMessage()));


    }
}
