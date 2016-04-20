import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests arrraylist building method
 */

public class ArrayBuilderTest {

    @Test

    /**
     * Given a loop of numbers 1-3
     * When numbers are ran through .ArrayBuilder method
     * Then has "two" at position index 1
     */

    public void whenLoopOneThrough3ThenReturnWords(){

        //Arrange

        ArrayBuilder test = new ArrayBuilder();

        //Act

        test.arrayBuilder("ones", 1, 3);

        //Assert

        assertThat((test.arrayBuilder("ones", 1, 3).get(1)), is("two"));
        System.out.println(test.arrayBuilder("ones", 1, 3).get(1));


    }

    @Test

    /**
     * Given a series of numbers 1-9, 10-19, and 20-90
     * When passed through arrayBuilder
     * Then correct words at arbitrary indexes are returned
     */

    public void whenOneThroughNinetyNineThenCorrectArrays() {

        //arrange

        ArrayBuilder test = new ArrayBuilder();

        //act

        test.arrayBuilder("tens", 20, 90);
        test.arrayBuilder("teens", 10, 19);
        test.arrayBuilder("ones", 1, 9);


        //assert

        assertThat((test.arrayBuilder("teens", 10, 19).get(3)), is("thirteen"));
        assertThat((test.arrayBuilder("ones", 1, 9).get(2)), is("three"));
        assertThat((test.arrayBuilder("tens", 20, 90).get(3)), is("fifty "));

    }



//todo: get ones place working

}
