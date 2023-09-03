import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr={3,7,34,67,7,347,6,0};
        int rand=0;
        for(int i=0;i<arr.length;i++){
            rand=(int)(Math.random()*i);
            swap(arr,i,rand);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int rand){
        int temp=arr[i];
        arr[i]=arr[rand];
        arr[rand]=temp;
    }
    
}
