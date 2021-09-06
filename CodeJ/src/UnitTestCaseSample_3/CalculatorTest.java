package UnitTestCaseSample_3;

//import static org.junit.Assert.assertEquals;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        //assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        //assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        Calculator calculator = new Calculator();
        calculator.subtract(2);
        //assertEquals(-2, calculator.getValue());
    }

}

//Oouput:
//Testsuite: CalculatorTest
//        Tests run: 3, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.059 sec
//
//        Testcase: valueMinusTwoWhenTwoSubstracted(CalculatorTest): FAILED
//        expected:<-2> but was:<2>
//        junit.framework.AssertionFailedError: expected:<-2> but was:<2>
//        at CalculatorTest.valueMinusTwoWhenTwoSubstracted(CalculatorTest.java:25)
//
//        Test CalculatorTest FAILED
//        test-report:
//        test:
//        BUILD SUCCESSFUL (total time: 0 seconds)