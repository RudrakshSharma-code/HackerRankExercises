import java.io.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Take a string and increment the the ascii value or whaterver by s
        // If it is no longer a letter start at the beggining
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<Character> alphaList = alphabet.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> betaList = alphabet.toUpperCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> inputChars = new ArrayList<>(s.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));

        for (int i = 0; i < inputChars.size(); i++) {
            int val = 0;
            if (alphaList.contains(inputChars.get(i))) {
                val = alphaList.indexOf(inputChars.get(i)) + k;
                while (val >= alphaList.size()) {
                    val = (val - (alphaList.size()));
                }
                inputChars.set(i, alphaList.get(val));
            } else if (betaList.contains(inputChars.get(i))) {
                val = betaList.indexOf(inputChars.get(i)) + k;
                while (val >= betaList.size()) {
                    val = (val - (betaList.size()));
                }
                inputChars.set(i, betaList.get(val));
            }
        }

        StringBuilder str = new StringBuilder();
        for (char c : inputChars) {
            str.append(c);
        }
        return str.toString();

    }

}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {

        String s = "Always-Look-on-the-Bright-Side-of-Life";
        int rotationFactor = 5;

        String result = Result.caesarCipher(s, rotationFactor);

        System.out.println(result);
    }
}
