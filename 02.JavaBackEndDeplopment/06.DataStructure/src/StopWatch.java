import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {

    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }



}
