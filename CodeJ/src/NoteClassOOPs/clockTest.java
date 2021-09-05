package NoteClassOOPs;

public class clockTest {
    private int time;
    private int limit;

    public clockTest(int limit){
        this.time=0;
        this.limit=limit;
    }
    public clockTest(int time,int limit){
        this.time=time;
        this.limit=limit;
    }

    public void advance(){
       if (this.time>=this.limit){
           this.time=0;
       }else{
           this.time++;
       }

    }

    public int getTime(){
        return this.time;
    }
    public String printTime(){
        if(this.time<10){
            return "0"+this.time;
        }else {
            return ""+this.time;
        }
    }


}
