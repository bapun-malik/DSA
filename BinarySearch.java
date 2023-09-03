public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={3,6,8,12,14,17,34,72,79,85,89,100};
        System.out.println("present at "+search(arr,170,0,arr.length-1));
    }

    // public static int search(int[] arr,int num){
    //     int left=0;
    //     int right=arr.length-1;
    //     while(left<=right){
    //         int mid=left+(right-left)/2;
    //         if(arr[mid]==num){
    //             return mid;
    //         }
    //         if(arr[mid]>num){
    //             right=mid-1;
    //         }else{
    //             left=mid+1;
    //         }
    //     }
    //     return -1;
    // }

    public static int search(int[] arr,int num,int start,int end){
        int mid=start+(end-start)/2;
        if(end>=start){

            if(arr[mid]==num){
                return mid;
            }
            search(arr, num, start,mid-1);
            search(arr, num, mid+1, end);
        }
        return -1;
    }
}

