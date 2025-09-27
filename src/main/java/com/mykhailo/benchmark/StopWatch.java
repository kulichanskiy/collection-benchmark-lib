package com.mykhailo.benchmark;


public class StopWatch {
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		this.startTime = System.nanoTime();
		this.endTime = this.startTime;
	}
	
	public void start() {
		this.startTime = System.nanoTime();
	}
	
	public void stop() {
		this.endTime = System.nanoTime();
	}
	
	public double getElapsedTime() {
		return (endTime - startTime) / 1.00;
	}
}

