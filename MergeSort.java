// import java.util.Arrays;

// public class MergeSort {
//     public static void main(String[] args) {
//         int[] arr={4,6,2,7,8,0,-2,5,-4,-1};
//         mergeSort(arr);

//         System.out.println(Arrays.toString(arr));
        
//     }
//     public static void  mergeSort(int[] arr){
//         int[] aux=new int[arr.length];
//         mergeSort(arr,aux,0,arr.length-1); 

//     }

//     public static void mergeSort(int[] arr,int[] aux,int low,int high){
//         if(low>=high){
//             return;
//         }
//         int mid=low+(high-low)/2;
//         mergeSort(arr, aux, low, mid);
//         mergeSort(arr, aux, mid+1, high);
//         merge(arr,aux,low,mid,high);
//     }
//     public static void merge(int[] arr,int[] aux,int low,int mid,int high){
//         for(int k=low;k<high;k++){
//             aux[k]=arr[k];
//         }
//         int i=0;
//         int j=mid+1;
//         for(int k=low;k<=high;k++){
//             if(i>mid) arr[k]=aux[j++];
//             else if(j>high) arr[k]=aux[i++];
//             else if(aux[i]<aux[j]) arr[k]=aux[i++];
//             else arr[k]=arr[j++];
//         }
//     }
// }

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 7, 8, 0, -2, 5, -4, -1};
        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] aux, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid + 1, high);
        merge(arr, aux, low, mid, high);
    }

    public static void merge(int[] arr, int[] aux, int low, int mid, int high) {
        for (int k = low; k <= high; k++) {
            aux[k] = arr[k];
        }
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > high) {
                arr[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }
}
