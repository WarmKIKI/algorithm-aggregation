package thread_programming;

public class ThreadA extends Thread{
        private HasSelfPrivateNum numRef;
        private Run run;

        public ThreadA(Run run) {
            super();
            this.run = run;
        }

        @Override
        public void run() {
            super.run();
            run.getTicket();
        }
}
