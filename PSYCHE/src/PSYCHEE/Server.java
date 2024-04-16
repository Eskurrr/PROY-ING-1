package PSYCHEE;

import java.io.IOException;


//Clase principal que hará uso del servidor
public class Server {
	public static void main(String[] args) throws IOException  {
		ServerC serv = new ServerC(); //Se crea el servidor

		System.out.println("Iniciando servidor\n");
		serv.startServer(); //Se inicia el servidor
	}
}