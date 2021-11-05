package repetition.recursion;

public class App {
    public static void main(String[] args) {
        System.out.println(dollarInBetween("hello"));
    }

    public static String dollarInBetween(String str) {
        if(str.length() <= 1)
            return str;

        return str.charAt(0) + "$" + dollarInBetween(str.substring(1));
    }
}