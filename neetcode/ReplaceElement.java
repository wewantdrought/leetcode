package neetcode;
import java.util.Arrays;

/*
You are given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

Example 1:

Input: arr = [2,4,5,3,1,2]

Output: [5,5,3,2,2,-1]
Example 2:

Input: arr = [3,3]

Output: [3,-1]
Constraints:

1 <= arr.length <= 10,000
1 <= arr[i] <= 100,000
 */

public class ReplaceElement {
    public int findMax(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int[] replaceElements(int[] arr) {
        for (int k = 0; k < arr.length; ++k) {
            if (k == arr.length - 1) {
                arr[k] = -1;
                break;
            }
            //System.out.println(Arrays.toString(Arrays.copyOfRange(arr, k + 1 , arr.length)));
            arr[k] = findMax(Arrays.copyOfRange(arr, k + 1 , arr.length));
        }
        return arr;
    }

    public static void main(String[] args) {
        ReplaceElement solution = new ReplaceElement();
        int[] arr = {2,4,5,3,1,2};
        //int[] arr2 = {1, 2};
        //System.out.println(solution.findMax(arr2));
        System.out.println(Arrays.toString(solution.replaceElements(arr)));
    }
}
