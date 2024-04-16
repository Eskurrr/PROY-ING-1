package EROSS;

import java.io.IOException;

//Clase principal que hará uso del cliente
public class Client {
	public static void main(String[] args) throws IOException {
		ClientC cli = new ClientC(); //Se crea el cliente

		System.out.println("Iniciando cliente\n");
		cli.startClient(); //Se inicia el cliente
	}
}