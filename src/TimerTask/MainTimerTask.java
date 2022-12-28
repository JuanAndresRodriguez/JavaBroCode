package TimerTask;
import java.time.Year;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainTimerTask {
    public static void main(String[] args) {
        // Timer = A facility fo threads to schedule tasks
        //         for future execution in a backgorund thread

        // TimerTask = A task that can be scheduled for one-time
        //             or repeated execution by a Timer

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run(){
                if (counter > 0){
                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }

            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2022);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,27);
        date.set(Calendar.HOUR_OF_DAY,18);
        date.set(Calendar.MINUTE,48);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);
        // timer.schedule(task, 3000); // waits 3 seconds
        // timer.schedule(task, date.getTime()); // executes task on fixed date
        // timer.scheduleAtFixedRate(task, 0, 1000); // waits 1 second and executes timer repeatedly
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }
}
