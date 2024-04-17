package assignment1defense;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        String result = ToUpper(s,s.length()-1);
        System.out.println(result);
    }
    public static String ToUpper(String str,int index) {
        if (str.isEmpty() || index < 0) {
            return str;
        } else {
            char[] chars = str.toCharArray();
            chars[index] = (char) (chars[index] - 32);
            String modifiedStr = new String(chars);
            return ToUpper(modifiedStr, index - 1);
        }
    }
}

