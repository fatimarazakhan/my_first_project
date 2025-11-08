/*(The Person, Student, Employee, Faculty, and Staff classes)
Design a class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and email address. 
A student has a class status (First Year, Second Year, Third Year, Final Year). Define the status as a constant.
An employee has an office, salary. A faculty member has office hours and a rank. A staff member has a title. 
Override the toString method in each class to display the class name and the person's name.
Draw the UML diagram for the classes and implement them. Write a test program that creates a
Person, Student, Employee, Faculty, and Staff, and Invokes their toString() methods.  */

// public class FinalOop{

    class Person{
        String name;
        String address;
        int phoneNo;
        String email;

        public Person(String name, String address,int phoneNo,String email) { 
       this.name= name;
       this.address= address;
       this.phoneNo = phoneNo;
       this.email=email;

        }

    public String toString(){
        return "person:"+name;
    }

    }
    
        class Student extends Person{
        public static final String first_year = "first year";
        public static final String second_year= "secondyear";
        public static final String third_year= "third year";
        public static final String fourth_year= "fourth year";
    

            String classStatus;
            public Student(String name, String address, int phoneNo, String email, String classStatus) {
        super(name, address, phoneNo, email);
        this.classStatus = classStatus;

}
            
      public String toString(){
        return "Student:"+name;
      }

        }
        class Employee extends Person{
            String office;
            double salary;

            public Employee(String name, String address, int phoneNo, String email, String office, double salary) {
        super(name, address, phoneNo, email);
        this.office = office;
        this.salary = salary;
    }


         public String toString(){
        return "Employee:"+name;
         }
        }
       class Faculty extends Employee{ 
        double officeHours;
        String rank;

     public Faculty(String name, String address, int phoneNo, String email, String office, double salary, double officeHours, String rank) {
        super(name, address, phoneNo, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }


        public String toString(){
        return "faculty:"+name;
        }

       }
       class Staff extends Employee{
        String title;
        public Staff(String name, String address, int phoneNo, String email, String office, double salary, String title) {
        super(name, address, phoneNo, email, office, salary);
        this.title = title;
    }


    public String toString(){
        return "Staff:"+name;

    }
       }
public class finaloop{
    public static void main(String[] args) {
        Person p1 = new Person("Ali", "Karachi", 123456789, "ali@example.com");
        Student s1 = new Student("Sara", "Lahore", 987654321, "sara@example.com", Student.first_year);
        Employee e1 = new Employee("dua", "Islamabad", 123123123, "usman@example.com", "Office 101", 85000);
        Faculty f1 = new Faculty("fatima", "Multan", 321321321, "aisha@example.com", "Office 202", 120000, 6, "Professor");
        Staff st1 = new Staff("Zain", "Quetta", 111222333, "zain@example.com", "Office 303", 70000, "Administrator");

        // 🔹 Invoking toString() methods
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(e1.toString());
        System.out.println(f1.toString());
        System.out.println(st1.toString());
    }


}
       