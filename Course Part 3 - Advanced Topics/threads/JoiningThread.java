package threads;

public class JoiningThread {
    public static void main(String[] args) {
        Thread imageProcessingThread = new Thread(new HeavyProcessing());
        imageProcessingThread.start();

        try {

            // This .join() method means that this current function's thread will wait for imageProcessingThread to complete, 
            // and only after that, this function's further exection (print: Back to main code) will get executed.

            imageProcessingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Back to main code");
    }
}