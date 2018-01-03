package com.accolite.soap;

import javax.xml.ws.Endpoint;



public class PersonPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9992/ws/person", new PersonImpl());
	}

}
