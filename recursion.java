
import java.util.Scanner;

public class recursion {

//    static int fabonacci(int n){
//     if (n<=1){
//         return 1;
//     }
//       return   fabonacci(n-1)+fabonacci(n-2);
//     }
   

//   public static void main(String[] args) {

//  System.out.println("enter n number ");


//      Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//    System.out.println("fabonacci:" + fabonacci(n));
    
//   }
////////////////////////////////////////////GREATEST COMMON DIVISOR/////////////////
// static int gcd(int m ,int n){
//     if(n==0){
//         return m;

//     }
//     else{
//         return gcd(n,m%n);
//     }

// }
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);

//     System.out.println("enter any number:");
//     int n = sc.nextInt();
//     System.out.println("enter another number ");
//     int m = sc.nextInt();
//    System.out.println("recursion:"+gcd(n,m));
// }
// }
////////////////////////////  MAX OF AN ARRAY //////////////// 
  
static int maxarray(int n , int[]arr){
    if(n==1){
        return arr[0];
    }
    int max_num = maxarray(n-1,arr);
    if( arr[n-1] > max_num ){
        return arr[n-1];
    }
    else{
        return max_num;

    }

} public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = maxarray(size,arr);  // recursive call
        System.out.println("Maximum element in the array is: " + max);

        sc.close();
    }

}

   

    

