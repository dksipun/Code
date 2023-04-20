import java.util.Objects;

public class queue<V>{
    private int maxSize;
    private V[] arr;
    private int currentSize;
    private int front;
    private int back;

    public queue(int maxSize){
        this.maxSize=maxSize;
        this.currentSize=0;
        this.arr=(V[]) new Object[maxSize];
        this.back=-1;
        this.front=0;
    }
    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }
    public boolean isFull(){
        return this.currentSize==this.maxSize;
    }
    public boolean isEmpty(){
        return this.currentSize==-1;
    }
    public V top(){
        return arr[front];
    }
    public void enqueue(V data){
        if(isFull()){
            System.out.println("Full");
            return;
        }
        back = (back + 1) % maxSize;
        arr[back]=data;
        currentSize++;
    }
    public V dequeue(){
        if(isEmpty()){
            return null;
        }
        V temp= arr[front];
        front=(front+1)%maxSize;
        currentSize--;
        return temp;
    }
}
