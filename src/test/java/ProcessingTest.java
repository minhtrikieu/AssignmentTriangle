import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessingTest {
    Processing triangle1 = new Processing(3,4,5);
    Processing triangle2 = new Processing(3,3,4);
    Processing triangle3 = new Processing(3,3,3);
    Processing triangle4 = new Processing(3,4,6);
    @Test
    public void checktriangle() {
        boolean result = triangle1.checkTriangle();
        Assert.assertEquals(true,result);
    }

    @Test
    public void checktriangleRightangled() {
       Assert.assertEquals(true,triangle1.checkRightangled());
    }
    @Test
    public void checktriangleAcute() {
        Assert.assertEquals(true,triangle4.checkAcute());
    }
    @Test
    public void checktriangleIsosceles(){
        Assert.assertEquals(true,triangle2.checkIsosceles());
    }
    @Test
    public void checktriangleEquilateral(){
        Assert.assertEquals(true,triangle3.checkIsosceles());
    }
}