package PSYCHEE;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connect {
 protected final int port = 1888;
 protected final String host = "192.168.3.93";
 protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
 protected ServerSocket ss; //Socket del servidor
 protected Socket cs; //Socket del cliente
 protected DataOutputStream salidaServidor, salidaCliente; //Flujo de datos de salida

 public Connect(String tipo) throws IOException {
     if(tipo.equalsIgnoreCase("servidor"))
     {
         ss = new ServerSocket(port);//Se crea el socket para el servidor en puerto 1234
         cs = new Socket(); //Socket para el cliente
     }
     else
     {
         cs = new Socket(host, port); //Socket para el cliente en localhost en puerto 1234
     }
 }

}
