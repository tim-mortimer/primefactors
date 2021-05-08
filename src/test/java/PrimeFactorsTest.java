import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    @Test
    void testPrimes() {
        assertEquals(List.of(), PrimeFactors.of(1));
        assertEquals(List.of(2), PrimeFactors.of(2));
        assertEquals(List.of(3), PrimeFactors.of(3));
        assertEquals(List.of(2, 2), PrimeFactors.of(4));
        assertEquals(List.of(5), PrimeFactors.of(5));
        assertEquals(List.of(2, 3), PrimeFactors.of(6));
        assertEquals(List.of(7), PrimeFactors.of(7));
        assertEquals(List.of(2, 2, 2), PrimeFactors.of(8));
        assertEquals(List.of(3, 3), PrimeFactors.of(9));
        assertEquals(List.of(2, 5), PrimeFactors.of(10));
        assertEquals(List.of(2, 2, 3), PrimeFactors.of(12));
        assertEquals(List.of(2, 2, 3, 5, 11, 13, 13, 17), PrimeFactors.of(2 * 2 * 3 * 5 * 11 * 13 * 13 * 17));
    }
}
