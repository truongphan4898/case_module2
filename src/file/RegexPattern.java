package file;

import java.util.Scanner;

public class RegexPattern {
    private static final String REGEX_MOUSE_ID = "^M[a-zA-Z0-9]";
    private static final String REGEX_LAPTOP_ID = "^LT[a-zA-Z0-9]";
    private static final String REGEX_KEYBOARD_ID = "^KB[a-zA-Z0-9]";
    private static final String REGEX_HEADPHONE_ID = "^HP[a-zA-Z0-9]";
    private static final String REGEX_CHARGER_ID = "^C[a-zA-Z0-9]";
    private static final String REGEX_CHARACTER = "^[a-zA-Z][a-zA-Z0-9]*";
    private static final String REGEX_NUM = "^\\d+(\\.\\d+)?$";
    private static final Scanner scanner = new Scanner(System.in);
    public static String checkRegexMouseId(){
        String value=scanner.nextLine();
        while (! String.valueOf(value).matches(REGEX_MOUSE_ID)){
            System.out.println("vui long nhap lai.");
            value=scanner.nextLine();
        }
        return value;
    }
    public static String checkRegexLaptopId(){
        String value=scanner.nextLine();
        while (! String.valueOf(value).matches(REGEX_LAPTOP_ID)){
            System.out.println("vui long nhap lai.");
            value=scanner.nextLine();
        }
        return value;
    }
    public static String checkRegexKeyboadId(){
        String value=scanner.nextLine();
        while (! String.valueOf(value).matches(REGEX_KEYBOARD_ID)){
            System.out.println("vui long nhap lai.");
            value=scanner.nextLine();
        }
        return value;
    }
    public static String checkRegexHeadphoneId(){
        String value=scanner.nextLine();
        while (! String.valueOf(value).matches(REGEX_HEADPHONE_ID)){
            System.out.println("vui long nhap lai.");
            value=scanner.nextLine();
        }
        return value;
    }
    public static String checkRegexChargerId(){
        String value=scanner.nextLine();
        while (! String.valueOf(value).matches(REGEX_CHARGER_ID)){
            System.out.println("vui long nhap lai.");
            value=scanner.nextLine();
        }
        return value;
    }
    public static String checkCharacter(){
        String value=scanner.nextLine();
        while (! String.valueOf(value).matches(REGEX_CHARACTER)){
            System.out.println("vui long nhap lai.");
            value=scanner.nextLine();
        }
        return value;
    }

    public static String checkNum(){
        String value=scanner.nextLine();
        while (! String.valueOf(value).matches(REGEX_NUM)){
            System.out.println("vui long nhap lai.");
            value=scanner.nextLine();
        }
        return value;
    }

}
