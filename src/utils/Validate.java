package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static String validateInputString(String message, String error, String patternString, Scanner input ){
        while (true){
            System.out.print(message);
            String choice = input.nextLine();
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(choice);
            if(matcher.matches()){
                return choice;
            }
            else
                System.out.println(error);
        }
    }

    public static int validateInputInt(String s, String s1, String s2, Scanner scanner) {
        while (true){
            System.out.print(s);
            String choice = scanner.nextLine();
            Pattern pattern = Pattern.compile(s2);
            Matcher matcher = pattern.matcher(choice);
            if(matcher.matches()){
                return Integer.parseInt(choice);
            }
            else
                System.out.println(s1);
        }
    }
}