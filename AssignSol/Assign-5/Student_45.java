//45.- Create a class Student with two members : rollno and percentage. Create default and 
//    parameterized constructors. Create method show() to display information. 
import java.util.Scanner;
class Student{
    String rollno;
    int percentage;

    Student(){}
    Student(String rollno, int percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show(){
        System.out.print(" RollNo : "+rollno+ "; Percentage : "+percentage+" % ; ");
    }
    void input(){
        System.out.println("Enter RollNo , Percentage  : ");
        Scanner sc = new Scanner(System.in);
        this.rollno = sc.next();
        this.percentage = sc.nextInt();

    }
}

// --  Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and 
//  parameterized constructors. Also override show() method that calls super class show() method and displays 
//  semester.

class CollegeStudent extends Student{
    int semester;
    CollegeStudent(){}
    CollegeStudent(String rollno, int percentage, int semester){
        super(rollno, percentage);        
        this.semester = semester;
    }
    void show(){
        super.show();
        System.out.println(" Semester : "+semester+ "; ");
       
    }
    void input(){
        super.input();
        System.out.println("Enter Semester : ");
        Scanner sc = new Scanner(System.in);
        this.semester = sc.nextInt();

    }
}

// - Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to
//  it. Create default and parameterized constructors. Also override show()  method that calls super class show() 
//  method and displays className. 

class SchoolStudent extends Student{
    int className;
    SchoolStudent(){}
    SchoolStudent(String rollno, int percentage, int className){
        super(rollno, percentage);        
        this.className = className;
    }
    void show(){
        super.show();
        System.out.println(" Class : "+className+ "; ");

    }
    void input(){
        super.input();
        System.out.println("Enter Class : ");
        Scanner sc = new Scanner(System.in);
        this.className = sc.nextInt();

    }
}

// - Create a class( say Demo) with main method that carries out the operation of the project : 
//  -- has array to store objects of any class(Student, CollegeStudent or SchoolStudent) 
//  --create two CollegeStudent  and three SchoolStudent objects and store them inside the array 
//  -- display all records from the array 
//  -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. 
//  --count how many students are having A grade, if for A grade percentage >75. 

public class Student_45 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[5];
        System.out.println("Enter Values for College Student : ");
        for(int i = 0; i<2 ; i++)
        {
            CollegeStudent c = new CollegeStudent();
            c.input();
            arr[i] = c;
           // c.show();
        }

        System.out.println("Enter Values for School Student : ");

        for(int i=2; i<5; i++){
            SchoolStudent s = new SchoolStudent();
            s.input();
            arr[i] = s;
           // s.show();
        }

        for(Student a : arr)
            a.show();

        int scount = 0;
        int ccount = 0;
        
            
        for(Student a : arr)
        {
            System.out.println("Enter Roll No to check : ");
            String s = sc.next(); 

            if(a.rollno.charAt(0)== s.charAt(0) && s.charAt(0) == 'c')
            {
                if(a.rollno.equals(s))       //a.rollno.equals(s);
                {
                    System.out.println(s+" is a College Student;");
                    if(a.percentage >= 75)
                        ccount++;
                }
                else
                   System.out.println("Not a College Student;");
            }
            if(a.rollno.charAt(0)=='s' && s.charAt(0) == 's')
            {
                if(a.rollno.equals(s)) {
                System.out.println(s+" is a School Student; ");
                if(a.percentage >= 75)
                    scount++;
                }
                else
                   System.out.println("Not a School Student;");
            }
        }

        System.out.println("School Student with A+ grade are : "+scount);
        System.out.println("College Student with A+ grade are : "+ccount);
        
    }
    
}
