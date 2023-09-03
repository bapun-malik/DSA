public class FindPeak {
    public static void main(String[] args) {
        int[] arr={3,0,1,2,3,10,122};
        System.out.println(peak(arr));
    }
    public static int peak(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
