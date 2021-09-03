package clock_code_0;

public class StopWatch {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;

    public StopWatch(){
        this.hours=new ClockHand(24);
        this.minutes=new ClockHand(60);
        this.seconds=new ClockHand(60);
    }
    public StopWatch(int hvalue,int mvalue,int svalue){
        this.hours=new ClockHand(24,hvalue);
        this.minutes=new ClockHand(60,mvalue);
        this.seconds=new ClockHand(60,svalue);
    }

    public void advance(){
        this.seconds.advance();
        if(this.seconds.value()==0){
            this.minutes.advance();
            if(this.minutes.value()==0){
                this.hours.advance();
            }
        }
    }

    public String toString(){
        return this.hours+" : "+this.minutes+" : "+this.seconds;
    }
}

