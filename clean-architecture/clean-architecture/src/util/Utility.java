package util;

import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);
    public static String input(String info){
        System.out.print( info+" : " );
        String data = scanner.nextLine();
        return data;
    }
}
