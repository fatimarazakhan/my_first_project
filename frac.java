
import java.util.Scanner;
//class
public class frac {
   int num1, num2;
    int den1,den2;
    //constructor
    public frac(int num1,int num2,int den1,int den2){
      this.num1=num1;
      this.num2=num2;
      this.den1=den1;
      this.den2=den2;
      
    }
    //method that retuen the value as fraction through the use of string and +
    public String multiply(){
    int numer=num1*num2;
    int deno=den1*den2;
    return(numer+"/"+deno);
    }
    //addition method
    public String add(){
     int  adnum1=num1*den2;
     int  adnum2=num2*den1;
      int finalnum=adnum1+adnum2;
      int finalden=den1*den2;
      return ( finalnum+ "/"+finalden);

    }
    
    public static void main(String []args){
 
 System.out.println("enter two numerators");
 Scanner sc=new Scanner(System.in);
 int num1=sc.nextInt();
 int num2=sc.nextInt();
 System.out.println("enter two denominator");
 int den1=sc.nextInt();
 int den2=sc.nextInt();

 System.out.println("do you want to add or multiply the two functions?");
 String result;
 //object creation
 frac Fraction=new frac( num1,num2,den1,den2);
String Choice=sc.next();
 switch (Choice.toLowerCase()) {
     case "add":
     result =Fraction.add();
         
         break;
         case "multiply":
         result=Fraction.multiply();
     break;


     default:
         result = "invalid choice";

 }
 //obj creation for fraction


System.out.println("the answer is :"+result);


    }
    }
    
