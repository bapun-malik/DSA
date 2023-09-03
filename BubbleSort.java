import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,6,7,2,6,8,20,1};
        System.out.println("Before Bubble sort:");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting :");
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
