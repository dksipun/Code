package clock_code_0;

public class ClockDigital {
    private int hours;
    private int min;
    private int sec;

    public ClockDigital(int hours,int min,int sec){
        this.hours=hours;
        this.min=min;
        this.sec=sec;
    }
    public ClockDigital(){
        this.hours=0;
        this.min=0;
        this.sec=0;
    }


    public void advance(){
        this.sec++;
        if(this.sec >=59){
            this.sec=0;
            this.min++;
            if(this.min>=59){
                this.min=0;
                this.hours++;
                if (this.hours>=23){
                    this.hours=0;
                }
            }
        }
    }

    public String toString(){
        return this.hours+":"+this.min+":"+this.sec;
    }

}
