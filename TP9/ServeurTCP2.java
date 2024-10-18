import java.io.*;
import java.net.*;

public class ServeurTCP2 {
    public static void main(String[] args) {
        try {

            ServerSocket socketserver = new ServerSocket(5000);
            System.out.println("Serveur en attente de connexions...");

            while (true) { 
                Socket socket = socketserver.accept();
                System.out.println("Connexion acceptée");


                DataInputStream dIn = new DataInputStream(socket.getInputStream());


                String messageRecu = dIn.readUTF();
                System.out.println("Message reçu: " + messageRecu);


                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

