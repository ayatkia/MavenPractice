import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void add_ShouldReturnSum(){
        int result=10+20;
        assertEquals(30,result);
    }
}
