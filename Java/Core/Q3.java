class Retreiver extends Thread{
    public void run(){
        fetchData();
    }

    void fetchData(){
        try {
            System.out.print("Fetching data");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println("\nDone!");
        } catch (Exception e) {
            System.out.println("\nTHREAD WAS INTERRUPTED!");
        }
    }
}

class Processor implements Runnable{
    Thread t;
    Processor(){
        this.t = new Thread(this, "Processor Thread");
    }

    public void run(){
        processData();
    }

    void processData(){
        try {
            System.out.print("Processing data");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println("\nDone!");
        } catch (Exception e) {
            System.out.println("\nTHREAD WAS INTERRUPTED!");
        }
    }
}

public class Q3{
    public static void main(String[] args){
        Retreiver retreiver = new Retreiver();
        Processor processor = new Processor();

        try {            
            retreiver.start();
            retreiver.join();
            processor.t.start();
        } catch (InterruptedException e) {
            System.out.println("\nTHREADS WERE INTERRUPTED!");
        }
    }
}