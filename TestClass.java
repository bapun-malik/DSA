import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name:");
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        System.out.println("Enter size:");
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Element:");
            arr[i]=Integer.parseInt(br.readLine());
        }
        int temp=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
