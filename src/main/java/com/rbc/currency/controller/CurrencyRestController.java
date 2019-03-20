package com.rbc.currency.controller;

import com.rbc.currency.model.ConversionResponse;
import com.rbc.currency.model.ConversionRequest;
import com.rbc.currency.util.NumberUtility;
import org.apache.commons.math3.util.Precision;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class CurrencyRestController {

    @GetMapping
    @RequestMapping(value = "/test")
    public String testCurrency() {
        return "Testing Currency app";
    }

    @PostMapping
    @RequestMapping(value = "/currency", produces = MediaType.APPLICATION_JSON_VALUE)
    public ConversionResponse getConversion(@RequestBody ConversionRequest currencyRequest) {
        double amount = currencyRequest.getAmount() * 2 + Precision.round(NumberUtility.generateRandomDouble(), 2);
        ConversionResponse conversionResponse = new ConversionResponse();
        conversionResponse.setAmount(Precision.round(amount, 2));
        conversionResponse.setCurrency("USD");
        return conversionResponse;
    }
}
