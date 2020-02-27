package lv.tsi.javacourses.notepad;

import java.util.Scanner;

public class Asker {
    private static Scanner scan = new Scanner(System.in); // запрашивает юзера чтото ввести

    public static String askString(String msg) {
        System.out.print(msg + ": ");
        return scan.next();
    }

    public static int askInt(String msg) { // для целых чисел!!!!! ВСЕГДА 'int'
        System.out.print(msg + ": ");
        return scan.nextInt();
    }
}
