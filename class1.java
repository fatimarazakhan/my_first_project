import java.util.Scanner;
public class class1 {
    public static void main(String[] args) {
        
        float[][] sales={
        { 530, 1035 , 304 , 220,258,546},
        {820 , 945 , 192 , 60 , 0 , 966},
        {118 , 1230, 568, 200, 96, 840},
        { 660, 270, 392, 230, 920, 1386}
        };
        String repID[]={ "E011","E012","E013","E014"};
        String products[]={"product-A","product-B","product-C","product-D","product-E","product-F"};
        System.out.println("select any one:");
        System.out.println(" 1: repID");
        System.out.println("2: products");
        Scanner sc=new Scanner(System.in);
        int user = sc.nextInt();
        if(user == 1){
            for( int i=0;i<repID.length;i++){
            System.out.println((i+1)+":"+repID[i]);
            }
            System.out.println("select rep id number:");
            int selectedRepNum=sc.nextInt();
            int repIndex=selectedRepNum-1;
              
            float totalsales=0;
            System.out.println("sales of "+repID[repIndex]+".");
            
            for( int i=0;i<sales[repIndex].length;i++){
             totalsales += sales[repIndex][i];
                System.out.println(products[i]+ ": $"+sales[repIndex][i]);
            }
            System.out.println("total sales: $"+ totalsales);
            }
        else if( user ==2){

                 System.out.println("available products are:\n");
            for( int i=0;i<products.length;i++){
            System.out.println(i+1+":"+" "+products[i]); 
        }
        
            int selectedProdNum=sc.nextInt();
            int productIndex=selectedProdNum-1;
             
            float totalsales=0;
            
            for( int i=0;i<sales[productIndex].length;i++){
                totalsales += sales[i][productIndex];
                System.out.println(repID[i]+ ": $"+sales[i][productIndex]);
            }
            System.out.println("total sales:"+(productIndex+1)+"is $" +totalsales);
            }
            else{
                System.out.println("invalid number.");
            }
        sc.close();
    }
}


    