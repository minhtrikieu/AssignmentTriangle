import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessingTest {
    Processing triangle1 = new Processing(3,4,5);
    @Test
    public void checktriangle() {
        boolean result = triangle1.checkTriangle();
        Assert.assertEquals(true,result);
    }

    @Test
    public void triangle() {
        if(triangle1.checkTriangle()== true){
            Assert.assertEquals("This is Right-angled triangle",triangle1.triangle());
        }

    }
}