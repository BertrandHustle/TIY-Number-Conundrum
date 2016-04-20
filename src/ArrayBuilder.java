import java.util.ArrayList;

/**
 * Creates arrays for TextNumber class
 */
public class ArrayBuilder {

    //init arrays

    ArrayList<String> ones = new ArrayList<String>();
    ArrayList<String> tens = new ArrayList<String>();
    ArrayList<String> teens = new ArrayList<String>();

    public ArrayList arrayBuilder(String arrayName, int beginRange, int endRange) {

        for (int i = beginRange; i <= endRange; ++i) {

            NumberText speaker = new NumberText();

            if (arrayName.equals("ones")) {

                ones.add(speaker.toText(i));

            }

            if (arrayName.equals("tens")) {

                tens.add(speaker.toText(i));

                i = i + 9;

            }

            if (arrayName.equals("teens")) {

                teens.add(speaker.toText(i));

            }

        }

        if (arrayName.equals("ones")) {

            return ones;

        }

        if (arrayName.equals("tens")) {

            return tens;

        }

        if (arrayName.equals("teens")) {

            return teens;

        }

        return null;

    }

}

