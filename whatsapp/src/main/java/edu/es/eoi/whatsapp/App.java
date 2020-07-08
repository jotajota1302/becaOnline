package edu.es.eoi.whatsapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.es.eoi.whatsapp.controller.MessageController;
import edu.es.eoi.whatsapp.controller.UserController;
import edu.es.eoi.whatsapp.entities.Message;
import edu.es.eoi.whatsapp.entities.User;

public class App {

	public static void main(String[] args) throws Exception {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);	
//		MyRepository<User> userRepository=context.getBean(UserRepositoryJPAImpl.class);
//		MyRepository<Message> messageRepository=context.getBean(MessageRepositoryJPAImpl.class);
		
//		userRepository.save(new User("12345678", "user1"));
//		userRepository.save(new User("87654321", "user2"));
		
//		Message m1= new Message();
//		m1.setContent("Mensaje de usuario 2");
//		m1.setDate(Calendar.getInstance().getTime());
//		m1.setOrigin(userRepository.read("12345678"));
//		m1.setDestiny(userRepository.read("87654321"));
		
//		messageRepository.save(m1);
	
		
		MessageController messageController=context.getBean(MessageController.class);
		UserController userController=context.getBean(UserController.class);		
		User user= context.getBean(User.class);
		
		//no es necesario los mensajes ya viene en el user que tienes arriba
		List<Message> all=messageController.readAllReceivedMessages(user);
		
		List<Message> received=messageController.readNonReadedMessages(user);
		
		System.out.println("Todos los mensajes");
		for (Message message : all) {
			System.out.println("from: " +message.getDestiny().getPhone()+" time: " +message.getDate()+": "+message.getContent());
		}
		System.out.println("***************************************");
		System.out.println("Mensajes no leidos");		
		for (Message message : received) {
			System.out.println("from: " +message.getDestiny().getPhone()+" time: " +message.getDate()+": "+message.getContent());
		}
		System.out.println("***************************************");
	}

}
