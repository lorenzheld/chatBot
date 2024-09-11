package org.bbw.ch;

import java.util.HashMap;
import java.util.Map;

/**
 * The responder class represents a response generator object. It is
 * used to generate an automatic response.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.1  (1.Feb.2002)
 */
public class Responder {

	private Map<String, String> responseMap;


	
	/**
	 * Construct a Responder - nothing to do
	 */
	public Responder() {

		responseMap = new HashMap<>();
		fillResponseMap();
	}

	private void fillResponseMap() {
		responseMap.put("slow", "I think this has to do with your hardware. Upgrading your processor should solve all performance problems. Have you got a problem with our software?");
		responseMap.put("bug", "well, I dont know either");
		responseMap.put("weather", "The weather is looking great today!");
		responseMap.put("hello", "Hello! How can I assist you today?");
		responseMap.put("bye", "Goodbye! Have a nice day!");
		responseMap.put("help", "I am here to help you. What do you need?");
		// Add more responses as needed
	}
	

	/**
	 * Generate a response.
	 * @return   A string that should be displayed as the response
	 */
	public String generateResponse(String input) {
		for (String key : responseMap.keySet()) {
			if (input.toLowerCase().contains(key)) {
				return responseMap.get(key);
			}
		}
		return "That sounds interesting. Tell me more...";
	}
	
}
