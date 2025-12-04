
/**
 * Write a description of class Condeza_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza_1
{ 
    public static void problem1(Scanner in) {
        int num;
        do {
            System.out.print("Enter a number (1-100): ");
            num = in.nextInt();
        } while (num < 1 || num > 100);
 
        System.out.println("Valid input: " + num);
    }}