public class CountInversion {
    static int count=0;
    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 2, 0};
        int inversions = count(arr);
        System.out.println(inversions);
    }
    public static int count(int[] arr){
        int[] aux=new int[arr.length];
        divide(arr,aux,0,arr.length-1);
        return -1;
    }
    public static void divide(int[] arr,int[] aux,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        divide(arr,aux,low,mid);
        divide(arr,aux, mid+1, high);
        merge(arr,aux,low,mid,high);
    }

    public static void merge(int[] arr,int[] aux,int low,int mid,int high){
            for(int k=low;k<=high;k++){
                aux[k]=arr[k];
            }
            int i=low;
            int j=mid+1;
            for(int k=low;k<=high;k++){
                if(i<mid){
                    arr[k]=aux[i++];
                    count++;
                }
            }
    }
}
