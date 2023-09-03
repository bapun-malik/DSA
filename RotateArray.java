// Given an array, rotate it to the right by k steps, where k is non-negative.

// Example:
// Input: [1, 2, 3, 4, 5, 6, 7], k = 3
// Output: [5, 6, 7, 1, 2, 3, 4]
import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr, k, n-1);
        reverse(arr,0,k-1);
    }
    public static void reverse(int[] arr,int start,int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}