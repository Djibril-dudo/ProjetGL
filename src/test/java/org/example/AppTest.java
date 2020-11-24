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

    @Test
    public void dividetest(){
        Calculator calculator = new Calculator();
        calculator.divide(1,2);
        System.out.println( calculator.divide(6,2));

    }

    @Test
    public void mintest()
    {
        Calculator calculator = new Calculator();
        calculator.min(1,2);
        System.out.println( calculator.min(6,2));

    }


    @Test

    public void maxtest(){
        Calculator calculator = new Calculator();
        calculator.max(1,2);
        System.out.println( calculator.max(6,2));

    }

    public void minElement(){
        Calculator calculator = new Calculator();
        calculator.minElement(1,2);
        System.out.println( calculator.minElement(6,2));

    }






    }





