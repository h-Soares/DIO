package taxImplTests;

import com.example.interfaces.impl.IcmsTax;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class IcmsTaxTest {
    private final IcmsTax icmsTax = IcmsTax.getInstance();

    @Test
    void shouldCalculateTaxCorrectly() {
        BigDecimal actual = icmsTax.calculateTax(BigDecimal.valueOf(100));
        BigDecimal expected = BigDecimal.valueOf(17);

       assertEquals(0, actual.compareTo(expected));
    }
}