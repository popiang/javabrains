package com.popiang;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed in thread");
			}
			
		});
		
		thread.run();
		
		Thread lambdaThread = new Thread(() -> System.out.println("Printed in lambda thread"));
		
		lambdaThread.run();
		
	}

}
