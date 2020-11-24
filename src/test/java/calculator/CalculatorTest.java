
package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
 Calculator calculator;
 @Before
 public void setUip() throws Exception{
  calculator=new Calculator();
 }

 @Test
 public void sub() {

  int resultat=calculator.sub(2,2);
  Assert.assertEquals(4,resultat);


 }

 @Test
 public void minus() {

  Assert.assertEquals(0, calculator.minus(2,2));
 }

 @Test
 public void multiply() {
  Assert.assertEquals(4, calculator.multiply(2,2));
 }

 }