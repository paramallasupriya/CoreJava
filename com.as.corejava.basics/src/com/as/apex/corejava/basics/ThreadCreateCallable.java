package com.as.apex.corejava.basics;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadCreateCallable implements Callable<String> {

	    @Override
	    public String call() throws Exception {

	        System.out.println("Current thread:" + Thread.currentThread().getName());
	        return  "The result returned by the thread!";

	    }

	    public static void main(String[] args) throws Exception{

	        //1. Create a Callable interface implementation class and implement the call method
	    	ThreadCreateCallable threeThread = new ThreadCreateCallable();
	        //2. Use FutureTask to wrap Callable objects
	        FutureTask<String> result = new FutureTask<>(threeThread);
	        //3. Use FutureTask as the target of the Thread object to create threads
	        new Thread(result).start();
	        //4. Call the get method of the FutureTask object to obtain the return value after the execution of the child thread ends
	        //  Obtaining the operation result is a synchronous process, that is, the call method is executed to obtain the result
	        System.out.println(result.get());

	    }

	}