import javax.swing.*;
import java.util.HashSet;

public class SinglyLinkedList<T> {
    public class Node{
        public T data;
        public Node nextNode;
    }
    public Node headNode;
    public int size;

    public SinglyLinkedList(){
        this.headNode=null;
        this.size=0;
    }
    public Node getHeadNode(){
        return this.headNode;
    }
    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }

    public void insertAtHead(T data){
       Node newNode=new Node();
       newNode.data=data;
       newNode.nextNode=headNode;
       headNode=newNode;
       size++;
    }
    public void insertAtEnd(T data){
        if(isEmpty()){
            insertAtHead(data);
        }
        Node tempNode=new Node();
        while (tempNode.nextNode!=null){
            tempNode=tempNode.nextNode;
        }
        Node newNode=new Node();
        newNode.data=data;
        newNode.nextNode=null;
        tempNode.nextNode=newNode;
        size++;
    }

    public void deleteAtHead(){
        if(isEmpty()){
            return;
        }
        headNode=headNode.nextNode;
        size--;
    }
    public void deleteAtVal(T data){
        if(isEmpty()){
            return;
        }
        Node tempNode=headNode;
        if(tempNode.data.equals(data)){
            deleteAtHead();
        }
        Node prevNode=null;
        while (tempNode.data!=null){
            if(tempNode.data.equals(data)){
                prevNode.nextNode=tempNode.nextNode;
                size--;
                tempNode=tempNode.nextNode;
            }else {
                prevNode=tempNode;
                tempNode=tempNode.nextNode;
            }
        }
    }

    public void deleteAtEnd(){
        if(isEmpty()){
            return;
        }
        Node tempNode=headNode;
        if (tempNode.nextNode==null){
            deleteAtHead();
        }
        while (tempNode.nextNode.nextNode!=null){
            tempNode=tempNode.nextNode;
        }
        tempNode.nextNode=tempNode.nextNode.nextNode;
        size--;
    }
    public void insertAfter(T data,T previous){
        Node tempNode=headNode;
        while (tempNode.data!=null){
            if(tempNode.data.equals(previous)){
                Node newNode=new Node();
                newNode.data=data;
                newNode.nextNode=tempNode.nextNode;
                tempNode.nextNode=newNode;
                size++;
            }
        }
    }
    public void removeDuplicatesWithHashing() {
        Node current = this.headNode;
        Node prevNode = this.headNode;
        //will store all the elements that we observe once
        HashSet<T> visitedNodes = new HashSet<T>();

        if (!isEmpty() && current.nextNode != null) {
            while (current != null) {
                //check if already visited then delete this node
                if (visitedNodes.contains(current.data)) {
                    //deleting the node by undating the pointer of previous node
                    prevNode.nextNode = current.nextNode;
                    current = current.nextNode;
                } else {
                    //if node was not already visited then add it to the visited set
                    visitedNodes.add(current.data);
                    //moving on to next element in the list
                    prevNode = current;
                    current = current.nextNode;
                }
            }
        }
    }




}
