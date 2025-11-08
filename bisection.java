
import java.util.Scanner;


//Implement an algorithm to find the root of an equation using the Bisection Method.
// Ek function f(x) banao
// Do numbers a aur b lekar interval fix karo
// Bisection method apply karo
// Mid find karo
// Check karo root ka side
// Interval ko half karte jao
// Jab answer exact ho jaye → root print kar do

public class bisection {

    static double f(double x){
       return x*x*x-x-2;
    }
    public static void main(String[] args) {
        double a;
        double b ;
        double mid =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter right number:");
        a =sc.nextInt();
        System.out.println("enter left number:");
        b = sc.nextInt();

        while((b-a)>=0.0001){   //jab tak loop chalao jab tak o.o value na ajae
 
         mid = (a+b)/2;
        double fmid=f(mid);
          if (f(a) * fmid < 0) {    
                b = mid;              // root left side me hai
            } 
            else {
                a = mid;              // root right side me hai
            }
        }

        System.out.println("Root ≈ " + mid);
    }
}


















