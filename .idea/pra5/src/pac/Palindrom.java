package pac;

public class Palindrom {
    public static boolean rec(String s) {
        char firstChar;
        char lastChar;
        int size = s.length();
        String subString;


        if (size <= 1) {
            return true;
        } else {
            firstChar = s.toCharArray()[0];
            lastChar = s.toCharArray()[size - 1];
            subString = s.substring(1, size - 1);
            return firstChar == lastChar && rec(subString);
        }
    }

}
