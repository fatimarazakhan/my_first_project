
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/*2. TCP Client-Server Communication
Develop a TCP-based client-server application with the following two main features:
 * Part A: Continuous Chat
   * Establish a connection between a single TCP client and server.
   * Implement a continuous chat, where messages can be sent back and forth.
   * The chat session must continue until the client types and sends the specific command "quit", at which point the connection should close.
 * Part B: File Server Functionality
   * The server must be able to list the file names from its current directory (and send this list to the client).
   * The client must be able to send a command (e.g., "get file [filename.txt]") to request a specific file.
   * Upon receiving a valid file request, the server must read the contents of that file and send the contents back to the client.*/


public class server {             //part A
    public static void main(String[] args) throws Exception {
        ServerSocket ss =new ServerSocket(9090);
        DataInputStream dis;
        DataOutputStream dos;
        System.out.println("Waiting for client");
        Socket s =ss.accept();
        System.out.println("Client connected");
        String msgFromClient;
        String msgFromServer;

        dis = new DataInputStream(s.getInputStream());
        dos = new DataOutputStream(s.getOutputStream());
        msgFromClient=dis.readUTF();
        System.out.println("Client said:\n\t"+msgFromClient);

        String message;

        dis = new DataInputStream(s.getInputStream());
        dos = new DataOutputStream(s.getOutputStream());
        msgFromClient = "";
        while (!msgFromClient.equalsIgnoreCase("quit")) {
            msgFromClient = dis.readUTF();
            System.out.println("Client said:\n\t" + msgFromClient);
            if (msgFromClient.equalsIgnoreCase("quit")) {
                dos.writeUTF("quit");
                System.out.println("Chat ended by the client");
                break;
            }
        }
       
        msgFromServer="Please choose 1 for chat and 2 for File transfer";
        dos.writeUTF(msgFromServer);
        
        msgFromClient=dis.readUTF();
        if(msgFromClient.equalsIgnoreCase("1")){
    msgFromServer = "Welcome to chatBot";
    dos.writeUTF(msgFromServer);
} else if(msgFromClient.equalsIgnoreCase("2")){
    msgFromServer = "Welcome to File Transfer";
    dos.writeUTF(msgFromServer);




}
        msgFromServer="I have received your following message:"+msgFromClient;
        dos.writeUTF(msgFromServer);
        dis.close();
        dos.close();
        s.close();
        ss.close();




        }}
