package thread_programming;

import java.util.function.IntConsumer;

public class FizzBuzz {
    private int n;

    private int flag = 1;

    private static final Object LOCK = new Object();

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(flag <= n) {
            synchronized (LOCK) {
                if(flag%3 == 0 && flag%15 != 0) {
                    printFizz.run();
                    flag++;
                    LOCK.notifyAll();
                } else {
                    LOCK.wait();
                }
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(flag <= n) {
            synchronized (LOCK) {
                if(flag%5 == 0 && flag% 15 != 0) {
                    printBuzz.run();
                    flag++;
                    LOCK.notifyAll();
                } else {
                    LOCK.wait();
                }
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(flag <= n) {
            synchronized (LOCK) {
                if(flag%15 ==0) {
                    printFizzBuzz.run();
                    flag++;
                    LOCK.notifyAll();
                } else {
                    LOCK.wait();
                }
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(flag <= n) {
            synchronized (LOCK) {
                if(flag % 3 != 0 && flag % 5 != 0) {
                    printNumber.accept(flag);
                    flag++;
                    LOCK.notifyAll();
                } else {
                    LOCK.wait();
                }
            }
        }
    }
}
