package ra;

import java.time.Instant;
import java.util.Date;

public class StopWatch {
    // bien
    private Instant startTime;
    private Instant endTime;

    // contructor

    public StopWatch() {
        this.startTime = Instant.now();
    }

    public void start() {
        this.startTime = Instant.now();
    }

    public void stop() {
        this.endTime = Instant.now();
    }

    public double getElapsedTime() {
        return ( this.endTime.toEpochMilli() - this.startTime.toEpochMilli() );
    }

}
