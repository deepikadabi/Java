class Employee{
 public int empId;
public String empName;
    void set(final int id, final String name) {
        empId = id;
        empName = name;
    }

    void show() {
        System.out.println(empId + " " + empName);
    }
}

class Method1 {
    public static void main(final String args[]) {
        Employee e = new Employee();
        e.set(101,"Deepika");
        e.show();
        Employee e1 = new Employee();
        e1.set(102,"Dabi");
        e1.show();
    }
}
