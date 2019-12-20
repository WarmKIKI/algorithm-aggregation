package thread_programming;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Run run1 = new Run();
       // Run run2 = new Run();
        ThreadA threadA = new ThreadA(run1);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(run1);
        threadB.setName("B");
        threadB.start();
    }
}
