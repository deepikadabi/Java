class Employee{
	private int empId;
	private String empName;
	private static int total;
	void set(int id, String name,int t){
		empId = id;
		empName = name;
		total = t;
	}
	void show(){
		System.out.println(empId+" "+empName+" "+total);
	}
}
class EmployeeDemo2{
	public static void main(String args[]){
		Employee e = new Employee();
		e.set(101,"ram",1);
		e.show();
		Employee e1 = new Employee();
		e1.set(102,"shiv",2);
		e1.show();
		e.show();
	}
}