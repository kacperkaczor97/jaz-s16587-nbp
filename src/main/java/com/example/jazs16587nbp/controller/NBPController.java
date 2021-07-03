package com.example.jazs16587nbp.controller;

import com.example.jazs16587nbp.service.NBPService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nbp")

public class NBPController {

    private final NBPService nbpService;

    public NBPController(NBPService nbpService) {
        this.nbpService = nbpService;
    }
    @ApiOperation(value = "Get currency for dates", response = Double.class, notes = "This method return course in range of first date and secon date")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 404, message = "Bad params"),
    })
    @GetMapping("/{currency}/{firstDate}/{secondDate}")
    public ResponseEntity<Double> getValue(
            @ApiParam(
                    name = "currency",
                    type = "String",
                    value = "param of currency",
                    example = "1",
                    required = true)
            @PathVariable String currency,
            @ApiParam(
                    name = "firstDate",
                    type = "String",
                    value = "param of first date",
                    example = "1",
                    required = true)
            @PathVariable String firstDate,
            @ApiParam(
                    name = "secondDate",
                    type = "String",
                    value = "param of second date",
                    example = "1",
                    required = true)
            @PathVariable String secondDate) {

        Double value = nbpService.getValue(currency, firstDate, secondDate);

        return ResponseEntity.ok(value);
    }
}
