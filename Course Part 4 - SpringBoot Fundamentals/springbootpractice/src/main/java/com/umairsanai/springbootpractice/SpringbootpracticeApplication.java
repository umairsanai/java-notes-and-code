package com.umairsanai.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.umairsanai.springbootpractice.OrderSystem.OrderService;

@SpringBootApplication
public class SpringbootpracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootpracticeApplication.class, args);

		/*
			Now, in a small project it might not feel overwhelming, but it does
			become a headache in bigger projects manging the instantiation of
			objects and passing it them through dependency injection like this 
			all the time.

			OrderService order = new OrderService(new StripePaymentService());
			order.processOrder();


			So, we use Spring frameowrk's IOC Container:
			
			var orderService = context.getBean(OrderService.class);
			orderService.placeOrder();
			*/
			
			/*
			package: com.umairsanai.springbootpractice.NotificationSystem
			
			EXERCISE:
			var notificationManager = context.getBean(NotificationManager.class);
			notificationManager.sendNotification("Congrats! $10,000 credited into your account.");
			
			*/
			
			
		System.out.println("\n\n\n\n");			
			
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
		
		System.out.println("\n\n\n\n");
	}

}
