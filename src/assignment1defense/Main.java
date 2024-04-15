package assignment1defense;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        given string
        lower case to upper case
        recursion
        no loop
         */

        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        toUpper(s,0);

    }
    public static char toUpper(String s, int index){
        if(index==s.length()-1){
            return Character.toUpperCase(ch);
        }
            char ch=s.charAt(index);
            Character.toUpperCase(ch);
            toUpper(s,index+1);
    }
}

