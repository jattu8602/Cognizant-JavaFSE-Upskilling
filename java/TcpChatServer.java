import java.io.*;
import java.net.*;

/**
 * Exercise 35: TCP Chat Server
 * Run this first, then TcpChatClient in another terminal.
 */
public class TcpChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("Server waiting on port 6666...");
        Socket s = ss.accept();
        System.out.println("Client connected.");
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String clientMsg, serverMsg;
        while (true) {
            clientMsg = dis.readUTF();
            System.out.println("Client: " + clientMsg);
            if (clientMsg.equalsIgnoreCase("bye")) break;
            System.out.print("You: ");
            serverMsg = br.readLine();
            dos.writeUTF(serverMsg);
            if (serverMsg.equalsIgnoreCase("bye")) break;
        }
        s.close();
        ss.close();
    }
}
