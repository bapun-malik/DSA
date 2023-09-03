public class Demo {
    public static void main(String[] args) {
        Link ll=new Link();
        ll.insertFirst(5);
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.insertLast(50);
        ll.insertFirst(0);
        ll.insertAt(3, 40);
        ll.display();
        System.out.println("\nSize:"+ll.getSize());
        ll.deleteFirst();
        ll.deleteFirst();
        ll.deleteLast();
        ll.display();
        System.out.println("\nSize:"+ll.getSize());

    }
}