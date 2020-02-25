package base_knowledge;

public class TryCatchFinally {

    public static void main(String[] args) {
        TryCatchFinally tmp = new TryCatchFinally();
        System.out.println("tryReturnCatchFinally() is " + tmp.tryReturnCatchFinally());
        System.out.println("tryReturnCatchFinallyReturn() is " + tmp.tryReturnCatchFinallyReturn());
        System.out.println("tryCatchReturnFinallyReturn() is " + tmp.tryCatchReturnFinallyReturn());
        System.out.println("tryCatchReturnFinally() is " + tmp.tryCatchReturnFinally());
    }

    public boolean tryReturnCatchFinally() {
        try {
            return true;
        } catch (Exception e) {

        } finally {
            System.out.println("ok");
        }
        return false;
    }

    public boolean tryReturnCatchFinallyReturn() {
        try {
            return true;
        } catch (Exception e) {

        } finally {
            System.out.println("ok");
            return false;
        }
    }

    public boolean tryCatchReturnFinallyReturn() {
        try {
            int i = 3 / 0;
        } catch (Exception e) {
            return false;
        } finally {
            System.out.println("ok");
            return true;
        }
    }

    public boolean tryCatchReturnFinally() {
        try {
            int i = 3 / 0;
        } catch (Exception e) {
            return false;
        } finally {
            System.out.println("ok");
        }
        return true;
    }

}
