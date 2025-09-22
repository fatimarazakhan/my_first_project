
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileread {
    public static void main(String[] args) {
    

 try { 
       File myfile=new File("class1.java");
       Scanner reader = new Scanner(myfile);
        while( reader.hasNextLine()){
        String line  =  reader.nextLine();
        System.out.println(line);
    }
    reader.close();
    Launchfile("class1.java");
} 
    catch(FileNotFoundException e ){
        System.out.println("no file available");  
    }

}

  public static void Launchfile(String path){
       try{
        File file = new File(path);
        Desktop.getDesktop().open(file);
    }
    catch (Exception e){
        System.out.println("File not found");
    }
    }
}
