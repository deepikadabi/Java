class Employee{
 public int empId;
public  String empName;
private static int total;
    void set(final int id, final String name, int t) {
        empId = id;
        empName = name;
        total = t;
    }
    void show() {
        System.out.println(empId + " " + empName+" "+total);
    }
}
class Method2 {
    public static void main(final String args[]) {
        Employee e = new Employee();
        e.set(101,"Deepika",1);
        e.show();
        Employee e1 = new Employee();
        e1.set(102,"Dabi",2);
        e1.show();
        e.show();
    }
}
