
/**
 * Write a description of class Condeza6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza6
{public static void problem6() {
        int[] arr = {1, 2, 3, 5, 8, 11};
        int sum = 0, count = 0;
 
        for (int x : arr) {
            if (x % 2 != 0) {
                sum += x;
                count++;
            }
        }
 
        double avg = (double) sum / count;
        System.out.println("Average of odd numbers = " + avg);
   }
}