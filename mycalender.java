
import java.util.Calendar;
import java.util.Scanner;

public class mycalender {
    public static void main(String[] args) {
        // int year;
        // String month;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
       int year = sc.nextInt();
       System.out.println("enter month(1-12):");
       int month = sc.nextInt();

       String[] monthNames= {"jan","feb","march","apr","may","june","july","aug","sep","oct","nov","dec"};
       
       System.out.println("calender :"+ monthNames[month-1] + ","+year);
       System.out.println("su   mo   tue   wed   thu  fri   sat  ");

        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,1);

        int firstday=cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for(int i=1; i< firstday;i++){
            System.out.print("    ");
        }
        for(int day=1;day<=daysInMonth;day++){
            System.out.printf("%2d"+day);

            if((day+firstday-1)%7==0){
                System.out.println();
            }
System.out.println();
sc.close();
        }
    }
    
}
