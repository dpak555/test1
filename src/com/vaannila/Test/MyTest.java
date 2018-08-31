package com.vaannila.Test;
 
import org.junit.Test;
import static org.junit.Assert.*;
 
public class MyTest {
 
    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    public void evenNumberTest(){
        MyAssertTrueTest asft = new MyAssertTrueTest();
        assertTrue(asft.isEvenNumber(4));
    }
}
