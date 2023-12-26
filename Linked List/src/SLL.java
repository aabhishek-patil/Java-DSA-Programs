public class SLL {

    private Node head;
    private Node tail;
    private int size;
    public SLL(int size){
        this.size=0;
    }

    //insert using recursion

    public void insertRecursion(int val, int index){
        Node node = new Node(val);

    }
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
     }

     public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
     }

     public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp= head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        Node node= new Node(val, temp.next);
        temp.next=node;
        size++;
     }

     public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
     }
     public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
         System.out.println("END");
     }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
                this.value=value;
                this.next=next;
        }
    }
}
