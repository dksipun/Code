public class DoublyLinkedList<T> {
    public class Node{
        public T data;
        public Node nextNode;
        public Node prevNode;
    }
    public Node headNode;
    public Node tailNode;
    public int size;

    public DoublyLinkedList(){
        this.headNode=null;
    }
    public Node getHeadNode(){
        return this.headNode;
    }
    public Node getTailNode(){
        return this.tailNode;
    }
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        if(this.headNode==null){
            return true;
        }
        return false;
    }
    public void insertAtHead(T data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.nextNode=headNode;
        newNode.prevNode=null;

        if(headNode!=null){
            headNode.prevNode=newNode;
        }

        headNode=newNode;
        size--;
    }
    public void insertAtEnd(T data){
        if(isEmpty()){
            insertAtHead(data);
        }

        Node tempNode=headNode;
        while (tempNode!=null){
            tempNode=tempNode.nextNode;
        }

        Node newNode=new Node();
        newNode.data=data;

        tempNode.nextNode=newNode;
        newNode.prevNode=tempNode;
        tempNode.nextNode=null;
        size++;
    }

    public void deleteAtHead(){
        if(isEmpty()){
            return;
        }
        headNode=headNode.nextNode;
        headNode.prevNode=null;
        size--;
    }

    public void deleteByValue(T data){
        Node tempNode=headNode;
        if(tempNode.data.equals(data)){
            tempNode=tempNode.nextNode;
            tempNode.prevNode=null;
            size--;
        }
        while (tempNode!=null){
            if(tempNode.data.equals(data)){
                tempNode.prevNode.nextNode=tempNode.nextNode;
                if(tempNode.nextNode!=null) {
                    tempNode.nextNode.prevNode = tempNode.prevNode;
                }
                size--;
            }
            tempNode=tempNode.nextNode;
        }
    }

    public void printList(){
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = headNode;
        System.out.print("List : null <- ");

        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " <-> ");
            temp = temp.nextNode;
        }

        System.out.println(temp.data.toString() + " -> null");
    }

    /*public void insertAtEndTail(T data) {
        if (isEmpty()) { //if list is empty then insert at head
            insertAtHead(data);
            return;
        }
        //make a new node and assign it the value to be inserted
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null; //it will be inserted at end so nextNode will be null
        newNode.prevNode = tailNode; //newNode comes after tailNode so its prevNode will be tailNode
        tailNode.nextNode = newNode; //make newNode the nextNode of tailNode
        tailNode = newNode; //update tailNode to be the newNode
        size++;
    }*/
    /*public void deleteAtEndTail(){
        if(isEmpty()){
            return;
        }
        tailNode=tailNode.prevNode;
        if(tailNode==null){
            headNode=null;
        }else {
            tailNode.nextNode=null;
        }
        size--;
    }*/
    public static <T> boolean isPalindrome(DoublyLinkedList<T> list) {
        //Write Your Code Here
        DoublyLinkedList<T>.Node temp1=list.getHeadNode();
        DoublyLinkedList<T>.Node temp2=list.getTailNode();
        int count=list.getSize()/2;
        System.out.println(count);

        while(count>0){
            // if(temp1==null || temp2 ==null){
            //     return false;
            // }
            if(temp1.data==temp2.data){
                temp1=temp1.nextNode;
                temp2=temp2.prevNode;
            }else{
                return false;
            }
            count--;
        }
        return true;
    }
}
