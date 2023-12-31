package com.quote.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ChatGptRequest {

	private String model;
	private List<Message> messages;
	/**
	 * @param mode
	 * @param messages
	 */
	public ChatGptRequest(String model, String prompt) {
		super();
		this.model = model;
		this.messages = new ArrayList<>();
		
		this.messages.add(new Message("user", prompt));
	}
	
	
}
