package edu.es.eoi.whatsapp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.whatsapp.entities.Message;
import edu.es.eoi.whatsapp.repositories.MessageRepositoryJPAImpl;

@Service
public class MessageService {

	@Autowired
	MessageRepositoryJPAImpl repository;

	public Message read(String ref) throws Exception {
		return repository.read(ref);
	}

	public void save(Message e) throws Exception {
		repository.save(e);
	}

	public List<Message> readNonReadedMessages(String ref) {

		List<Message> messages = repository.readMessagesByDestiny(ref);
		
		if(messages!=null&&!messages.isEmpty()) {
			messages=messages.
					stream().
					filter(m -> m.getReaded() == false).
					collect(Collectors.toList());
			
			messages.forEach(m -> {
				m.setReaded(true);
				try {
					repository.save(m);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}		

		return messages;
	}

	public List<Message> readAllReceivedMessages(String ref) {
		return repository.readMessagesByDestiny(ref);
	}

}
