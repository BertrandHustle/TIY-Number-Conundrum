import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests arraylist building method
 */

public class ArrayBuilderTest {

    @Test

    /**
     * Given an array of strings
     * When array is gotten
     * Then array contains strings concontenated with '|'
     */

    public void whenArrayThenConcontenatedStrings() {

        //Arrange
        ArrayBuilder test = new ArrayBuilder();

        //Act
        test.arrayBuilder("teens", 10, 19);

        //Assert
        assertThat(test.getOnesPattern(), is("ten|eleven|twelve|thirteen|fourteen|fifteen|sixteen|seventeen|eighteen|nineteen|"));

    }


}
