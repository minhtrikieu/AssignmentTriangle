import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessingTest {
    Processing process = new Processing(3,4,5);
    @Test
    public void checktriangle() {
        boolean result = process.checkTriangle();
        Assert.assertEquals(true,result);
    }

    @Test
    public void triangle() {
        if(process.checkTriangle()== true){
            Assert.assertEquals("This is Right-angled triangle",process.triangle());
        }

    }
}