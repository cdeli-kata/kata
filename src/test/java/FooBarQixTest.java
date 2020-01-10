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
        assertEquals("Foo", fooBarQix.process(3));
    }

    @Test
    public void foo_bar_qix_5() {
        assertEquals("Bar", fooBarQix.process(5));
    }

}