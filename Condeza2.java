
/**
 * Write a description of class Condeza1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza2

{public static void problem2() {
        int[] arr = {7, 3, 7, 4, 7, 2, 1, 7, 9, 7};
        int count = 0;
 
        for (int x : arr)
            if (x == 7)
                count++;
 
        System.out.println("Number of 7's: " + count);
     }
}