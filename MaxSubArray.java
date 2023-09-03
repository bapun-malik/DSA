public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr={-2, -3, -4,  -2,  -5, -4};
        System.out.println(maxsub(arr));
    }
    public static int maxsub(int[] arr){
            int cs=arr[0];
            int ms=arr[0];
            int tempstart=0;
            int start=0;
            int end=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>cs+arr[i]){
                    tempstart=i;
                    cs=arr[i];
                }else{
                    cs+=arr[i];
                }
                if(cs>ms){
                    ms=cs;
                    end=i;
                    start=tempstart;
                }
            }
            System.out.println("The subarray:");
            for(int i=start;i<=end;i++){
                System.out.print(arr[i] +" ");
            }
        System.out.println();

            return ms;
    }
}
