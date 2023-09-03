public class MyArray<T>{
    private static int counter=0;
    private int SIZE=10;
    private Object[] arr;
    MyArray(){
        arr=new Object[SIZE];
    }
    public void add(T arg){
        arr[counter++]=arg;
    }
    public static void main(String[] args) {
        MyArray<Integer> arr=new MyArray<>();
        arr.add(20);
    }

}
