
/**
 * Write a description of class Condeza7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza7
{public static void problem7() {
        int[] arr = {-5, 3, -2, 8, -9};
 
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                arr[i] = -arr[i];
 
        System.out.println(Arrays.toString(arr));
   }}
