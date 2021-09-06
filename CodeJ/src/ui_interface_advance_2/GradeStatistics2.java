package ui_interface_advance_2;

import java.util.ArrayList;

public class GradeStatistics2 {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> grade_Stars;

    public GradeStatistics2(){
        this.grades=new ArrayList<>();
        this.grade_Stars=new ArrayList<>();
    }

    public void add(int num){
        this.grades.add(num);
    }
    public String avg(){
        int sum=0;
        int passing=0;
        int pass_count=0;
        for(int i:grades){
            sum+=i;
            if (i>=50){
                passing+=i;
                pass_count+=1;
            }
        }
        if(pass_count>0){
            System.out.println("Point average (all): "+(1.0*sum)/grades.size());

            System.out.println( "Point average (passing): "+(1.0*(passing/pass_count)));
            return "Pass percentage: "+((100.0*(pass_count))/grades.size());
        }
        System.out.println("Point average (all): "+(1.0*sum)/grades.size());
        System.out.println( "Point average (passing): -");
        return "Pass percentage: 0.0";
    }
    public void addstar(int num){
        if(num>=90){
            this.grade_Stars.add(5);
        }else if(num<50){
            this.grade_Stars.add(0);
        }else if(num>=80 && num<90) {
            this.grade_Stars.add(4);
        }else if(num>=70 && num<80) {
            this.grade_Stars.add(3);
        }else if(num>=60 && num<70) {
            this.grade_Stars.add(2);
        }else if(num>=50 && num<60) {
            this.grade_Stars.add(1);
        }
    }

    public void getGrade(){
        System.out.println( "Grade distribution:");
        System.out.println(grade_Stars);
        for(int i=5;i>-1;i--){
            int count=0;
            for(int star:grade_Stars){
                if(star==i){count+=1;}
            }
            System.out.println(i+": "+printStart(count));
        }
    }
    public String printStart(int num){
        String star="";
        for (int i=0;i<num;i++){
            star+="*";
        }
        return star;
    }

}
