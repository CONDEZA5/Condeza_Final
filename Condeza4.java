
/**
 * Write a description of class Condeza4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza4
{public static void problem4() {
        int[] arr = {5, 8, 2, 10, -4, 7};
        int min = arr[0], max = arr[0];
 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
     }
}}