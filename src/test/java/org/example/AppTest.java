package org.example;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import calculator.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     *//*
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/

    @Test
    public void subtest(){
        Calculator calculator = new Calculator();
        calculator.sub(1,2);
        System.out.println( calculator.sub(1,2));

    }
    @Test
    public void multiplytest(){
        Calculator calculator = new Calculator();
        calculator.multiply(1,2);
        System.out.println( calculator.multiply(6,2));

    }


}
