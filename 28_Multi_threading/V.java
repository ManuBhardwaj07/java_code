class YThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println("start - " + x.getName());
        try {
            for(int i=0;i<10;i++) {
                System.out.println(i + " - " + x.getName());
                if(i==5)
                    Thread.sleep(1000);    
            }

        } catch(InterruptedException e) {   e.printStackTrace();   }
            
        System.out.println("end - " + x.getName());
    }
}

class V {
    public static void main(String[] args) {
        YThread t = new YThread();

        t.setName("indrverma");

        t.start();

        for(int i=0;i<10;i++) {
            Thread x = Thread.currentThread();
            System.out.println(i + " - " + x.getName());
            if(i==5)
                t.interrupt();        
        }
    }
}