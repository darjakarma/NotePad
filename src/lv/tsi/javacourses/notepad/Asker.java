package lv.tsi.javacourses.notepad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Asker {
    private static Scanner scan = new Scanner(System.in); // запрашивает юзера чтото ввести

    public static String askString(String msg) {
        System.out.print(msg + ": ");
        return scan.next();
    }

    public static int askInt(String msg, int min, int max) {
        for (; ; ) {
            int result = askInt(msg);
            if (result < min || result > max) {
                System.out.printf(
                        "Value should be in range from %d to %d%n", min, max);
            } else {
                return result;
            }
        }
    }

    public static int askInt(String msg) {
        for (; ; ) {
            try {
                System.out.print(msg + ": ");
                return scan.nextInt();
            } catch (InputMismatchException e) {
                var str = scan.next();
                System.out.println(str + " isn't an integer. Please enter integer value");
            }
        }
    }

    public static LocalTime askTime(String msg) {
        for (; ; ) {
            try {
                var strTime = askString(msg + "(" + StringDateTime.TIME_PATTERN + ")");//спрашиваем в виде строки и юзеру указываем необходимый формат времени
                return StringDateTime.timeFromString(strTime);//
            } catch (DateTimeParseException e) {
                System.out.println("Wrong time format");
            }
        }
    }

    public static LocalDate askDate(String msg) {
        for (; ; ) {
            try {
                var strDate = askString(msg + "(" + StringDateTime.DATE_PATTERN + ")");
                return StringDateTime.dateFromString(strDate);
            } catch (DateTimeParseException e) {
                System.out.println("Wrong date format");
            }
        }
    }
}
