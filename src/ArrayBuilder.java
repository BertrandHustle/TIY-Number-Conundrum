import java.util.ArrayList;

/**
 * Creates arrays for TextNumber class
 */
public class ArrayBuilder {

    //init arrays and convert to strings

    private ArrayList<String> ones = new ArrayList<String>();
    private ArrayList<String> tens = new ArrayList<String>();
    private ArrayList<String> teens = new ArrayList<String>();

    private String onesPattern = "";
    private String tensPattern = "";
    private String teensPattern = "";

    public void arrayBuilder(String arrayName, int beginRange, int endRange) {

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

            for (String j : ones) {

                onesPattern += j + "|";

            }

        } else if (arrayName.equals("tens")) {

            for (String k : tens) {

                tensPattern += k + "|";

            }

        } else if (arrayName.equals("teens")) {

            for (String l : teens) {

                teensPattern += l + "|";

            }


        }

    }

    //getter for arrays

    public String getOnesPattern() {
        return onesPattern;
    }

    public String getTensPattern() {
        return tensPattern;
    }

    public String getTeensPattern() {
        return teensPattern;
    }

}







