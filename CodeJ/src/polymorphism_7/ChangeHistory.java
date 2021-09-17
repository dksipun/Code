package polymorphism_7;

import java.util.ArrayList;

public class ChangeHistory{
    private ArrayList<Double> changeHistory;

    public ChangeHistory(){
        this.changeHistory=new ArrayList<>();
    }
    public double maxValue(){
        double m=0;
        for(double i:this.changeHistory){
            if(i>m){m=i;}
        }
        return m;
    }
    public double minValue(){
        double m=0;
        if(this.changeHistory.size()==0){
            return m;
        }else {m=this.changeHistory.get(0);}

        for(double i:this.changeHistory){
            if(i<m){m=i;}
        }
        return m;
    }
    public double average(){
        double avg=0.0;
        if(this.changeHistory.size()==0){
            return avg;
        }
        for(double i:this.changeHistory) {
            avg += i;
        }
        return avg/this.changeHistory.size();
    }
    public void add(double status){
        this.changeHistory.add(status);
    }
    public void clear(){
        this.changeHistory.clear();
    }

    public String toString(){
        return this.changeHistory+"";
    }

}
