import java.util.Arrays;

public class RecallMergeSort {
    public static void main(String[] args) {
        int[] arr={3,7,8,0,-2,-4,6,9};
        mergeSort(arr);
        System.out.println("After Sorting ..");
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){
        int[] aux=new int[arr.length];
        mergeSort(arr,aux,0,arr.length-1);
    }

    public static void mergeSort(int[] arr,int[] aux,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid+1, high);
        merge(arr,aux,low,mid,high);
    }

    public static void merge(int[] arr,int[] aux,int low,int mid,int high){
        for(int k=low;k<=high;k++){
            aux[k]=arr[k];
        }

        int i=low;
        int j=mid+1;
        for(int k=low;k<=high;k++){
            if(i>mid) arr[k]=aux[j++];
            else if(j>high) arr[k]=aux[i++];
            else if(aux[i]<aux[j]) arr[k]=aux[i++];
            else arr[k]=aux[j++];
        }
    }
}
