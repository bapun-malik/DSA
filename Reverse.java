//Write a Java function to rotate an array by a given number of positions to the left.
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arr={2,4,6,15,66,0};
        reverse(arr,3);
    }
    public static void reverse(int[] arr,int n){
        int j=0;
        for(int i=n;i>n/2;i--){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
