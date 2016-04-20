import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern matches number words (e.g. "one") to arrays
 */

public class NumberMatcher {

    public boolean numberMatcher(String input) {

        //creates pattern, matcher, boolean

        Pattern p = Pattern.compile(input);
        Matcher m = p.matcher(input);





        return true;

    }
}
