import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.fail;

@Test
public class TestKataCalculator {

    //emtpy string should return zero
    public void emptyStringReturnsZero() throws Exception {

        Calculator calculator = new Calculator();
        assertEquals( calculator.Add(""), 0);

    }

    public void singleValueIsReplied() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1"), 1);
    }

    public void twoValueStringSum() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1,2"), 3);
    }

    public void twoValueStringSumNewLineSeparated() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1\n2"), 3);
    }

    public void getSumOfUnknownAmountOfNumbers() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1,2,3,4,5"), 15);
        assertEquals( calculator.Add("1,2,3,4,5,4"), 19);
    }
    public void handleNewLinesBetweenNumbers() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("1\n2,3"), 6);
    }

    public void supportDifferentDelimiters() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("//;\n1;2"), 3);
    }

    public void negativeNumberException(){
        Calculator calculator = new Calculator();

        try {
            int sum = calculator.Add("-1,-2,4,3");
            fail("No exception thrown!");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "negatives not allowed ( -1 -2 )");
        }
    }

    public void numbersBiggerThan1000() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals( calculator.Add("2,1002"), 2);
    }

    public void delimitersCanBeOfAnyLength() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("//[***]\n1***2***3"), 6);
    }

    public void allowMultipleDelimiters() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals( calculator.Add("//[*][%]\n1*2%3"), 6);
    }
}
