package com.example.interfaces.impl;

import com.example.interfaces.Tax;
import java.math.BigDecimal;
import java.util.Objects;

public class FederalTax implements Tax {
    private static FederalTax federalTax;
    private static final BigDecimal TAX_VALUE = BigDecimal.valueOf(0.60);

    private FederalTax() {
    }

    public static FederalTax getInstance() {
        if(Objects.isNull(federalTax))
            federalTax = new FederalTax();
        return federalTax;
    }

    @Override
    public BigDecimal calculateTax(BigDecimal value) {
        return value.multiply(TAX_VALUE);
    }
}