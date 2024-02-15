package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C03_Assertions {

    public double divide(int a, int b) {
        return (double) a / b;
    }

    @Test
    public void scenario1() {
        int expected = 5;
        int actual = (int) divide(10, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scenario2() {
        double expected = 2.5;
        int actual = (int) divide(5, 2);
        Assert.assertTrue(expected == actual);
    }

    @Test
    public void scenario3() {
        int expected = -1;
        double actual = divide(9, 0);
    }
}
