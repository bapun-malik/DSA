// write a Java function to remove all duplicates and return the new length.

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={2,4,6,4,2,3,9,3};
        HashSet<Integer> numbers=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            numbers.add(arr[i]);
        }
        System.out.println(numbers.size());
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(arr.length-count);
    }

}
