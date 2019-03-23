package system;


public class Timer extends Thread {
    private boolean continued;
    private boolean paused;
    private int interval;
    private long tick;

    public Timer(Runnable target, int interval) {
        super(target);
        tick = 0;
        continued = true;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (continued) {
            if (!paused) super.run();
            tick++;
            CPU.sleep(interval);
        }
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void kill() {
        continued = false;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public boolean isPaused() {
        return paused;
    }

    public long getTick() {
        return tick;
    }
}
