import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the port to connect to the server");
        Scanner sc = new Scanner(System.in);
        int port = sc.nextInt();
        Socket s = new Socket("localhost", port);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        int encodedKey = dis.readInt();
        int decodedKey = (encodedKey - 3) << 2;
        dos.writeInt(decodedKey); 
        boolean verified = dis.readBoolean();
if (!verified) {
    System.out.println("Verification failed. Connection closed by server.");
    s.close();
    dis.close();
    dos.close();
    sc.close();
    return;
}

        String msgFromServer;
        String msgSent = "";
       
        System.out.println("Connected to server at port: " + port);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("You: ");
            msgSent = br.readLine();
            dos.writeUTF(msgSent);
            dos.flush();

            if (msgSent.equalsIgnoreCase("quit")) {
                System.out.println("You ended the chat.");
                break;
            }

            msgFromServer = dis.readUTF();
            if (msgFromServer.equalsIgnoreCase("quit")) {
                System.out.println("Server ended the chat.");
                break;
            }

            

            System.out.println("Server: " + msgFromServer);
        }

        br.close();
        s.close();
        dis.close();
        dos.close();
        sc.close();
    }
}
    
