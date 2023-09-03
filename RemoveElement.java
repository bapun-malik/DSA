
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={2,5,2,8,2,3,4,6,3};
        
        System.out.println(remove(arr,2));
    }
    public static int remove(int[] arr,int n){
        int left=0;
        int right=0;
        for(;left<arr.length;){
            if(arr[left]==n){
                left++;
            }else{
                arr[right]=arr[left];
                left++;
                right++;
            }
        }
        return right;
    }
}
