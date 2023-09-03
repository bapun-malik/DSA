import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,45},{15,28,45,59},{12,35,68,89}};
        System.out.println(Arrays.toString(search(arr,59)));
    }
    public static int[] search(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while(row <arr.length && col > 0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
