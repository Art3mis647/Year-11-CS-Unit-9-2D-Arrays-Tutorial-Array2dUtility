
import java.util.Arrays;
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] arr) {
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] arr) {
        int count = 0;
        for (int[] i : arr) {
            for (int j : i) {
                count += j;
            }
        }
        return count;
    }

    // 3. average
    public static double average(int[][] arr) {
        int size = arr[0].length;
        return (double) sum(arr) /(size*size);
    }

    // 4. minimum
    public static int minimum(int[][] array) {
        int min = array[0][0];

        for (int[] row : array) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array) {
        int min = array[0][0];

        for (int[] row : array) {
            for (int element : row) {
                if (element > min) {
                    min = element;
                }
            }
        }

        return min;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0) count++;
            }
        }
        return count;
    }


    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] arr) {
        int count = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (j%2==0) count++;
            }
        }
        return count;
    }


    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                if (j<0) return false;
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array) {
        int[] sum = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j<array[i].length;j++){
                sum[i]+=array[i][j];
            }
        }
        return sum;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] array) {
        int[] sum = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j<array[i].length;j++){
                sum[j]+=array[i][j];
            }
        }
        return sum;
    }
}
