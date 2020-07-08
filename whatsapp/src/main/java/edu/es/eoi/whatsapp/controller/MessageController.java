package edu.es.eoi.whatsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.es.eoi.whatsapp.entities.Message;
import edu.es.eoi.whatsapp.entities.User;
import edu.es.eoi.whatsapp.services.MessageService;

@Controller
public class MessageController {

	@Autowired
	MessageService service;
		
	public Message readMessage(String ref) throws Exception {
		return service.read(ref);			}

	public void save(Message e) throws Exception {		
		service.save(e);
	}	
	
	public List<Message> readNonReadedMessages(User user){			
		return service.readNonReadedMessages(user.getPhone());
	}
	
	public List<Message> readAllReceivedMessages(User user){			
		return service.readAllReceivedMessages(user.getPhone());
	}

}
