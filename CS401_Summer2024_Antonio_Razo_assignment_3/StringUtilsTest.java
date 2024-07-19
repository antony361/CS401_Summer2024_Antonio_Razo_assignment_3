import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringUtilsTest {

    private String input1;
    private String input2;
    private String expectedConcatenate;
    private String expectedReverse;
    private String expectedUpperCase;
    private String expectedTrim;

    public StringUtilsTest(String input1, String input2, String expectedConcatenate, String expectedReverse, String expectedUpperCase, String expectedTrim) {
        this.input1 = input1;
        this.input2 = input2;
        this.expectedConcatenate = expectedConcatenate;
        this.expectedReverse = expectedReverse;
        this.expectedUpperCase = expectedUpperCase;
        this.expectedTrim = expectedTrim;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"abc", "def", "abcdef", "cba", "ABC", "abc"},
            {" ", "def", " def", " ", " ", ""},
            {"abc", "", "abc", "cba", "ABC", "abc"},
            {"123", "456", "123456", "321", "123", "123"},
            {"abc", " ", "abc ", "cba", "ABC", "abc"}
        });
    }

    @Test
    public void testConcatenate() {
        assertEquals(expectedConcatenate, StringUtils.concatenate(input1, input2));
    }

    @Test
    public void testReverse() {
        assertEquals(expectedReverse, StringUtils.reverse(input1));
    }

    @Test
    public void testToUpperCase() {
        assertEquals(expectedUpperCase, StringUtils.toUpperCase(input1));
    }

    @Test
    public void testTrim() {
        assertEquals(expectedTrim, StringUtils.trim(input1));
    }
}
