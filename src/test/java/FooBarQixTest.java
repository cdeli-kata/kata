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

    @Test
    public void foo_bar_qix_51() {
        assertEquals("FooBar", fooBarQix.process(51));
    }

    @Test
    public void foo_bar_qix_53() {
        assertEquals("BarFoo", fooBarQix.process(53));
    }

    @Test
    public void foo_bar_qix_13() {
        assertEquals("Foo", fooBarQix.process(13));
    }

    @Test
    public void foo_bar_qix_15() {
        assertEquals("FooBarBar", fooBarQix.process(15));
    }

    @Test
    public void foo_bar_qix_33() {
        assertEquals("FooFooFoo", fooBarQix.process(33));
    }

    @Test
    public void foo_bar_qix_27() {
        assertEquals("FooQix", fooBarQix.process(27));
    }
}