package executiveframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CallablesAndFutures {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(3);

        /*
            There are two main overloads of ExecuterService.submit() function:
                1. Accepts a Runanble (A lambda expression that doesn't return any value)
                2. Accepts a Callable (A lambda expression that does return a value)

            In this exmaple, a Callable is being passed in submit() method which returns 1.
            Now, since this callable will run on another thread (not on main thread), how will we get to
            know when the value will return??
            
            This is where Future interface comes into the picture!

            This submit() method returns a future, which has .get() method on it to get the value
            and it will automatically provide us the value that the callable passed will return.
        */

        var val = executor.submit(() -> {
            Utils.waitFor(5000);
            return 1;
        });
        System.out.println("Doing Heavy Processing....");
        try {
            System.out.println(val.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }    
}
