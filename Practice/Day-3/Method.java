class Employee{
    private int empId;
    private String empName;
    void set(final int id, final String name) {
        empId = id;
        empName = name;
    }

    void show() {
        System.out.println(empId + " " + empName);
    }
}

class Method {
    public static void main(final String args[]) {
        final Employee e = new Employee();
        e.set(101,"Deepika");
        e.show();
    }
}
