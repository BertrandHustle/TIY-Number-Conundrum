import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NumberTextTest {

    //Tests from 1-19

        @Test

        /**
         * Given a number in the ones or teens
         * When .toText is run
         * Then outputs correct text
         */

        public void whenOnesOrTeensThenCorrectText() {

            //Arrange

            NumberText translator = new NumberText();

            //Act (N/A)

            //Assert

            assertThat(translator.toText(0), equalTo("zero"));

            assertThat(translator.toText(5), equalTo("five"));

            assertThat(translator.toText(7), equalTo("seven"));

            assertThat(translator.toText(7), equalTo("seven"));

            assertThat(translator.toText(11), equalTo("eleven"));

            assertThat(translator.toText(18), equalTo("eighteen"));

        }

        /**
         * Given a number in the tens
         * When .toText is run
         * Then outputs correct text
         */

        @Test

        public void whenTensThenCorrectText(){

                //Arrange

                NumberText translator = new NumberText();

                //Act (N/A)

                //Assert

            assertThat(translator.toText(25), equalTo("twenty five"));

            assertThat(translator.toText(50), equalTo("fifty "));

            assertThat(translator.toText(73), equalTo("seventy three"));

        }

        /**
         * Given a number in the hundreds
         * When .toText is run
         * Then outputs correct text
         */

        @Test

        public void whenHundredsThenCorrectText() {

            //Arrange

            NumberText translator = new NumberText();

            //Act (N/A)

            //Assert

            assertThat(translator.toText(100), equalTo("one hundred "));

            assertThat(translator.toText(325), equalTo("three hundred twenty five"));

        }

        /**
         * Given a number in the thousands
         * When .toText is run
         * Then outputs correct text
         */

        @Test

        public void whenThousandsThenCorrectText() {

            //Arrange

            NumberText translator = new NumberText();

            //Act (N/A)

            //Assert
            assertThat(translator.toText(3011), equalTo("three thousand eleven"));

        }

        /**
         * Given a number in the hundred thousands
         * When .toText is run
         * Then outputs correct text
         */

        @Test

        public void whenHundredThousandsThenCorrectText() {

            //Arrange

            NumberText translator = new NumberText();

            //Act (N/A)

            //Assert

            assertThat(translator.toText(325325), equalTo("three hundred twenty five thousand three hundred twenty five"));

        }


    }



