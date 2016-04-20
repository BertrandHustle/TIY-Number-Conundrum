import java.util.ArrayList;

public class TextNumber {

    public int toNumber(String words) {

        //initializing

        int total = 0;

        //build arrays

        ArrayBuilder builder = new ArrayBuilder();

        builder.arrayBuilder("ones", 1, 9);
        builder.arrayBuilder("teens", 10, 19);
        builder.arrayBuilder("tens", 20, 90);

        //build pattern

        

        String pattern1 = String.join("|", ones);

        //regex stuff

    System.out.println(total);
    return total;

    }

}




