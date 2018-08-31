import org.junit.*;
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
        MyTest asft = new MyTest();
        assertTrue(asft.isEvenNumber(4));
    }
}
