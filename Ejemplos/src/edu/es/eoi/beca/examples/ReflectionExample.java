package edu.es.eoi.beca.examples;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException {
		
		Example objectoDeMiClase= new Example();
		
		Class<? extends Example> objetoDeClassConInfoDeMiClase = objectoDeMiClase.getClass();
		
		System.out.println(objetoDeClassConInfoDeMiClase);
		
		//Obtener el Class directamente de un objeto (Recordatorio: un objeto de tipo String v�lido es un texto entre comillas)
		Class classDelTexto = "Un texto".getClass();

		System.out.println(classDelTexto);
		
		Integer numero = 5;
		Class classDelNumero = numero.getClass();

		System.out.println(classDelNumero);
				
		//Para tipos primitivos tenemos que usar �.class� 
	
		//Tambi�n podemos obtener una clase desde un nombre completamente cualificado (fully-quailified name); esto es, el nombre del paquete donde est� nuestra clase, seguido del nombre de la clase
//		Class c = Class.forName("edu.es.eoi.beca.examples.Example");

//		System.out.println(c);
		
		//Obtener el nombre de la clase
		String nombreDeLaClase = objetoDeClassConInfoDeMiClase.getSimpleName();
		System.out.println(nombreDeLaClase);

		//si queremos ver todos los fields que tiene (publicos)
		
		Field[] campos = objetoDeClassConInfoDeMiClase.getFields();
		
		//Si queremos obtener una variable p�blica
		Field variablePublica = objetoDeClassConInfoDeMiClase.getField("number");
				
		//Si queremos obtener una variable, sea privada o no
		Field variablePrivada = objetoDeClassConInfoDeMiClase.getDeclaredField("text");
		
//		System.out.println(variableInt);
		
		//Si queremos obtener un array con todas las variables p�blicas de nuestra clase
		Field[] todasLasVariables = objetoDeClassConInfoDeMiClase.getFields();

		//Si queremos obtener todas las variables, independientemente de si son privadas o no
		Field[] todasLasVariablesDeclaradas = objetoDeClassConInfoDeMiClase.getDeclaredFields();
		
//		System.out.println(todasLasVariables);
		
		//Obtener funciones
		
		//Si queremos obtener un m�todo p�blico. Si tiene par�metros podremos pasar cada uno de sus tipos.class  en orden despu�s del nombre
		Method metodoGetString = objetoDeClassConInfoDeMiClase.getMethod("getNumero");

		//Si queremos obtener un m�todo, sea privado o no. Si tiene par�metros podremos pasar cada uno de sus tipos.class en orden despu�s del nombre
		Method metodoGetInt = objetoDeClassConInfoDeMiClase.getDeclaredMethod("getTexto");

		//Si queremos obtener un array con todas las variables p�blicas de nuestra clase
		Method[] todosLosMetodos = objetoDeClassConInfoDeMiClase.getMethods();

		//Si queremos obtener todos los m�todos, independientemente de si son privados o no
		Method[] todosLosMetodosDeclarados = objetoDeClassConInfoDeMiClase.getDeclaredMethods();
		
		//Si queremos obtener un array con todos los constructores publicos de nuestra clase
		Constructor[] constructores = objetoDeClassConInfoDeMiClase.getConstructors();

		//Si queremos obtener todos los m�todos, independientemente de si son privados o no
		Constructor[] todosLosConstructores = objetoDeClassConInfoDeMiClase.getDeclaredConstructors();
		
		
		//obtener el valor de una variable
		
		//Si queremos obtener una variable
		Field variableNumero = objetoDeClassConInfoDeMiClase.getField("number");
		double numeroObtenido = (double) variableNumero.get(objectoDeMiClase);
		
		//que pasa con el private???
//		Field variableString = objetoDeClassConInfoDeMiClase.getField("texto");
		//String textoObtenido = (String) variableString.get(objectoDeMiClase);
		
		//tenemos que trampear
		
		Field variableString = objetoDeClassConInfoDeMiClase.getDeclaredField("text");		
		variableString.setAccessible(true);
		String textoObtenido = (String) variableString.get(objectoDeMiClase);
	}

}
