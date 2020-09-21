class Employee{
	private int empId;
	private String empName;
	void set(int id, String name){
		empId = id;
		empName = name;
	}
	void show(){
		System.out.println(empId+" "+empName);
	}
}
class EmployeeDemo1{
	public static void main(String args[]){
		Employee e = new Employee();
		e.set(101,"ram");
		e.show();
		Employee e1 = new Employee();
		e1.set(102,"shiv");
		e1.show();
	}
}