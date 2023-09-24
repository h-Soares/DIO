package com.example.interfaces.impl;

import com.example.interfaces.Tax;
import java.math.BigDecimal;
import java.util.Objects;

public class IcmsTax implements Tax {
    private static IcmsTax icmsTax;
    private static final BigDecimal TAX_VALUE = BigDecimal.valueOf(0.17);

    private IcmsTax() {
    }

    @Override
    public BigDecimal calculateTax(BigDecimal value) {
        return value.multiply(TAX_VALUE);
    }

    public static IcmsTax getInstance() {
        if(Objects.isNull(icmsTax))
            icmsTax = new IcmsTax();
        return icmsTax;
    }
}