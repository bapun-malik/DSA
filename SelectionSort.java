import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={-33,5,-13,0,2,5,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                   minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
