package com.example.rest_service_cors;

public record Greeting(long id, String content) {

	public Greeting() {
		this(-1, "");
	}
}