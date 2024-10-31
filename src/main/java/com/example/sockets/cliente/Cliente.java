package com.example.sockets.cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.example.sockets.conexion.Conexion;

public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        Scanner scan = new Scanner(System.in);
        try {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviarán dos mensajes
            String enLinea = "Hello";
            System.out.println("Escribe tu mensaje: ");
            while (!enLinea.equals("")){
                enLinea = scan.nextLine();
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF(String.valueOf(enLinea));
            }
            scan.close();
            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
