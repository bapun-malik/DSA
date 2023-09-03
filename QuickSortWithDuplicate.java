import java.util.Arrays;

public class QuickSortWithDuplicate{
    public static void main(String[] args) {
        int[] arr={6,8,2,5,1,0,-3,9,2,5,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        QuickSort.shuffleArray(arr);
        sort(arr,0,arr.length-1);
    }
    public static void sort(int[] arr,int low,int high){
        if(low>=high) return;
        int[] partition=partition(arr,low,high);
        sort(arr,low,partition[0]-1);
        sort(arr,partition[1]+1,high);
    }
    public static int[] partition(int[] arr,int low,int high){
        int lt=low;
        int gt=high;
        int pivot=arr[low];
        int i=low;
        while(i<=gt){
            if(arr[i]<pivot){
                QuickSort.swap(arr,i, lt);
                lt++;
                i++;
            }else if(arr[i] >pivot ){
                QuickSort.swap(arr, i, gt);
                gt--;
            }else{
                i++;
            }
        }
        return new int[]{lt,gt};
    }
}