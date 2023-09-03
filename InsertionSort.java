
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr={4,0,4,6,9,-3,5,-12,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){

        int temp=0;

        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }

    }

    
}
