public class stack <V>{
    private int maxSize;
    private int top;
    private V[] arr;

    public stack(int maxSize){
        this.maxSize=maxSize;
        this.top=-1;
        this.arr=(V[]) new Object[maxSize];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public V top(){
        if(isEmpty()){
            return null;
        }
        return arr[top];
    }
    public void push(V data){
        if(isFull()){
            System.out.println("Full");
            return;
        }
        arr[++top]=data;
    }
    public V pop(){
        if(isEmpty()){
            return null;
        }
//        V temp=arr[top];
//        arr[top--]=null;
//        return temp;
        return arr[top--];

    }

}
