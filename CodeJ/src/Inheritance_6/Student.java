package Inheritance_6;

public class Student extends Person{
    private int score;

    public Student(String name,String address){
        super(name,address);
        this.score=0;
    }

    public void study(){
        this.score++;
    }
    public int credits(){
        return this.score;
    }
    public String toString(){
        return super.toString()+"\n  "+"Study credits "+this.credits();
    }
}
