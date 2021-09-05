package NoteClassOOPs;

public class clockHand {
    private clockTest hour;
    private clockTest min;
    private clockTest sec;

    public clockHand(){
        this.hour=new clockTest(0,24);
        this.min=new clockTest(0,59);
        this.sec=new clockTest(0,59);
    }
    public clockHand(int hour,int min,int sec){
        this.hour=new clockTest(hour,24);
        this.min=new clockTest(min,59);
        this.sec=new clockTest(sec,59);
    }

    public void advance(){
        this.sec.advance();
        if(this.sec.getTime()==0){
            this.min.advance();
            if(this.min.getTime()==0){
                this.hour.advance();
            }
        }
    }
    public void clockSleep(){
        try{
            Thread.sleep(1000);
        }catch (Exception E){}
    }

    public String toString(){
        return this.hour.printTime()+":"+this.min.printTime()+":"+this.sec.printTime();
    }

}
