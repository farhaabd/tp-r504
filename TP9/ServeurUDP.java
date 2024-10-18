import java.io.*;
import java.net.*;

public class ServeurUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket sock = new DatagramSocket(1234);
        while (true) {
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            sock.receive(packet);
            String str = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Message reçu : " + str);

            InetAddress clientAddr = packet.getAddress();
            int clientPort = packet.getPort();
            byte[] dataToSend = str.getBytes();
            DatagramPacket responsePacket = new DatagramPacket(dataToSend, dataToSend.length, clientAddr, clientPort);
            sock.send(responsePacket);
        }
    }
}

