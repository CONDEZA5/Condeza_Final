
/**
 * Write a description of class Condeza5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza5
{public static void problem5() {
        int[] arr = {2, 4, 9, 7, 1, 10};
        int find = 7;
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Found at index " + i);
                break;
            }
        }
     }
}