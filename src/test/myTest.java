package com.test;
 
import org.junit.*;
import static org.junit.Assert.*;
 
public class myTest {
 
    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    public void evenNumberTest(){
        myTest asft = new myTest();
        assertTrue(asft.isEvenNumber(4));
    }
}
