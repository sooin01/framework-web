package com.my.app.web.websocket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.app.web.websocket.dto.Greeting;
import com.my.app.web.websocket.dto.HelloMessage;

@Controller
public class WebSocketController {
	
	Logger logger = LoggerFactory.getLogger(WebSocketController.class);

	@RequestMapping(value = "/websocket/websocket", method = RequestMethod.GET)
	public String websocket() {
		return "websocket/websocket";
	}
	
	@MessageMapping("/hello")
    @SendTo("/res/greetings")
	public Greeting websocket(HelloMessage helloMessage) {
		this.logger.info("메시지: {}", helloMessage);
		return new Greeting("Hello, " + helloMessage.getName() + "!");
	}
	
}
