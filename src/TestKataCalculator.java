import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.fail;

@Test
public class TestKataCalculator {

    //emtpy string should return zero
    public void emptyStringReturnsZero(){

        Calculator calculator = new Calculator();
        assertEquals( calculator.Add(""), 0);

    }

    public void singleValueIsReplied(){
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1"), 1);
    }

    public void twoValueStringSum(){
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1,2"), 3);
    }

    public void twoValueStringSumNewLineSeparated(){
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1\n2"), 3);
    }

    public void getSumOfUnknownAmountOfNumbers(){
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1,2,3,4,5"), 15);
        assertEquals( calculator.Add("1,2,3,4,5,4"), 19);
    }
    public void handleNewLinesBetweenNumbers(){
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1\n2,3"), 6);
    }

    public void supportDifferentDelimiters(){
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("//;\n1;2"), 3);
    }

    public void negativeNumberException(){
        Calculator calculator = new Calculator();

        try {
            int sum = calculator.Add("-1,-2,4,3");
            fail("No exception thrown!");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "negatives not allowed");
        }
    }
}
