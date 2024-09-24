import org.example.Main;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class CalculatorTest {
    private Main calculator;

    @Before
    public  void setUp(){
        calculator = new Main();
    }

    @Test
    public void testSqareRootPositive(){
        double input = 25.0;
        double expected = 5.0;
        Assert.assertEquals(expected, Main.squareRoot(input), 0.001);
    }

    @Test
    public void testSqareRootZero(){
        double input = 0.0;
        double expected = 0.0;
        Assert.assertEquals(expected, Main.squareRoot(input), 0.001);
    }

    @Test
    public void testSqareRootNegative(){
        double input = -25.0;
        double expected = -1.0;
        Assert.assertEquals(expected, Main.squareRoot(input), 0.001);
    }

    @Test
    public void testFactorialPositive() {
        int input = 5;
        long expected = 120;
        Assert.assertEquals(expected, Main.factorial(input));
    }

    @Test
    public void testFactorialZero() {
        int input = 0;
        long expected = 1;
        Assert.assertEquals(expected, Main.factorial(input));
    }

    @Test
    public void testFactorialNegative() {
        int input = -5;
        long expected = -1;
        Assert.assertEquals(expected, Main.factorial(input));
    }

    @Test
    public void testNaturalLogPositive() {
        double input = Math.E; // ln(e) = 1
        double expected = 1.0;
        Assert.assertEquals(expected, Main.naturalLog(input), 0.001);
    }

    @Test
    public void testNaturalLogZero() {
        double input = 0.0;
        double expected = -1.0; // your function returns -1 for invalid cases
        Assert.assertEquals(expected, Main.naturalLog(input), 0.001);
    }

    @Test
    public void testNaturalLogNegative() {
        double input = -5.0;
        double expected = -1.0; // your function returns -1 for invalid cases
        Assert.assertEquals(expected, Main.naturalLog(input), 0.001);
    }

    @Test
    public void testPowerPositiveExponent() {
        double base = 2.0;
        double exponent = 3.0;
        double expected = 8.0;
        Assert.assertEquals(expected, Main.power(base, exponent), 0.001);
    }

    @Test
    public void testPowerNegativeExponent() {
        double base = 2.0;
        double exponent = -2.0;
        double expected = 0.25;
        Assert.assertEquals(expected, Main.power(base, exponent), 0.001);
    }

    @Test
    public void testPowerZeroExponent() {
        double base = 5.0;
        double exponent = 0.0;
        double expected = 1.0;
        Assert.assertEquals(expected, Main.power(base, exponent), 0.001);
    }

    @Test
    public void testPowerZeroBase() {
        double base = 0.0;
        double exponent = 5.0;
        double expected = 0.0;
        Assert.assertEquals(expected, Main.power(base, exponent), 0.001);
    }


}
