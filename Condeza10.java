
/**
 * Write a description of class Condeza10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza10
{ public static void problem10() {
        int[] arr = {5, 7, 9, 4, 3};
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("First even number at index " + i);
                return;
            }
        }
    }
}