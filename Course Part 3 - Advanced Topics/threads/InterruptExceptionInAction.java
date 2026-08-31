package threads;

public class InterruptExceptionInAction {
    public static void main(String[] args) {
        System.out.println("\n\n\n");

        var t1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted....\n\n\n");
                e.printStackTrace();
            }
        }); 

        var t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                t1.interrupt();
            } catch (InterruptedException e) {
                System.out.println("Shittt....\n\n\n");
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        System.out.println("\n\n\n");
    }   
}
