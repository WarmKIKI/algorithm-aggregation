package thread_programming;

public class ThreadB extends Thread{
    private HasSelfPrivateNum hasSelfPrivateNum;
    private Run run;

    public ThreadB(Run run) {
        super();
        this.run = run;
    }

    @Override
    public void run() {
        super.run();
        run.getTicket();
    }
}
