package thread_programming;

public class Run {
    private int i = 30;

    synchronized public void getTicket() {
        while(i > 0) {
            System.out.println(Thread.currentThread().getName() + "......" + i--);
        }
    }
}
