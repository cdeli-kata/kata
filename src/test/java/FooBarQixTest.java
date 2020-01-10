import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class FooBarQixTest {
    @Parameters
    public static Collection<Object[]> getParams() {
        return Arrays.asList(new Object[][] {
                {1, "1"},
                {3, "FooFoo"},
                {5, "BarBar"},
                {7, "Qix"},
                {77, "QixQix"},
                {51, "FooBar"},
                {53, "BarFoo"},
                {13, "Foo"},
                {15, "FooBarBar"},
                {33, "FooFooFoo"},
                {27, "FooQix"},
                {100, "Bar"}
        });
    }

    private int digit;
    private String expected;
    public FooBarQixTest(int digit, String expected) {
        this.digit = digit;
        this.expected = expected;
    }

    @Test
    public void foo_bar_qix() {
        assertEquals(digit + " failed !", expected, FooBarQix.process(digit));
    }

}