import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestKataCalculator {

    //emtpy string should return zero
    public void emptyStringReturnsZero(){

        Calculator calculator = new Calculator();
        assertEquals( calculator.Add(""), 0);

    }
}
