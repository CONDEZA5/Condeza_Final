
/**
 * Write a description of class Condeza12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza12
{  public static void problem12() {
        int[] arr = {3, 5, 3, 1, 3, 8};
        int value = 3, count = 0;
 
        for (int x : arr) {
            if (x == value) count++;
            if (count == 3) {
                System.out.println("Value appears at least 3 times.");
                return;
            }
        }
 
        System.out.println("Value does not appear 3 times.");
      }
}