 import java.io.*;
import java.net.*;

public class client1_5 {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 5000);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Receive file listtt
            System.out.println("Files on server:");
            System.out.println(in.readLine());

            // Sendsss file name to serverh
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter filename: ");
            String file = userInput.readLine();
            out.println(file);

            // Receive file content
            System.out.println("\nFile Content:");
            System.out.println(in.readLine());

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
