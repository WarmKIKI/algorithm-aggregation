package thread_programming;

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    // Semaphore 是一个计数信号量，必须由获取它的线程释放。
    //
    Semaphore s1 = new Semaphore(0);
    Semaphore s2 = new Semaphore(0);

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            s2.acquire();
            printFoo.run();
            s1.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            s1.acquire();
            printBar.run();
            s2.release();
        }
    }
}
