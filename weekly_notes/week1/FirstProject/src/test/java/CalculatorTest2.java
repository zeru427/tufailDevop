import day6.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest2 {

    Calculator calc;
    int expected =0;
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Welcome to Calculator Test");

    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Congratulations your tests completed.");
    }
    @BeforeEach
    public  void setUp(){
        calc = new Calculator();
        expected = 20;
        System.out.println("before each");
    }
    @AfterEach
    public  void tearDown(){
        calc= null;
        expected =0;
        System.out.println("after each");
    }
    @Test
    @DisplayName("Testing sum with two whole numbers - 2nd")
    @Order(2)
    public void testCalculatorSum1(){
        System.out.println("testCalculatorSum1 called");
              int actual =   calc.sum(10,10);
              assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and zero - 3rd")
    @Order(3)
    public void testCalculatorSum2(){
        System.out.println("testCalculatorSum2 called");
        int actual =   calc.sum(20,0);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and negative number - 1st")
    @Order(1)
    public void testCalculatorSum3(){
        System.out.println("testCalculatorSum3 called");
        int actual =   calc.sum(30,-10);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing multiply with two whole numbers ")
    @Order(4)
    public void testCalculatormultiply1(){
        System.out.println("testCalculatorMultiply1 called");
        int actual =   calc.multiply(10,2);
        assertEquals(expected,actual);
    }


    @Test
    @DisplayName("Testing convert to numbers \"20\" ")
    @Order(5)
    public void testConvertNumbers1(){
        System.out.println("testConvertNumbers1 called");
        int actual =   calc.convertToNumber("20");
        assertEquals(expected,actual);
    }

    //Handle exception in junit
    @Test
    @DisplayName("Testing convert to numbers \"Twenty\" ")
    @Order(5)
    public void testConvertNumbers2(){
        System.out.println("testConvertNumbers2 called");
        assertThrows(NumberFormatException.class, () -> {
            int actual =   calc.convertToNumber("Twenty");
            assertEquals(expected,actual);
        });
    }

    @Test
    @DisplayName("10. Testing div with number and zero")
    @Order(10)
    public void testCalculator10() {

        //expect
        //actual
        assertThrows(ArithmeticException.class, () -> {
            int actual = calc.div(40, 0);
            assertEquals(expected, actual);
        });
    }
    @Test
    @DisplayName("11. Testing div with number and number")
    @Order(11)
    public void testCalculator11() {

        //expect
        //actual
        int actual = calc.div(40, 2);
        assertEquals(expected, actual);

    }


}
