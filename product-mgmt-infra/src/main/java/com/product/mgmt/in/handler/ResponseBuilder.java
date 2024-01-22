package com.product.mgmt.in.handler;

import com.product.mgmt.in.error.ErrorResponse;
import com.product.mgmt.in.util.GenericResponse;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@NoArgsConstructor
@Slf4j
public class ResponseBuilder {

    public ResponseEntity<GenericResponse> mapResponseBuilder(GenericResponse T) {


        if (T instanceof ErrorResponse) {
            ErrorResponse response = Optional.of((ErrorResponse) T).get();
            return new ResponseEntity<>(response, HttpStatus.valueOf(response.getMessageResponse().getResponseCode()));
        } else {
            return new ResponseEntity<>(T, HttpStatus.OK);
        }
    }


}