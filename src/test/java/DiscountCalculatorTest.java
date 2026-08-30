import org.example.DiscountCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DiscountCalculatorTest {

    DiscountCalculator cal = new DiscountCalculator();
    @Test
    public void calculateFinalPriceTest0(){
        double result=cal.calculateFinalPrice(100,20);
        assertEquals(80,result);

    }

    @Test
    public void calculateFinalPriceTest1() {
        double result = cal.calculateFinalPrice(500, 10);
        assertEquals(450, result);
    }
    @Test
    public void calculateFinalPriceTest2() {

        IllegalArgumentException exception =assertThrows(IllegalArgumentException.class,
                ()->cal.calculateFinalPrice(500, -1));
        assertEquals("Discount percent must be between 0.0 and 100.0", exception.getMessage());

    }
    @Test
    public void calculateFinalPriceTest3() {

        IllegalArgumentException exception =assertThrows(IllegalArgumentException.class,
                ()->cal.calculateFinalPrice(500, 120));
        assertEquals("Discount percent must be between 0.0 and 100.0", exception.getMessage());

    }
    @Test
    public void calculateFinalPriceTest4() {
        double result = cal.calculateFinalPrice(500, 0);
        assertEquals(500, result);
    }

    @Test
    public void calculateFinalPriceTest5() {
        double result = cal.calculateFinalPrice(500, 100);
        assertEquals(0, result);
    }


}
