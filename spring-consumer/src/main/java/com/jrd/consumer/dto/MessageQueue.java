package com.jrd.consumer.dto;

public class MessageQueue {
	private String text;

	public MessageQueue() { }		

	public MessageQueue(String text) {		
		this.text = text;
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}