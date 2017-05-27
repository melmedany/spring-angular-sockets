package demo.spring.angular.sockets.web.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.spring.angular.sockets.dto.Message;
import demo.spring.angular.sockets.dto.OutputMessage;

@Controller
@RequestMapping("/")
public class ChatController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewApplication() {
		return "index";
	}

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		return new OutputMessage(message, new Date());
	}
}
