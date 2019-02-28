import java.time.LocalTime;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
        long startTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        StopWatch ex1 = new StopWatch();

        int count = 0;
        ex1.start();
        for (int i = 0; i < 1000000; i++) {
            System.out.println("i" + i);
        }
        ex1.stop();

        System.out.println("time: " + ex1.getElapsedTime()+"millisecond");
    }


    long getStartTime() {
        return startTime;
    }

    long getEndTime() {
        return endTime;
    }

    void start() {
        startTime = System.currentTimeMillis();
    }

    void stop() {
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return endTime - startTime;
    }
}
