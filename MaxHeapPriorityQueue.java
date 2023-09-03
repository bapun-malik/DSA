import java.util.Arrays;

public class MaxHeapPriorityQueue{
    private static int n=0;
     static int[] arr=new int[10];
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(-20);
        insert(30);
        insert(5);
        insert(1);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int val){
        arr[++n]=val;
        swim(n);
    }

    public static int delMax(){
        int key=arr[1];
        exchange(1,n--);
        sink(1);
        return key;
    }
    public static void swim(int k){
        while(k>1 && arr[k/2]<arr[k] ){
            exchange(k,k/2);
            k=k/2;
        }
    }

    public static void sink(int k){
        n--;
        while(2*k<=n){
            int j=2*k;
            if(j<n && arr[j]<arr[j+1]) j++;
            if(arr[k]>arr[j]) break;
                exchange(k,j);
                k=j;
        }
    }
    public static void exchange(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void sort(){
        for(int k=n/2;k>1;k--){
            sink(k);
            while(n>1){
                exchange(1, n);
                sink(1);
            }
        }
    }
}