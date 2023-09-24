package taxImplTests;

import com.example.interfaces.impl.FederalTax;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FederalTaxTest {
    private final FederalTax federalTax = FederalTax.getInstance();

    @Test
    void shouldCalculateTaxCorrectly() {
        BigDecimal actual = federalTax.calculateTax(BigDecimal.valueOf(100));
        BigDecimal expected = BigDecimal.valueOf(60);

        assertEquals(0, actual.compareTo(expected));
    }
}