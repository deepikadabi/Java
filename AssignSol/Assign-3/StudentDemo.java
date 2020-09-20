//31.	Create a class Student with 2 data members rno and name. Create one method setData() 
//that takes roll number and student name as parameter and stores them in data members rno and name. 
//Create one more method showData() to print the data member values. Create another class ( main class)
// StudentDemo that creates Student class object and calls setData() and showData() methods.

class Studen{
    public int rno;
   public  String name;
       void setData(final int roln, final String sname) {
           rno = roln;
           name = sname;
       }
       void showData() {
           System.out.println(rno + " " + name+" ");
       }
   }
   class StudentDemo {
       public static void main(final String args[]) {
           Studen e = new Studen();
           e.setData(101,"Deepika");
           e.showData();
       }
   }
   
