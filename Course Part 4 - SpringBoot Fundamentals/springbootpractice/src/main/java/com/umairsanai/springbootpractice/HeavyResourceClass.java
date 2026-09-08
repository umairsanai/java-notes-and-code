package com.umairsanai.springbootpractice;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 


/*
    If we don't put Lazy here, Spring will initialize it in the very start
    of the program by itself. If some class is costly to create 
    (consumes too much resources or memory), then we do Lazy loading
    with it for the sake of optimization. Now, it gets initialized when it's requested
    through the "context" from the IOC Container.


    But, not only the annotation before the class is needed just like this,
    the same annotation on the producer function will also be needed
    (the producer which will produce this class, probably found in AppConfig.java)

*/
@Lazy 
public class HeavyResourceClass {
    public HeavyResourceClass() {
        System.out.println("\n\n\n");
        System.out.println("Heavy Resource Initialized!");
        System.out.println("\n\n\n");
    }
}
