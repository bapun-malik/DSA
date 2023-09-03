class Link{

    private Node head;
    private Node tail;
    
    private int size;

    public int getSize() {
        return size;
    }


    public Link(){
        size=0;
    }


    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=node;
            node.next=null;
        }
        size+=1;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        node.next=null;
        if(head==null){
            head=node;
            tail=node;
        }

        tail.next=node;
        tail=node;

        size+=1;
    }

    public void insertAt(int index,int val){
        Node node=new Node(val);
        Node temp=head;
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size+=1;
    }


    //deletion functionalities
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
        size--;
    }


    public void deleteLast(){
        if(tail==null){
            return;
        }
        Node prev=head;
        Node temp=head;
        for(int i=1;i<size;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        tail=prev;
        size--;
        }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }


    private class Node{
        Node next;
        int val;
        public Node(int i){
            val=i;
        }

        public Node(int i,Node n){
            val=i;
            next=n;
        }
    }
}