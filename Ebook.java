 
 /*  1. EBookInfo Class
Implement an EBookInfo class and a main program to perform the following:
 * Class: Create an EBookInfo class.
 * Object: In a separate "implementer" or main class, create an object of the EBookInfo class.
 * Methods: The class should include methods to:
   * Display the book's details (e.g., title, author).
   * Read the book's content from a file and display it in the console/terminal.
   * Save or display the book's content as a PDF file.
   * Display or open the book's content in Notepad (e.g., by launching it with the text file).   */

import java.io.*;
import java.util.Scanner;

         class EBookInfo {        

       String title,author;
       int year;

       EBookInfo(String title,String author,int year ){
        this.title=title;
        this.author = author;
        this.year = year;
       }
       void displaydetails(){               //displaying details
      System.out.println("title:"+title);
      System.out.println("author:"+author);
      System.out.println("year:"+year);
       }
    
    void handleFile(){
        try{
    File myfile = new File("ebook.txt");  // creating file
    
        myfile.createNewFile();
    
   FileWriter writer = new FileWriter("ebook.txt");    // writting content
    writer.write(" hi this is the ebook content");
    writer.close();

    Scanner sc =new Scanner( new File("ebook.txt"));    //reading
    while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
    } 
    sc.close();
}
    catch (IOException e){
        System.out.println("file not found");
    }}
    void saveaspdf(){

    try{
    FileOutputStream out = new FileOutputStream("ebook.txt.pdf");  // save as pdf
    out.write("heres the ebook content..........".getBytes());  //.getbytesimppp
    out.close();
   } 
   catch(IOException e){
        System.out.println("unable to find");
    }}
  void saveinnotepad(){


try{
    Runtime.getRuntime().exec("notepad ebook.txt");    //save in notepad
}catch(IOException e){
    System.out.println("unable to find");
}}
         }
public class Ebook{
    public static void main(String[] args) { 
         EBookInfo b = new EBookInfo("nimal","fatima",2002);   //object

        b.displaydetails();
        b.handleFile();
        b.saveaspdf();
        b.saveinnotepad();
        
    }
}

    
  
    

