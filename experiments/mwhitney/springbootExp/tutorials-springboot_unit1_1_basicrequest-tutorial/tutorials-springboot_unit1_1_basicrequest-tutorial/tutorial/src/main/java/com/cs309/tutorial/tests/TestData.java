package com.cs309.tutorial.tests;

public class TestData {
	
	private String message;
	
	public TestData() {}
	
	public TestData(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public String updateMessage(String message) {
		this.message = message;
		return this.message;
	}
}
