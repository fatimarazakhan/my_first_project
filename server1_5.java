import java.io.*;
import java.net.*;

public class server1_5 {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server running...");

            Socket socket = server.accept();
            System.out.println("Client connected.");

            FileManager fm = new FileManager();

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Step 1: Send file list
            out.println(fm.getFileList());

            // Step 2: Receive filename
            String filename = in.readLine();

            // Step 3: Send file content
            out.println(fm.readFile(filename));

            socket.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
