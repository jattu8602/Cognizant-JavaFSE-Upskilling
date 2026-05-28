import java.io.*;
import java.net.*;

/**
 * Exercise 35: TCP Chat Client
 * Run after TcpChatServer.
 */
public class TcpChatClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 6666);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String clientMsg, serverMsg;
        while (true) {
            System.out.print("You: ");
            clientMsg = br.readLine();
            dos.writeUTF(clientMsg);
            if (clientMsg.equalsIgnoreCase("bye")) break;
            serverMsg = dis.readUTF();
            System.out.println("Server: " + serverMsg);
            if (serverMsg.equalsIgnoreCase("bye")) break;
        }
        s.close();
    }
}
