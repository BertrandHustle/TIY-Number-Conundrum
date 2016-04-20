import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests whether pattern matching method for input strings works
 */

public class NumberMatcherTest {

    @Test

    /**
     * Given the word "three"
     * When passed through matcher
     * Then returns true
     */

    public void whenThreeThenReturnsTrue() {

        //arrange

        NumberMatcher test = new NumberMatcher();
        boolean testResult = false;

        //act

        testResult = test.numberMatcher("three");

        //assert

        assertThat(testResult, is(true));

    }

}
