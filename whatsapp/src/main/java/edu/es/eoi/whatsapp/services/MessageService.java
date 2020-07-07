package edu.es.eoi.whatsapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.whatsapp.entities.Message;
import edu.es.eoi.whatsapp.repositories.MessageRepositoryJPAImpl;

@Service
public class MessageService {

	@Autowired
	MessageRepositoryJPAImpl repository;
		
	public Message read(String ref) throws Exception {
		return repository.read(ref);			}

	public void save(Message e) throws Exception {		
		repository.save(e);
	}	
	
	public List<Message> readMessagesByDestiny(String ref) {	
		return repository.readMessagesByDestiny(ref);
	}

}
