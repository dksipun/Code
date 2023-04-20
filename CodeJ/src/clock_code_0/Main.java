package clock_code_0;

import java.util.Timer;

public class Main {
    public static void main(String[] args){
        //StopWatch wallClock=new StopWatch();
        ClockDigital sipunLearnClock=new ClockDigital(3,3,25);
        StopWatch sipunAdvanceClock=new StopWatch(3,9,59);

        while (true){
            System.out.println(sipunAdvanceClock);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            sipunAdvanceClock.advance();
        }

    }

}
