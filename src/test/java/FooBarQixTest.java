import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarQixTest {
    private FooBarQix fooBarQix;

    @Before
    public void setUp() {
        fooBarQix = new FooBarQix();
    }

    @Test
    public void foo_bar_qix_1() {
        assertEquals("1", fooBarQix.process(1));
    }

    @Test
    public void foo_bar_qix_3() {
        assertEquals("FooFoo", fooBarQix.process(3));
    }

    @Test
    public void foo_bar_qix_5() {
        assertEquals("BarBar", fooBarQix.process(5));
    }

    @Test
    public void foo_bar_qix_7() {
        assertEquals("Qix", fooBarQix.process(7));
    }

    @Test
    public void foo_bar_qix_77() {
        assertEquals("QixQix", fooBarQix.process(77));
    }

}