package com.example.app;

import com.example.entities.TaxCalculator;
import com.example.interfaces.impl.FederalTax;
import com.example.interfaces.impl.IcmsTax;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //with ICMS tax
        TaxCalculator taxCalculator = new TaxCalculator(IcmsTax.getInstance());
        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(57)));

        //with federal tax
        taxCalculator.setTax(FederalTax.getInstance());
        System.out.println(taxCalculator.calculateTax(BigDecimal.valueOf(74)));
    }
}