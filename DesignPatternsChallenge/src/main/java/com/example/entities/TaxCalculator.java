package com.example.entities;

import com.example.interfaces.Tax;
import java.math.BigDecimal;

public class TaxCalculator {
    private Tax tax;

    public TaxCalculator(Tax tax) {
        this.tax = tax;
    }

    public BigDecimal calculateTax(BigDecimal value) {
        return tax.calculateTax(value);
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }
}