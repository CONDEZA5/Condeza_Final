
/**
 * Write a description of class Condeza18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Condeza18
{public static void problem18() {
        int[] arr = {4, 7, 2, 7, 9};
 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    return;
                }
            }
       }
}}