
/**
 * Write a description of class Condeza13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza13
{public static void problem13() {
        int[] grades = {80, 65, 90, 72, 88};
        int pass = 0, fail = 0;
 
        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }
 
        System.out.println("Passed: " + pass + " | Failed: " + fail);
     }
}