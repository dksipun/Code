import com.sun.source.tree.BinaryTree;

import java.util.HashMap;
public class LinkedListMain {
    public static void main(String[] args){
        SinglyLinkedList<Integer> sll=new SinglyLinkedList<Integer>();


        DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();

        for(int i = 1; i <= 10; i++) {
            dll.insertAtHead(i);
        }
        System.out.print("Original ");
        dll.printList();
        System.out.print("After deleting 10 ");
        dll.deleteByValue(10);
        dll.printList();
        System.out.print("After deleting 1 ");
        dll.deleteByValue(1);
        dll.printList();
        System.out.print("After deleting 5 ");
        dll.deleteByValue(5);
        dll.printList();

    }
    public static <T> void reverse(SinglyLinkedList<T> list){
        SinglyLinkedList<T>.Node prev = null; //To keep track of the previous element, will be used in swapping links
        SinglyLinkedList<T>.Node current = list.headNode; //firstElement
        SinglyLinkedList<T>.Node next = null;

        //While Traversing the list, swap links
        while (current != null) {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }
        //Linking Head Node with the new First Element
        list.headNode = prev;
    }
    public static <T> boolean detectLoop(SinglyLinkedList<T> list) {
        //Write -- Your -- Code
        if(list.isEmpty()){
            return false;
        }
        SinglyLinkedList<T>.Node temp=list.headNode;
        SinglyLinkedList<T>.Node currentNode=list.headNode;
        while(currentNode!=null){
            if(temp==currentNode.nextNode){
                return true;
            }
            currentNode=currentNode.nextNode;

        }
        return false;
    }
    public static <T> boolean detectLoopEffective(SinglyLinkedList<T> list) {
        //Write -- Your -- Code
        if(list.isEmpty()){
            return false;
        }
        SinglyLinkedList<T>.Node slow=list.headNode;
        SinglyLinkedList<T>.Node fast=list.headNode;

        while(slow != null && fast != null && fast.nextNode != null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static <T> Object findMiddle(SinglyLinkedList<T> list) {
        //if list is empty, then return null
        if (list.isEmpty())
            return null;

        //both nodes start from the head
        SinglyLinkedList.Node mid = list.headNode;
        SinglyLinkedList.Node current = list.headNode;

        while(mid != null && current != null && current.nextNode != null)
        {
            //current jumps 2 nodes on each iteration
            current = current.nextNode.nextNode;
            //if current is not null (end of list is not reached)
            if(current != null){
                //then mid jumps 1 node
                //mid is always halfway behind current
                mid = mid.nextNode;
            }
        }
        return mid.data;
    }
    public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        // Write -- Your -- Code
        SinglyLinkedList<T>.Node tempNode=list.headNode;
        HashMap<T,Integer> duplicate=new HashMap<>();
        while(tempNode!=null){
            //System.out.print(tempNode.data);
            if(duplicate.containsKey(tempNode.data)){
                duplicate.put(tempNode.data,duplicate.get(tempNode.data)+1);
            }else{
                duplicate.put(tempNode.data,0);
            }
            tempNode=tempNode.nextNode;
        }
        //System.out.println(duplicate);
        tempNode=list.headNode;
        SinglyLinkedList<T>.Node prevNode=null;
        SinglyLinkedList<T>.Node holdNode=null;
        while(tempNode!=null){
            if(duplicate.containsKey(tempNode.data)){
                duplicate.remove(tempNode.data);
                prevNode=tempNode;
                tempNode=tempNode.nextNode;
            }else{
                //holdNode.nextNode=tempNode.nextNode;
                tempNode=tempNode.nextNode;
                if(holdNode!=prevNode){
                    holdNode=prevNode;
                    prevNode.nextNode=tempNode;
                }else{
                    holdNode.nextNode=tempNode;
                }
            }
        }
    }
    public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();
        // Write -- Your -- Code

        HashMap<T,Integer> validator=new HashMap<>();
        getDatainHashMap(list1,validator);
        getDatainHashMap(list2,validator);

        for(T data:validator.keySet()){
            result.insertAtEnd(data);
        }
        return result;
    }

    public static <T> void getDatainHashMap(SinglyLinkedList<T> list,HashMap<T,Integer> validator){
        SinglyLinkedList<T>.Node tempNode=list.getHeadNode();
        while(tempNode!=null){
            if(validator.containsKey(tempNode.data)){
                validator.put(tempNode.data,validator.get(tempNode.data)+1);
            }else{
                validator.put(tempNode.data,0);
            }
            tempNode=tempNode.nextNode;
        }
    }

    //performs intersection between list
    public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();

        // Write -- Your -- Code
        HashMap<T,Integer> validator=new HashMap<>();
        getDatainHashMap(list1,validator);
        getDatainHashMap(list2,validator);

        for(T data:validator.keySet()){
            if(validator.get(data)>0){
                result.insertAtEnd(data);
            }
        }
        return result;
    }

}

