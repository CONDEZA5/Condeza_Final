
/**
 * Write a description of class Condeza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
 
public class Condeza {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        // You may call any method here to test them.
        // Example:
        // problem1(in);
        // problem2();
        // problem3();
 
    }
 
    // 1. Repeatedly ask the user until value 1–100
    public static void problem1(Scanner in) {
        int num;
        do {
            System.out.print("Enter a number (1-100): ");
            num = in.nextInt();
        } while (num < 1 || num > 100);
 
        System.out.println("Valid input: " + num);
    }
 
    // 2. Count how many times 7 appears
    public static void problem2() {
        int[] arr = {7, 3, 7, 4, 7, 2, 1, 7, 9, 7};
        int count = 0;
 
        for (int x : arr)
            if (x == 7)
                count++;
 
        System.out.println("Number of 7's: " + count);
    }
 
    // 3. Triangle of stars (5 lines)
    public static void problem3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
 
    // 4. Smallest and largest number (one loop)
    public static void problem4() {
        int[] arr = {5, 8, 2, 10, -4, 7};
        int min = arr[0], max = arr[0];
 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
 
        System.out.println("Min = " + min + ", Max = " + max);
    }
 
    // 5. Stop loop when value is found
    public static void problem5() {
        int[] arr = {2, 4, 9, 7, 1, 10};
        int find = 7;
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
 
    // 6. Average of all odd numbers
    public static void problem6() {
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
 
    // 7. Convert negative numbers to positive
    public static void problem7() {
        int[] arr = {-5, 3, -2, 8, -9};
 
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                arr[i] = -arr[i];
 
        System.out.println(Arrays.toString(arr));
    }
 
    // 8. Copy Array A into B
    public static void problem8() {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];
 
        for (int i = 0; i < A.length; i++)
            B[i] = A[i];
 
        System.out.println(Arrays.toString(B));
    }
 
    // 9. Add user inputs until 0, then show sum
    public static void problem9(Scanner in) {
        int sum = 0, num;
 
        while (true) {
            System.out.print("Enter number (0 to stop): ");
            num = in.nextInt();
            if (num == 0) break;
            sum += num;
        }
 
        System.out.println("Sum = " + sum);
    }
 
    // 10. Index of first even number
    public static void problem10() {
        int[] arr = {5, 7, 9, 4, 3};
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("First even number at index " + i);
                return;
            }
        }
    }
 
    // 11. Display even-index elements
    public static void problem11() {
        int[] arr = {10, 20, 30, 40, 50};
 
        for (int i = 0; i < arr.length; i += 2)
            System.out.println(arr[i]);
    }
 
    // 12. Check if a value appears at least 3 times
    public static void problem12() {
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
 
    // 13. Count passed (≥75) and failed (<75)
    public static void problem13() {
        int[] grades = {80, 65, 90, 72, 88};
        int pass = 0, fail = 0;
 
        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }
 
        System.out.println("Passed: " + pass + " | Failed: " + fail);
    }
 
    // 14. Print array in reverse
    public static void problem14() {
        int[] arr = {1, 2, 3, 4, 5};
 
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
 
    // 15. Ask user 5 numbers, then show numbers >50
    public static void problem15(Scanner in) {
        int[] arr = new int[5];
 
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
 
        System.out.println("Numbers greater than 50:");
        for (int x : arr)
            if (x > 50)
                System.out.println(x);
    }
 
    // 16. Count digits in a number
    public static void problem16(Scanner in) {
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int count = 0;
 
        while (num > 0) {
            num /= 10;
            count++;
        }
 
        System.out.println("Digits: " + count);
    }
 
    // 17. Second highest number
    public static void problem17() {
        int[] arr = {5, 9, 1, 7, 6};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
 
        for (int x : arr) {
            if (x > highest) {
                second = highest;
                highest = x;
            } else if (x > second && x != highest) {
                second = x;
            }
        }
 
        System.out.println("Second highest = " + second);
    }
 
    // 18. Check for duplicate values
    public static void problem18() {
        int[] arr = {4, 7, 2, 7, 9};
 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    return;
                }
            }
        }
 
        System.out.println("No duplicates.");
    }
 
    // 19. Match student names with grades
    public static void problem19() {
        String[] names = {"Ana", "Ben", "Cara"};
        int[] grades = {85, 92, 78};
 
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + " = " + grades[i]);
    }
 
    // 20. Print even numbers >20
    public static void problem20() {
        int[] arr = {10, 22, 35, 40, 15, 28};
 
        for (int x : arr)
            if (x % 2 == 0 && x > 20)
                System.out.println(x);
    }
}
