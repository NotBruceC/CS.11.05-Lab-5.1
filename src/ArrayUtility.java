import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.round;

public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            result += temp;
        }
        System.out.println(result);
        return result;
    }

    public static double average(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            result += temp;
        }
        double mean = (double) result / array.length;
        mean = Math.floor(mean * 100) / 100.0;
        return mean;
    }

    public static int minimum(int[] array) {
        int smol = 100;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (smol >= temp) {
                smol = temp;
            }
        }
        return smol;
    }

    public static int maximum(int[] array) {
        int big = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (big <= temp) {
                big = temp;
            }
        }
        return big;
    }

    public static int evenCount(int[] array) {
        int challenged = 0;
        for (int temp : array) {
            if (temp % 2 == 0) {
                challenged++;
            }
        }
        return challenged;
    }

    public static int[] reverseOne(int[] array) {
        int j = 0;
        int[] myArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            myArray[j] = array[i];
            j++;
        }
        return myArray;
    }

    // TBD
    public static void reverseTwo(int[] array) {
        int e = 0;
        int end = array.length - 1;

        while (e < end) {
            int temp = array[e];
            array[e] = array[end];
            array[end] = temp;

            e++;
            end--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (str.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            j = array[i];
            int y = j * 2;
            array[i] = y;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            j = array[i];
            int y = j * n;
            array[i] = y;
        }
    }

    public static String toString(int[] array) {
        String result = new String();
        for (int i = 0; i < array.length; i++) {
            if (i != -1 && i != array.length - 1) {
                result = result + array[i] + ", ";
            } else if (i == array.length - 1) {
                result = result + array[i];
            }
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int complement = num - array[i];
            if (set.contains(complement)) {
                return true;
            }
            set.add(array[i]);
        }

        return false;
    }


    public static void shiftRight(int[] array) {
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;
    }

//TBD

    public static void shiftLeft(int[] array) {
        int Element = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }

        array[array.length - 1] = Element;

    }
// TBD
    public static void shiftRightNTimes(int[] array, int n) {

        //  int lastElement = array[array.length - 1];
        //        for (int i = array.length - 1; i > 0; i--) {
        //            array[i] = array[i - 1];
        //        }
        //
        //        array[0] = lastElement; (REFERENCE FROM PRV)

        int length = array.length;
        n = n % length;
        int[] shiftedArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newIndex = (i + (length + n)) % length;
            shiftedArray[newIndex] = array[i];
        }

        for (int i = 0; i < length; i++) {
            array[i] = shiftedArray[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int length = array.length;
        n = n % length;
        int[] shiftedArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newIndex = (i + (length - n)) % length;
            shiftedArray[newIndex] = array[i];
        }

        for (int i = 0; i < length; i++) {
            array[i] = shiftedArray[i];
        }
    }




}
