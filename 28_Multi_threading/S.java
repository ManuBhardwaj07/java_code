class FRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<40;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class S {
    public static void main(String[] args) throws InterruptedException {
        FRunnable r = new FRunnable();

        Thread t = new Thread(r, "bheem");

        t.start();

        Thread x = Thread.currentThread();

        for(int i=0;i<100;i++) {
            t.sleep(100);
            System.out.println(i + " - " + x.getName());
        }
    }
}
