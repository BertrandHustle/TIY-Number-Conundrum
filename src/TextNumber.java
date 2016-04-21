import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextNumber {

    public int toNumber(String input) {

        //initializing

        int total = 0;
        input = "two";

        //build arrays

        ArrayBuilder builder = new ArrayBuilder();

        builder.arrayBuilder("ones", 1, 9);
        //builder.arrayBuilder("teens", 10, 19);
        //builder.arrayBuilder("tens", 20, 90);

        //init/get pattern

        String onesPattern = builder.getOnesPattern();
        //String tensPattern = patternFetcher.getTensPattern();
        //String teensPattern = patternFetcher.getTeensPattern();

        //Pattern p = Pattern.compile(onesPattern);
        //Matcher m = p.matcher(input);
        //boolean b = m.matches();

        //regex stuff

    System.out.println(onesPattern);
    //System.out.println(b);
    System.out.println(total);
    return total;

    }

}

//todo: create boolean digit switches
//todo : put in exception for "X hundred thousand"
//todo : assemble switches for words based on array position
//todo : make loop for input string that loops per word (regex? .contains?)

//NOTE: a ones word (e.g. "five") can either be in the ones place, preceed "hundred", or preceed "thousand"

