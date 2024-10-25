package test;

import main.PrimeNumberCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCalculatorTest {

    PrimeNumberCalculator calculator = new PrimeNumberCalculator();

    @Test
    @DisplayName("Test counting primes in valid range")
    public void testCountPrimesInValidRange() {
        int count = calculator.countPrimesInRange(0, 10);
        assertEquals(4, count, "Should return 4 primes between 0 and 10.");
    }

    @Test
    @DisplayName("Test summing primes in valid range")
    public void testSumPrimesInValidRange() {
        int sum = calculator.sumPrimesInRange(0, 10);
        assertEquals(17, sum, "Sum of primes between 0 and 10 should be 17.");
    }

    @Test
    @DisplayName("Test startnumber input is outside range")
    public void testStartNumberOutsideRange() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.startNumber(3000);
        });
        assertEquals("Hoppsan, siffran är inte inom intervallet!", exception.getMessage());
    }

    @Test
    @DisplayName("Test startnumber input is within range")
    public void testStartNumberInsideRange() {
            calculator.startNumber(10);
        assertNotEquals("Hoppsan, siffran är inte inom intervallet!",10);
    }

    @Test
    @DisplayName("Test endnumber input is outside range")
    public void testEndNumberOutsideRange() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.startNumber(3000);
        });
        assertEquals("Hoppsan, siffran är inte inom intervallet!", exception.getMessage());
    }

    @Test
    @DisplayName("Test endnumber input is within range")
    public void testEndNumberInsideRange() {
        calculator.startNumber(999);
        assertNotEquals("Hoppsan, siffran är inte inom intervallet!",999);
    }

    @Test
    @DisplayName("Test startnumber is bigger than endnumber")
    public void testStartNumberBiggerThanEndNumber() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> {
            calculator.countPrimesInRange(888,333);
        });
        assertEquals("Hoppsan, fel intervall angivet!", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
            calculator.sumPrimesInRange(888,333);
        });
        assertEquals("Hoppsan, fel intervall angivet!", exception2.getMessage());
    }
}
