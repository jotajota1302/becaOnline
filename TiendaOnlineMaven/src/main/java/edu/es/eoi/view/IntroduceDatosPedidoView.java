package edu.es.eoi.view;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import edu.es.eoi.App;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.entity.Persona;

public class IntroduceDatosPedidoView {

	public static void imprimir() throws Exception {

		System.out.println("Introduce tu informacion : ");

		// TODO Pedir los datos de la persona y realizar e inicializar el pedido

		byte[] array = new byte[9];
		new Random().nextBytes(array);
		String pedido_id = new String(array, Charset.defaultCharset());
		new Random().nextBytes(array);
		String persona_id = new String(array, Charset.defaultCharset());
		
		Pedido pedido = new Pedido();
		pedido.setFecha(Calendar.getInstance().getTime());
		pedido.setReferencia(pedido_id);

				
		Persona persona = new Persona();
		persona.setPedidos(new ArrayList<Pedido>());
		persona.setNif(persona_id);
		persona.setPassword("password");
		persona.setUsername("username");

		pedido.setPersona(persona);
		persona.getPedidos().add(pedido);

		App.pedidoController.alta(pedido);

	}

}
