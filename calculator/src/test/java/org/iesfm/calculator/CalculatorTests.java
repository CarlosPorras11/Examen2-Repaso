package org.iesfm.calculator;

import org.iesfm.calculator.exceptions.NegativeNumberException;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class CalculatorTests {

    @Test
    public void testSqrt() throws NegativeNumberException{
        double result = Calculator.sqrt(16);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test (expected = NegativeNumberException.class)
    public void testSqrtNegative() throws NegativeNumberException {
        double result = Calculator.sqrt(-16);
    }

    @Test
    public void sumTest(){
        List<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        int result = Calculator.sum(numbers);
        Assert.assertEquals(40, result);
    }
}
