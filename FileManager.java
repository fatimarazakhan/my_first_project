import java.io.*;

public class FileManager {

    // Return list of files
    public String getFileList() {
        File folder = new File(".");
        File[] files = folder.listFiles();
        StringBuilder sb = new StringBuilder();

        for (File f : files) {
            if (f.isFile()) sb.append(f.getName()).append("\n");
        }
        return sb.toString();
    }

    // Return file content
    public String readFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            return sb.toString();

        } catch (Exception e) {
            return "File not found!";
        }
    }
}
