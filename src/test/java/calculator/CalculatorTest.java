
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

  Assert.assertEquals(1, calculator.minus(3,2));
 }

 @Test
 public void multiply() {
  Assert.assertEquals(6, calculator.multiply(2,3));
 }
 @Test
 public void testdivide(){
  int   result=calculator.divide(8,2);
  if(result !=4){
   Assert.fail(); //cela nous montre que 8 div 2 =4
  }
 }

 @Test
 public void min() {
  int min=calculator.min(8,25);
  if (min !=8) Assert.fail();
 }

 @Test
 public void max() {
  int max=calculator.max(500,100);
  Assert.assertEquals(500,max);

 }

 @Test
 public void minElement() {
  int tab[]={
          1,5,6,9
  };
  int a=calculator.minElement(tab);
  Assert.assertEquals(1,a);

 }
 @Test
 public void maxElement(){
  int tab[]={
          1,4,5,9
  };
  int a =calculator.maxElement(tab);
  Assert.assertEquals(9,a);

 }

 }
