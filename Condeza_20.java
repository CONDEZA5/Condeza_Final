
/**
 * Write a description of class Condeza_20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Condeza_20
{ public static void problem20() {
        int[] arr = {10, 22, 35, 40, 15, 28};
 
        for (int x : arr)
            if (x % 2 == 0 && x > 20)
                System.out.println(x);
    }
}