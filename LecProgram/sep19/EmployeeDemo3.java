class Employee{
	private int empId;
	private String empName;
	void set(int id, String name,int t){
		empId = id;
		empName = name;
	}
	void show(){
		System.out.println(empId+" "+empName);
	}
}
class EmployeeDemo3{
	public static void main(String args[]){
		Employee e = new Employee();
		e.set(101,"ram",1);
		e.show();
	}
}