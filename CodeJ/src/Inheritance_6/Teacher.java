package Inheritance_6;

public class Teacher extends Student{
    private int salary;

    public Teacher(String name,String address,int salary){
        super(name,address);
        this.salary=salary;
    }
    public int getSal(){
        return this.salary;
    }

    public String toString(){
        return super.toString()+"\n  "+"salary "+this.salary+" euro/month";
    }
}
