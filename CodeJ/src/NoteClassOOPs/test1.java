package NoteClassOOPs;

public class test1 {
    private int num;
    private String name;

    public test1(int x){
        this.num=x;
    }
    public test1(int num,String name){
        this.num=num;
        this.name=name;
    }
    public void changeName(String name){
        this.name=name;
    }

    public String toString(){
        return this.name+" : "+this.num;
    }
}
