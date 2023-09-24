package com.example.interfaces;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculateTax(BigDecimal value);
}