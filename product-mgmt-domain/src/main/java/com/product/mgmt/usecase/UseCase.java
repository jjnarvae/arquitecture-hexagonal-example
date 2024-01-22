package com.product.mgmt.usecase;

import com.product.mgmt.kernel.command.Command;

@FunctionalInterface
public interface UseCase<T extends Command, R> {
    R execute(T command);
}